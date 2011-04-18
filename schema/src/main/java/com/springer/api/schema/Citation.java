
package com.springer.api.schema;

import java.math.BigDecimal;


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
 *         &lt;element ref="{}CitationNumber"/>
 *         &lt;element ref="{}BibArticle" minOccurs="0"/>
 *         &lt;element ref="{}BibBook" minOccurs="0"/>
 *         &lt;element ref="{}BibChapter" minOccurs="0"/>
 *         &lt;element ref="{}BibUnstructured" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Citation {


    /**
     * Gets the value of the citationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    BigDecimal getCitationNumber();

    /**
     * Sets the value of the citationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    void setCitationNumber(BigDecimal value);

    /**
     * Gets the value of the bibArticle property.
     * 
     * @return
     *     possible object is
     *     {@link BibArticle }
     *     
     */
    BibArticle getBibArticle();

    /**
     * Sets the value of the bibArticle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibArticle }
     *     
     */
    void setBibArticle(BibArticle value);

    /**
     * Gets the value of the bibBook property.
     * 
     * @return
     *     possible object is
     *     {@link BibBook }
     *     
     */
    BibBook getBibBook();

    /**
     * Sets the value of the bibBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibBook }
     *     
     */
    void setBibBook(BibBook value);

    /**
     * Gets the value of the bibChapter property.
     * 
     * @return
     *     possible object is
     *     {@link BibChapter }
     *     
     */
    BibChapter getBibChapter();

    /**
     * Sets the value of the bibChapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibChapter }
     *     
     */
    void setBibChapter(BibChapter value);

    /**
     * Gets the value of the bibUnstructured property.
     * 
     * @return
     *     possible object is
     *     {@link BibUnstructured }
     *     
     */
    BibUnstructured getBibUnstructured();

    /**
     * Sets the value of the bibUnstructured property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibUnstructured }
     *     
     */
    void setBibUnstructured(BibUnstructured value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getID();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setID(String value);

}
