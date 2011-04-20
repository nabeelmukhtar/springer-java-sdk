package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BibAuthorName;
import com.springer.api.schema.BibBook;
import com.springer.api.schema.BibEditorName;
import com.springer.api.schema.BookTitle;
import com.springer.api.schema.Eds;
import com.springer.api.schema.Occurrence;
import com.springer.api.schema.SeriesTitle;
public class BibBookImpl extends BaseSchemaEntity implements BibBook {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String institutionalAuthorName;
    protected List<BibAuthorName> bibAuthorNames;
    protected BibEditorNameImpl bibEditorName;
    protected EdsImpl eds;
    protected String year;
    protected BookTitleImpl bookTitle;
    protected String numberInSeries;
    protected SeriesTitleImpl seriesTitle;
    protected String publisherName;
    protected String publisherLocation;
    protected String bibComments;
    protected OccurrenceImpl occurrence;
    public String getInstitutionalAuthorName() {
        return institutionalAuthorName;
    }
    public void setInstitutionalAuthorName(String value) {
        institutionalAuthorName = ((String) value);
    }
    public List<BibAuthorName> getBibAuthorNames() {
        if (bibAuthorNames == null) {
            bibAuthorNames = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorNames;
    }
    public void setBibAuthorNames(List<BibAuthorName> value) {
        this.bibAuthorNames = value;
    }
    public BibEditorName getBibEditorName() {
        return bibEditorName;
    }
    public void setBibEditorName(BibEditorName value) {
        bibEditorName = ((BibEditorNameImpl) value);
    }
    public Eds getEds() {
        return eds;
    }
    public void setEds(Eds value) {
        eds = ((EdsImpl) value);
    }
    public String getYear() {
        return year;
    }
    public void setYear(String value) {
        year = ((String) value);
    }
    public BookTitle getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(BookTitle value) {
        bookTitle = ((BookTitleImpl) value);
    }
    public String getNumberInSeries() {
        return numberInSeries;
    }
    public void setNumberInSeries(String value) {
        numberInSeries = ((String) value);
    }
    public SeriesTitle getSeriesTitle() {
        return seriesTitle;
    }
    public void setSeriesTitle(SeriesTitle value) {
        seriesTitle = ((SeriesTitleImpl) value);
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
            if (name.equals("InstitutionalAuthorName")) {
                setInstitutionalAuthorName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BibAuthorName")) {
                BibAuthorNameImpl node = new BibAuthorNameImpl();
                node.init(parser);
                getBibAuthorNames().add(node);
            } else if (name.equals("BibEditorName")) {
                BibEditorNameImpl node = new BibEditorNameImpl();
                node.init(parser);
                setBibEditorName(node);
            } else if (name.equals("Eds")) {
                EdsImpl node = new EdsImpl();
                node.init(parser);
                setEds(node);
            } else if (name.equals("Year")) {
                setYear(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BookTitle")) {
                BookTitleImpl node = new BookTitleImpl();
                node.init(parser);
                setBookTitle(node);
            } else if (name.equals("NumberInSeries")) {
                setNumberInSeries(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("SeriesTitle")) {
                SeriesTitleImpl node = new SeriesTitleImpl();
                node.init(parser);
                setSeriesTitle(node);
            } else if (name.equals("PublisherName")) {
                setPublisherName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PublisherLocation")) {
                setPublisherLocation(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BibComments")) {
                setBibComments(XppUtils.getElementValueFromNode(parser));
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
