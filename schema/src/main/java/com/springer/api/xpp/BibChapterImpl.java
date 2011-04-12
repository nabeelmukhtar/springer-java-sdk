
package com.springer.api.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.BibAuthorName;
import com.springer.api.BibChapter;
import com.springer.api.ChapterTitle;
import com.springer.api.Occurrence;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bibAuthorName",
    "year",
    "chapterTitle",
    "bookTitle",
    "confEventLocation",
    "confEventDate",
    "publisherName",
    "publisherLocation",
    "bibComments",
    "numberInSeries",
    "firstPage",
    "lastPage",
    "occurrence"
})
@XmlRootElement(name = "BibChapter")
public class BibChapterImpl
    implements Serializable, BibChapter
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BibAuthorName", required = true, type = BibAuthorNameImpl.class)
    protected List<BibAuthorName> bibAuthorName;
    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "ChapterTitle", required = true, type = ChapterTitleImpl.class)
    protected ChapterTitleImpl chapterTitle;
    @XmlElement(name = "BookTitle", required = true)
    protected String bookTitle;
    @XmlElement(name = "ConfEventLocation")
    protected String confEventLocation;
    @XmlElement(name = "ConfEventDate")
    protected String confEventDate;
    @XmlElement(name = "PublisherName")
    protected String publisherName;
    @XmlElement(name = "PublisherLocation")
    protected String publisherLocation;
    @XmlElement(name = "BibComments")
    protected String bibComments;
    @XmlElement(name = "NumberInSeries")
    protected String numberInSeries;
    @XmlElement(name = "FirstPage")
    protected String firstPage;
    @XmlElement(name = "LastPage")
    protected String lastPage;
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

    public ChapterTitle getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(ChapterTitle value) {
        this.chapterTitle = ((ChapterTitleImpl) value);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String value) {
        this.bookTitle = value;
    }

    public String getConfEventLocation() {
        return confEventLocation;
    }

    public void setConfEventLocation(String value) {
        this.confEventLocation = value;
    }

    public String getConfEventDate() {
        return confEventDate;
    }

    public void setConfEventDate(String value) {
        this.confEventDate = value;
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

    public String getNumberInSeries() {
        return numberInSeries;
    }

    public void setNumberInSeries(String value) {
        this.numberInSeries = value;
    }

    public String getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(String value) {
        this.firstPage = value;
    }

    public String getLastPage() {
        return lastPage;
    }

    public void setLastPage(String value) {
        this.lastPage = value;
    }

    public Occurrence getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(Occurrence value) {
        this.occurrence = ((OccurrenceImpl) value);
    }

}
