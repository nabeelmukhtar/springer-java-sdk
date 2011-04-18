package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Caption;
import com.springer.api.schema.ISXN;
import com.springer.api.schema.Image;
import com.springer.api.schema.Subjects;
import com.springer.api.schema.Table;
public class ImageImpl extends BaseSchemaEntity implements Image {
    private final static long serialVersionUID = 2461660169443089969L;
    protected CaptionImpl caption;
    protected List<Object> fileAndFullTextAndLocation;
    protected TableImpl table;
    protected List<Object> articleTitleAndAuthorsAndDOI;
    protected Long chapterId;
    protected Long bookTitleId;
    protected String bookDOI;
    protected ISXNImpl isxn;
    protected String subjectCollection;
    protected SubjectsImpl subjects;
    protected List<Object> copyrightHolderAndKeywordsAndOpenAccess;
    protected String imageType;
    protected String articleURI;
    protected String provider;
    protected XMLGregorianCalendar dateLoaded;
    protected String id;
    protected String language;
    protected String lang;
    public Caption getCaption() {
        return caption;
    }
    public void setCaption(Caption value) {
        caption = ((CaptionImpl) value);
    }
    public List<Object> getFileAndFullTextAndLocation() {
        if (fileAndFullTextAndLocation == null) {
            fileAndFullTextAndLocation = new ArrayList<Object>();
        }
        return this.fileAndFullTextAndLocation;
    }
    public void setFileAndFullTextAndLocation(List<Object> value) {
        this.fileAndFullTextAndLocation = value;
    }
    public Table getTable() {
        return table;
    }
    public void setTable(Table value) {
        table = ((TableImpl) value);
    }
    public List<Object> getArticleTitleAndAuthorsAndDOI() {
        if (articleTitleAndAuthorsAndDOI == null) {
            articleTitleAndAuthorsAndDOI = new ArrayList<Object>();
        }
        return this.articleTitleAndAuthorsAndDOI;
    }
    public void setArticleTitleAndAuthorsAndDOI(List<Object> value) {
        this.articleTitleAndAuthorsAndDOI = value;
    }
    public Long getChapterId() {
        return chapterId;
    }
    public void setChapterId(Long value) {
        chapterId = ((Long) value);
    }
    public Long getBookTitleId() {
        return bookTitleId;
    }
    public void setBookTitleId(Long value) {
        bookTitleId = ((Long) value);
    }
    public String getBookDOI() {
        return bookDOI;
    }
    public void setBookDOI(String value) {
        bookDOI = ((String) value);
    }
    public ISXN getIsxn() {
        return isxn;
    }
    public void setIsxn(ISXN value) {
        isxn = ((ISXNImpl) value);
    }
    public String getSubjectCollection() {
        return subjectCollection;
    }
    public void setSubjectCollection(String value) {
        subjectCollection = ((String) value);
    }
    public Subjects getSubjects() {
        return subjects;
    }
    public void setSubjects(Subjects value) {
        subjects = ((SubjectsImpl) value);
    }
    public List<Object> getCopyrightHolderAndKeywordsAndOpenAccess() {
        if (copyrightHolderAndKeywordsAndOpenAccess == null) {
            copyrightHolderAndKeywordsAndOpenAccess = new ArrayList<Object>();
        }
        return this.copyrightHolderAndKeywordsAndOpenAccess;
    }
    public void setCopyrightHolderAndKeywordsAndOpenAccess(List<Object> value) {
        this.copyrightHolderAndKeywordsAndOpenAccess = value;
    }
    public String getImageType() {
        return imageType;
    }
    public void setImageType(String value) {
        imageType = ((String) value);
    }
    public String getArticleURI() {
        return articleURI;
    }
    public void setArticleURI(String value) {
        articleURI = ((String) value);
    }
    public String getProvider() {
        return provider;
    }
    public void setProvider(String value) {
        provider = ((String) value);
    }
    public XMLGregorianCalendar getDateLoaded() {
        return dateLoaded;
    }
    public void setDateLoaded(XMLGregorianCalendar value) {
        dateLoaded = ((XMLGregorianCalendar) value);
    }
    public String getId() {
        return id;
    }
    public void setId(String value) {
        id = ((String) value);
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String value) {
        language = ((String) value);
    }
    public String getLang() {
        return lang;
    }
    public void setLang(String value) {
        lang = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Caption")) {
                CaptionImpl node = new CaptionImpl();
                node.init(parser);
                setCaption(node);
            } else if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                setTable(node);
            } else if (name.equals("ChapterId")) {
                setChapterId(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookTitleId")) {
                setBookTitleId(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookDOI")) {
                setBookDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ISXN")) {
                ISXNImpl node = new ISXNImpl();
                node.init(parser);
                setIsxn(node);
            } else if (name.equals("SubjectCollection")) {
                setSubjectCollection(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Subjects")) {
                SubjectsImpl node = new SubjectsImpl();
                node.init(parser);
                setSubjects(node);
            } else if (name.equals("ImageType")) {
                setImageType(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleURI")) {
                setArticleURI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Provider")) {
                setProvider(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("DateLoaded")) {
                setDateLoaded(XppUtils.getElementValueFromNode(parser));
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setId(XppUtils.getAttributeValueFromNode(parser, "Id"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "##default"));
        setLang(XppUtils.getAttributeValueFromNode(parser, "##default"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
