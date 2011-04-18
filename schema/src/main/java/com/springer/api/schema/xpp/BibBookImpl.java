package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BibAuthorName;
import com.springer.api.schema.BibBook;
import com.springer.api.schema.Occurrence;
public class BibBookImpl extends BaseSchemaEntity implements BibBook {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<BibAuthorName> bibAuthorName;
    protected String year;
    protected String bookTitle;
    protected String numberInSeries;
    protected String publisherName;
    protected String publisherLocation;
    protected OccurrenceImpl occurrence;
    public List<BibAuthorName> getBibAuthorName() {
        if (bibAuthorName == null) {
            bibAuthorName = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorName;
    }
    public void setBibAuthorName(List<BibAuthorName> value) {
        this.bibAuthorName = value;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String value) {
        year = ((String) value);
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String value) {
        bookTitle = ((String) value);
    }
    public String getNumberInSeries() {
        return numberInSeries;
    }
    public void setNumberInSeries(String value) {
        numberInSeries = ((String) value);
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
                getBibAuthorName().add(node);
            } else if (name.equals("Year")) {
                setYear(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookTitle")) {
                setBookTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("NumberInSeries")) {
                setNumberInSeries(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PublisherName")) {
                setPublisherName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PublisherLocation")) {
                setPublisherLocation(XppUtils.getElementValueFromNode(parser));
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
