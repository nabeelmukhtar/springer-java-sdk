
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.BibAuthorName;
import com.springer.api.schema.BibBook;
import com.springer.api.schema.BibEditorName;
import com.springer.api.schema.BookTitle;
import com.springer.api.schema.Eds;
import com.springer.api.schema.Occurrence;
import com.springer.api.schema.SeriesTitle;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "institutionalAuthorName",
    "bibAuthorNames",
    "bibEditorName",
    "eds",
    "year",
    "bookTitle",
    "numberInSeries",
    "seriesTitle",
    "publisherName",
    "publisherLocation",
    "bibComments",
    "occurrence"
})
@XmlRootElement(name = "BibBook")
public class BibBookImpl
    implements Serializable, BibBook
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "InstitutionalAuthorName", required = true)
    protected String institutionalAuthorName;
    @XmlElement(name = "BibAuthorName", required = true, type = BibAuthorNameImpl.class)
    protected List<BibAuthorName> bibAuthorNames;
    @XmlElement(name = "BibEditorName", required = true, type = BibEditorNameImpl.class)
    protected BibEditorNameImpl bibEditorName;
    @XmlElement(name = "Eds", required = true, type = EdsImpl.class)
    protected EdsImpl eds;
    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "BookTitle", required = true, type = BookTitleImpl.class)
    protected BookTitleImpl bookTitle;
    @XmlElement(name = "NumberInSeries")
    protected String numberInSeries;
    @XmlElement(name = "SeriesTitle", type = SeriesTitleImpl.class)
    protected SeriesTitleImpl seriesTitle;
    @XmlElement(name = "PublisherName")
    protected String publisherName;
    @XmlElement(name = "PublisherLocation")
    protected String publisherLocation;
    @XmlElement(name = "BibComments")
    protected String bibComments;
    @XmlElement(name = "Occurrence", type = OccurrenceImpl.class)
    protected OccurrenceImpl occurrence;

    public String getInstitutionalAuthorName() {
        return institutionalAuthorName;
    }

    public void setInstitutionalAuthorName(String value) {
        this.institutionalAuthorName = value;
    }

    public List<BibAuthorName> getBibAuthorNames() {
        if (bibAuthorNames == null) {
            bibAuthorNames = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorNames;
    }

    public BibEditorName getBibEditorName() {
        return bibEditorName;
    }

    public void setBibEditorName(BibEditorName value) {
        this.bibEditorName = ((BibEditorNameImpl) value);
    }

    public Eds getEds() {
        return eds;
    }

    public void setEds(Eds value) {
        this.eds = ((EdsImpl) value);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String value) {
        this.year = value;
    }

    public BookTitle getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(BookTitle value) {
        this.bookTitle = ((BookTitleImpl) value);
    }

    public String getNumberInSeries() {
        return numberInSeries;
    }

    public void setNumberInSeries(String value) {
        this.numberInSeries = value;
    }

    public SeriesTitle getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(SeriesTitle value) {
        this.seriesTitle = ((SeriesTitleImpl) value);
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

    public String getBibComments() {
        return bibComments;
    }

    public void setBibComments(String value) {
        this.bibComments = value;
    }

    public Occurrence getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(Occurrence value) {
        this.occurrence = ((OccurrenceImpl) value);
    }

}
