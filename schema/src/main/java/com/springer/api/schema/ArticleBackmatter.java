
package com.springer.api.schema;



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
 *         &lt;element ref="{}Acknowledgments" minOccurs="0"/>
 *         &lt;element ref="{}Appendix" minOccurs="0"/>
 *         &lt;element ref="{}Bibliography"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ArticleBackmatter {


    /**
     * Gets the value of the acknowledgments property.
     * 
     * @return
     *     possible object is
     *     {@link Acknowledgments }
     *     
     */
    Acknowledgments getAcknowledgments();

    /**
     * Sets the value of the acknowledgments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acknowledgments }
     *     
     */
    void setAcknowledgments(Acknowledgments value);

    /**
     * Gets the value of the appendix property.
     * 
     * @return
     *     possible object is
     *     {@link Appendix }
     *     
     */
    Appendix getAppendix();

    /**
     * Sets the value of the appendix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appendix }
     *     
     */
    void setAppendix(Appendix value);

    /**
     * Gets the value of the bibliography property.
     * 
     * @return
     *     possible object is
     *     {@link Bibliography }
     *     
     */
    Bibliography getBibliography();

    /**
     * Sets the value of the bibliography property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bibliography }
     *     
     */
    void setBibliography(Bibliography value);

}
