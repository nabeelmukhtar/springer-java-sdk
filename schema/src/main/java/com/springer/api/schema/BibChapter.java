
package com.springer.api.schema;

import java.util.List;


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
 *         &lt;element ref="{}PublisherName" minOccurs="0"/>
 *         &lt;element ref="{}PublisherLocation" minOccurs="0"/>
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
public interface BibChapter {


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
    List<BibAuthorName> getBibAuthorName();

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getYear();

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setYear(String value);

    /**
     * Gets the value of the chapterTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterTitle }
     *     
     */
    ChapterTitle getChapterTitle();

    /**
     * Sets the value of the chapterTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterTitle }
     *     
     */
    void setChapterTitle(ChapterTitle value);

    /**
     * Gets the value of the bookTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBookTitle();

    /**
     * Sets the value of the bookTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookTitle(String value);

    /**
     * Gets the value of the confEventLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getConfEventLocation();

    /**
     * Sets the value of the confEventLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setConfEventLocation(String value);

    /**
     * Gets the value of the confEventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getConfEventDate();

    /**
     * Sets the value of the confEventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setConfEventDate(String value);

    /**
     * Gets the value of the publisherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublisherName();

    /**
     * Sets the value of the publisherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublisherName(String value);

    /**
     * Gets the value of the publisherLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublisherLocation();

    /**
     * Sets the value of the publisherLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublisherLocation(String value);

    /**
     * Gets the value of the bibComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBibComments();

    /**
     * Sets the value of the bibComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBibComments(String value);

    /**
     * Gets the value of the numberInSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getNumberInSeries();

    /**
     * Sets the value of the numberInSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNumberInSeries(String value);

    /**
     * Gets the value of the firstPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFirstPage();

    /**
     * Sets the value of the firstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFirstPage(String value);

    /**
     * Gets the value of the lastPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLastPage();

    /**
     * Sets the value of the lastPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLastPage(String value);

    /**
     * Gets the value of the occurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Occurrence }
     *     
     */
    Occurrence getOccurrence();

    /**
     * Sets the value of the occurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Occurrence }
     *     
     */
    void setOccurrence(Occurrence value);

}
