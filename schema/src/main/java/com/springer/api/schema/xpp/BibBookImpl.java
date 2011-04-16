
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BibAuthorName;
import com.springer.api.schema.BibBook;
import com.springer.api.schema.Occurrence;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bibAuthorName",
    "year",
    "bookTitle",
    "numberInSeries",
    "publisherName",
    "publisherLocation",
    "occurrence"
})
@XmlRootElement(name = "BibBook")
public class BibBookImpl
    extends BaseSchemaEntity implements BibBook
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BibAuthorName", required = true, type = BibAuthorNameImpl.class)
    protected List<BibAuthorName> bibAuthorName;
    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "BookTitle", required = true)
    protected String bookTitle;
    @XmlElement(name = "NumberInSeries")
    protected String numberInSeries;
    @XmlElement(name = "PublisherName", required = true)
    protected String publisherName;
    @XmlElement(name = "PublisherLocation", required = true)
    protected String publisherLocation;
    @XmlElement(name = "Occurrence", type = OccurrenceImpl.class)
    protected OccurrenceImpl occurrence;

    public List<BibAuthorName> getBibAuthorName() {
        if (bibAuthorName == null) {
            bibAuthorName = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String value) {
        this.year = value;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String value) {
        this.bookTitle = value;
    }

    public String getNumberInSeries() {
        return numberInSeries;
    }

    public void setNumberInSeries(String value) {
        this.numberInSeries = value;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    public String getPublisherLocation() {
        return publisherLocation;
    }

    public void setPublisherLocation(String value) {
        this.publisherLocation = value;
    }

    public Occurrence getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(Occurrence value) {
        this.occurrence = ((OccurrenceImpl) value);
    }

	@Override
	public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);

        while (parser.nextTag() == XmlPullParser.START_TAG) {
        	String name = parser.getName();
        	
        	if (name.equals("code")) {
        		setCode(XppUtils.getElementValueFromNode(parser));
            } else {
                // Consume something we don't understand.
            	LOG.warning("Found tag that we don't recognize: " + name);
            	XppUtils.skipSubTree(parser);
            }
        }
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		XmlSerializer element = serializer.startTag(null, "action");
		XppUtils.setElementValueToNode(element, "code", getCode());
		element.endTag(null, "action");;
	}
}
