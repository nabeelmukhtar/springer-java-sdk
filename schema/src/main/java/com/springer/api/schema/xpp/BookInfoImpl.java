package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BookCopyright;
import com.springer.api.schema.BookInfo;
import com.springer.api.schema.BookSubjectGroup;
import com.springer.api.schema.BookTitle;
import com.springer.api.schema.SeriesID;
public class BookInfoImpl extends BaseSchemaEntity implements BookInfo {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String bookID;
    protected BookTitleImpl bookTitle;
    protected Long bookSequenceNumber;
    protected String bookDOI;
    protected Long bookTitleID;
    protected String bookPrintISBN;
    protected String bookElectronicISBN;
    protected Long bookChapterCount;
    protected BookCopyrightImpl bookCopyright;
    protected BookSubjectGroupImpl bookSubjectGroup;
    protected SeriesIDImpl bookContext;
    protected String bookProductType;
    protected String containsESM;
    protected String language;
    protected String mediaType;
    protected String numberingStyle;
    protected String outputMedium;
    protected Long tocLevels;
    public String getBookID() {
        return bookID;
    }
    public void setBookID(String value) {
        bookID = ((String) value);
    }
    public BookTitle getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(BookTitle value) {
        bookTitle = ((BookTitleImpl) value);
    }
    public Long getBookSequenceNumber() {
        return bookSequenceNumber;
    }
    public void setBookSequenceNumber(Long value) {
        bookSequenceNumber = ((Long) value);
    }
    public String getBookDOI() {
        return bookDOI;
    }
    public void setBookDOI(String value) {
        bookDOI = ((String) value);
    }
    public Long getBookTitleID() {
        return bookTitleID;
    }
    public void setBookTitleID(Long value) {
        bookTitleID = ((Long) value);
    }
    public String getBookPrintISBN() {
        return bookPrintISBN;
    }
    public void setBookPrintISBN(String value) {
        bookPrintISBN = ((String) value);
    }
    public String getBookElectronicISBN() {
        return bookElectronicISBN;
    }
    public void setBookElectronicISBN(String value) {
        bookElectronicISBN = ((String) value);
    }
    public Long getBookChapterCount() {
        return bookChapterCount;
    }
    public void setBookChapterCount(Long value) {
        bookChapterCount = ((Long) value);
    }
    public BookCopyright getBookCopyright() {
        return bookCopyright;
    }
    public void setBookCopyright(BookCopyright value) {
        bookCopyright = ((BookCopyrightImpl) value);
    }
    public BookSubjectGroup getBookSubjectGroup() {
        return bookSubjectGroup;
    }
    public void setBookSubjectGroup(BookSubjectGroup value) {
        bookSubjectGroup = ((BookSubjectGroupImpl) value);
    }
    public SeriesID getBookContext() {
        return bookContext;
    }
    public void setBookContext(SeriesID value) {
        bookContext = ((SeriesIDImpl) value);
    }
    public String getBookProductType() {
        return bookProductType;
    }
    public void setBookProductType(String value) {
        bookProductType = ((String) value);
    }
    public String getContainsESM() {
        return containsESM;
    }
    public void setContainsESM(String value) {
        containsESM = ((String) value);
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String value) {
        language = ((String) value);
    }
    public String getMediaType() {
        return mediaType;
    }
    public void setMediaType(String value) {
        mediaType = ((String) value);
    }
    public String getNumberingStyle() {
        return numberingStyle;
    }
    public void setNumberingStyle(String value) {
        numberingStyle = ((String) value);
    }
    public String getOutputMedium() {
        return outputMedium;
    }
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    public Long getTocLevels() {
        return tocLevels;
    }
    public void setTocLevels(Long value) {
        tocLevels = ((Long) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("BookID")) {
                setBookID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookTitle")) {
                BookTitleImpl node = new BookTitleImpl();
                node.init(parser);
                setBookTitle(node);
            } else if (name.equals("BookSequenceNumber")) {
                setBookSequenceNumber(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookDOI")) {
                setBookDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookTitleID")) {
                setBookTitleID(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookPrintISBN")) {
                setBookPrintISBN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookElectronicISBN")) {
                setBookElectronicISBN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookChapterCount")) {
                setBookChapterCount(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookCopyright")) {
                BookCopyrightImpl node = new BookCopyrightImpl();
                node.init(parser);
                setBookCopyright(node);
            } else if (name.equals("BookSubjectGroup")) {
                BookSubjectGroupImpl node = new BookSubjectGroupImpl();
                node.init(parser);
                setBookSubjectGroup(node);
            } else if (name.equals("BookContext")) {
                SeriesIDImpl node = new SeriesIDImpl();
                node.init(parser);
                setBookContext(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setBookProductType(XppUtils.getAttributeValueFromNode(parser, "BookProductType"));
        setContainsESM(XppUtils.getAttributeValueFromNode(parser, "ContainsESM"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setMediaType(XppUtils.getAttributeValueFromNode(parser, "MediaType"));
        setNumberingStyle(XppUtils.getAttributeValueFromNode(parser, "NumberingStyle"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        setTocLevels(XppUtils.getAttributeValueAsLongFromNode(parser, "TocLevels"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
