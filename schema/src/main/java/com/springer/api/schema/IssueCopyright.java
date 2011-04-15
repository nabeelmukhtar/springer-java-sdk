
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
 *         &lt;element ref="{}CopyrightHolderName"/>
 *         &lt;element ref="{}CopyrightYear"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface IssueCopyright {


    /**
     * Gets the value of the copyrightHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCopyrightHolderName();

    /**
     * Sets the value of the copyrightHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCopyrightHolderName(String value);

    /**
     * Gets the value of the copyrightYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getCopyrightYear();

    /**
     * Sets the value of the copyrightYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCopyrightYear(Long value);

}
