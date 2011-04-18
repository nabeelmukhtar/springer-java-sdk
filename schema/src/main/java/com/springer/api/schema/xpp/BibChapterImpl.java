package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BibAuthorName;
import com.springer.api.schema.BibChapter;
import com.springer.api.schema.ChapterTitle;
import com.springer.api.schema.Occurrence;
public class BibChapterImpl extends BaseSchemaEntity implements BibChapter {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<BibAuthorName> bibAuthorNames;
    protected String year;
    protected ChapterTitleImpl chapterTitle;
    protected String bookTitle;
    protected String confEventLocation;
    protected String confEventDate;
    protected String publisherName;
    protected String publisherLocation;
    protected String bibComments;
    protected String numberInSeries;
    protected String firstPage;
    protected String lastPage;
    protected OccurrenceImpl occurrence;
    public List<BibAuthorName> getBibAuthorNames() {
        if (bibAuthorNames == null) {
            bibAuthorNames = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorNames;
    }
    public void setBibAuthorNames(List<BibAuthorName> value) {
        this.bibAuthorNames = value;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String value) {
        year = ((String) value);
    }
    public ChapterTitle getChapterTitle() {
        return chapterTitle;
    }
    public void setChapterTitle(ChapterTitle value) {
        chapterTitle = ((ChapterTitleImpl) value);
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String value) {
        bookTitle = ((String) value);
    }
    public String getConfEventLocation() {
        return confEventLocation;
    }
    public void setConfEventLocation(String value) {
        confEventLocation = ((String) value);
    }
    public String getConfEventDate() {
        return confEventDate;
    }
    public void setConfEventDate(String value) {
        confEventDate = ((String) value);
    }
    public String getPublisherName() {
        return publisherName;
    }
    public void setPublisherName(String value) {
        publisherName = ((String) value);
    }
    public String getPublisherLocation() {
        return publisherLocation;
    }
    public void setPublisherLocation(String value) {
        publisherLocation = ((String) value);
    }
    public String getBibComments() {
        return bibComments;
    }
    public void setBibComments(String value) {
        bibComments = ((String) value);
    }
    public String getNumberInSeries() {
        return numberInSeries;
    }
    public void setNumberInSeries(String value) {
        numberInSeries = ((String) value);
    }
    public String getFirstPage() {
        return firstPage;
    }
    public void setFirstPage(String value) {
        firstPage = ((String) value);
    }
    public String getLastPage() {
        return lastPage;
    }
    public void setLastPage(String value) {
        lastPage = ((String) value);
    }
    public Occurrence getOccurrence() {
        return occurrence;
    }
    public void setOccurrence(Occurrence value) {
        occurrence = ((OccurrenceImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("BibAuthorName")) {
                BibAuthorNameImpl node = new BibAuthorNameImpl();
                node.init(parser);
                getBibAuthorNames().add(node);
            } else if (name.equals("Year")) {
                setYear(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ChapterTitle")) {
                ChapterTitleImpl node = new ChapterTitleImpl();
                node.init(parser);
                setChapterTitle(node);
            } else if (name.equals("BookTitle")) {
                setBookTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ConfEventLocation")) {
                setConfEventLocation(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ConfEventDate")) {
                setConfEventDate(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PublisherName")) {
                setPublisherName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PublisherLocation")) {
                setPublisherLocation(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BibComments")) {
                setBibComments(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("NumberInSeries")) {
                setNumberInSeries(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("FirstPage")) {
                setFirstPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("LastPage")) {
                setLastPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Occurrence")) {
                OccurrenceImpl node = new OccurrenceImpl();
                node.init(parser);
                setOccurrence(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
