
package com.springer.api.schema;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{}Caption"/>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element ref="{}File"/>
 *           &lt;element ref="{}FullText"/>
 *           &lt;element ref="{}Location"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}Table" minOccurs="0"/>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element ref="{}ArticleTitle"/>
 *           &lt;element ref="{}Authors"/>
 *           &lt;element ref="{}DOI"/>
 *           &lt;element ref="{}Institutions"/>
 *           &lt;element ref="{}IssueId"/>
 *           &lt;element ref="{}JournalId"/>
 *           &lt;element ref="{}PubDate"/>
 *           &lt;element ref="{}SourceTitle"/>
 *           &lt;element ref="{}SourceType"/>
 *           &lt;element ref="{}VolumeId"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}ChapterId"/>
 *           &lt;element ref="{}BookTitleId"/>
 *           &lt;element ref="{}BookDOI"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}ISXN"/>
 *         &lt;element ref="{}SubjectCollection"/>
 *         &lt;element ref="{}Subjects"/>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element ref="{}CopyrightHolder"/>
 *           &lt;element ref="{}Keywords"/>
 *           &lt;element ref="{}OpenAccess"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}ImageType"/>
 *         &lt;element ref="{}ArticleURI" minOccurs="0"/>
 *         &lt;element ref="{}Provider"/>
 *         &lt;element ref="{}DateLoaded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Image {


    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    Caption getCaption();

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    void setCaption(Caption value);

    /**
     * Gets the value of the fileAndFullTextAndLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileAndFullTextAndLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileAndFullTextAndLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link File }
     * {@link FullText }
     * 
     * 
     */
    List<Object> getFileAndFullTextAndLocation();

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link Table }
     *     
     */
    Table getTable();

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link Table }
     *     
     */
    void setTable(Table value);

    /**
     * Gets the value of the articleTitleAndAuthorsAndDOI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articleTitleAndAuthorsAndDOI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticleTitleAndAuthorsAndDOI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Institutions }
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link ArticleTitle }
     * {@link Authors }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    List<Object> getArticleTitleAndAuthorsAndDOI();

    /**
     * Gets the value of the chapterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getChapterId();

    /**
     * Sets the value of the chapterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setChapterId(Long value);

    /**
     * Gets the value of the bookTitleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getBookTitleId();

    /**
     * Sets the value of the bookTitleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookTitleId(Long value);

    /**
     * Gets the value of the bookDOI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBookDOI();

    /**
     * Sets the value of the bookDOI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookDOI(String value);

    /**
     * Gets the value of the isxn property.
     * 
     * @return
     *     possible object is
     *     {@link ISXN }
     *     
     */
    ISXN getISXN();

    /**
     * Sets the value of the isxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISXN }
     *     
     */
    void setISXN(ISXN value);

    /**
     * Gets the value of the subjectCollection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSubjectCollection();

    /**
     * Sets the value of the subjectCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSubjectCollection(String value);

    /**
     * Gets the value of the subjects property.
     * 
     * @return
     *     possible object is
     *     {@link Subjects }
     *     
     */
    Subjects getSubjects();

    /**
     * Sets the value of the subjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subjects }
     *     
     */
    void setSubjects(Subjects value);

    /**
     * Gets the value of the copyrightHolderAndKeywordsAndOpenAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyrightHolderAndKeywordsAndOpenAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyrightHolderAndKeywordsAndOpenAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * {@link Keywords }
     * {@link String }
     * 
     * 
     */
    List<Object> getCopyrightHolderAndKeywordsAndOpenAccess();

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getImageType();

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setImageType(String value);

    /**
     * Gets the value of the articleURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleURI();

    /**
     * Sets the value of the articleURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleURI(String value);

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getProvider();

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setProvider(String value);

    /**
     * Gets the value of the dateLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    XMLGregorianCalendar getDateLoaded();

    /**
     * Sets the value of the dateLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    void setDateLoaded(XMLGregorianCalendar value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setId(String value);

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLanguage();

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLanguage(String value);

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLang();

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLang(String value);

}
