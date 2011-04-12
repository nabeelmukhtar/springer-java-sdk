
package com.springer.api.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.BibAuthorName;
import com.springer.api.BibBook;
import com.springer.api.Occurrence;

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
    implements Serializable, BibBook
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

}
