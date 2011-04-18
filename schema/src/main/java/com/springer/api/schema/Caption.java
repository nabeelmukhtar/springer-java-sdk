
package com.springer.api.schema;

import org.w3._1999.xhtml.P;



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
 *         &lt;element ref="{}p" minOccurs="0"/>
 *         &lt;element ref="{}CaptionNumber" minOccurs="0"/>
 *         &lt;element ref="{}CaptionContent" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Caption {


    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link P }
     *     
     */
    P getP();

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link P }
     *     
     */
    void setP(P value);

    /**
     * Gets the value of the captionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCaptionNumber();

    /**
     * Sets the value of the captionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCaptionNumber(String value);

    /**
     * Gets the value of the captionContent property.
     * 
     * @return
     *     possible object is
     *     {@link CaptionContent }
     *     
     */
    CaptionContent getCaptionContent();

    /**
     * Sets the value of the captionContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaptionContent }
     *     
     */
    void setCaptionContent(CaptionContent value);

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

}
