
package org.prismstandard.namespaces.pam._2;

import java.util.List;
import org.prismstandard.namespaces.basic._2.Number;
import org.prismstandard.namespaces.basic._2.Volume;


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
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}identifier"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}creator" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}publicationName"/>
 *         &lt;choice>
 *           &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}isbn"/>
 *           &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}issn"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}doi"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}publisher"/>
 *         &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}publicationDate"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}volume"/>
 *           &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}number"/>
 *           &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}startingPage"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}url"/>
 *         &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}copyright"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Article {


    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIdentifier();

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIdentifier(String value);

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTitle(String value);

    /**
     * Gets the value of the creator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    List<String> getCreator();

    /**
     * Gets the value of the publicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublicationName();

    /**
     * Sets the value of the publicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublicationName(String value);

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIsbn();

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIsbn(String value);

    /**
     * Gets the value of the issn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIssn();

    /**
     * Sets the value of the issn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIssn(String value);

    /**
     * Gets the value of the doi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDoi();

    /**
     * Sets the value of the doi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDoi(String value);

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublisher();

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublisher(String value);

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublicationDate();

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublicationDate(String value);

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Volume }
     *     
     */
    Volume getVolume();

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volume }
     *     
     */
    void setVolume(Volume value);

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Number }
     *     
     */
    Number getNumber();

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number }
     *     
     */
    void setNumber(Number value);

    /**
     * Gets the value of the startingPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getStartingPage();

    /**
     * Sets the value of the startingPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setStartingPage(String value);

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getUrl();

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUrl(String value);

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCopyright();

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCopyright(String value);

}
