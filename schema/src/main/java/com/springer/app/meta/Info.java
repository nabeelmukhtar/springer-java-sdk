
package com.springer.app.meta;

import java.util.List;
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
 *         &lt;element ref="{http://www.springer.com/app/meta}DateLoaded" minOccurs="0"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Authors"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Institutions"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Date"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Type"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}DOI"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Title"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}ISXN"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Journal" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}PubName" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}ArticleFirstPage" minOccurs="0"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Publication"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}PublicationType"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}SubjectGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Info {


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
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link Authors }
     *     
     */
    Authors getAuthors();

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authors }
     *     
     */
    void setAuthors(Authors value);

    /**
     * Gets the value of the institutions property.
     * 
     * @return
     *     possible object is
     *     {@link Institutions }
     *     
     */
    Institutions getInstitutions();

    /**
     * Sets the value of the institutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Institutions }
     *     
     */
    void setInstitutions(Institutions value);

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDate();

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDate(String value);

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setType(String value);

    /**
     * Gets the value of the doi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDOI();

    /**
     * Sets the value of the doi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDOI(String value);

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    Title getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    void setTitle(Title value);

    /**
     * Gets the value of the isxn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getISXN();

    /**
     * Sets the value of the isxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setISXN(String value);

    /**
     * Gets the value of the journal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getJournal();

    /**
     * Gets the value of the pubName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getPubName();

    /**
     * Gets the value of the articleFirstPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArticleFirstPage();

    /**
     * Sets the value of the articleFirstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArticleFirstPage(String value);

    /**
     * Gets the value of the publication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublication();

    /**
     * Sets the value of the publication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublication(String value);

    /**
     * Gets the value of the publicationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublicationType();

    /**
     * Sets the value of the publicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublicationType(String value);

    /**
     * Gets the value of the subjectGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectGroup }
     *     
     */
    SubjectGroup getSubjectGroup();

    /**
     * Sets the value of the subjectGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectGroup }
     *     
     */
    void setSubjectGroup(SubjectGroup value);

}
