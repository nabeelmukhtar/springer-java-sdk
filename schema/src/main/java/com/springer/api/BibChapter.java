
package com.springer.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}BibAuthorName" maxOccurs="unbounded"/>
 *         &lt;element ref="{}Year"/>
 *         &lt;element ref="{}ChapterTitle"/>
 *         &lt;element ref="{}BookTitle"/>
 *         &lt;element ref="{}ConfEventLocation" minOccurs="0"/>
 *         &lt;element ref="{}ConfEventDate" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}PublisherName"/>
 *           &lt;element ref="{}PublisherLocation"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}BibComments" minOccurs="0"/>
 *         &lt;element ref="{}NumberInSeries" minOccurs="0"/>
 *         &lt;element ref="{}FirstPage" minOccurs="0"/>
 *         &lt;element ref="{}LastPage" minOccurs="0"/>
 *         &lt;element ref="{}Occurrence" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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
public class BibChapter
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BibAuthorName", required = true)
    protected List<BibAuthorName> bibAuthorName;
    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "ChapterTitle", required = true)
    protected ChapterTitle chapterTitle;
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
    @XmlElement(name = "Occurrence")
    protected Occurrence occurrence;

    /**
     * Gets the value of the bibAuthorName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bibAuthorName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBibAuthorName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BibAuthorName }
     * 
     * 
     */
    public List<BibAuthorName> getBibAuthorName() {
        if (bibAuthorName == null) {
            bibAuthorName = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorName;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the chapterTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterTitle }
     *     
     */
    public ChapterTitle getChapterTitle() {
        return chapterTitle;
    }

    /**
     * Sets the value of the chapterTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterTitle }
     *     
     */
    public void setChapterTitle(ChapterTitle value) {
        this.chapterTitle = value;
    }

    /**
     * Gets the value of the bookTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets the value of the bookTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookTitle(String value) {
        this.bookTitle = value;
    }

    /**
     * Gets the value of the confEventLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfEventLocation() {
        return confEventLocation;
    }

    /**
     * Sets the value of the confEventLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfEventLocation(String value) {
        this.confEventLocation = value;
    }

    /**
     * Gets the value of the confEventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfEventDate() {
        return confEventDate;
    }

    /**
     * Sets the value of the confEventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfEventDate(String value) {
        this.confEventDate = value;
    }

    /**
     * Gets the value of the publisherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the value of the publisherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    /**
     * Gets the value of the publisherLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherLocation() {
        return publisherLocation;
    }

    /**
     * Sets the value of the publisherLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherLocation(String value) {
        this.publisherLocation = value;
    }

    /**
     * Gets the value of the bibComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBibComments() {
        return bibComments;
    }

    /**
     * Sets the value of the bibComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBibComments(String value) {
        this.bibComments = value;
    }

    /**
     * Gets the value of the numberInSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberInSeries() {
        return numberInSeries;
    }

    /**
     * Sets the value of the numberInSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberInSeries(String value) {
        this.numberInSeries = value;
    }

    /**
     * Gets the value of the firstPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPage() {
        return firstPage;
    }

    /**
     * Sets the value of the firstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPage(String value) {
        this.firstPage = value;
    }

    /**
     * Gets the value of the lastPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPage() {
        return lastPage;
    }

    /**
     * Sets the value of the lastPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPage(String value) {
        this.lastPage = value;
    }

    /**
     * Gets the value of the occurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Occurrence }
     *     
     */
    public Occurrence getOccurrence() {
        return occurrence;
    }

    /**
     * Sets the value of the occurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Occurrence }
     *     
     */
    public void setOccurrence(Occurrence value) {
        this.occurrence = value;
    }

}
