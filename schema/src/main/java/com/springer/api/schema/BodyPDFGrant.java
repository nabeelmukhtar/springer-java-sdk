
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
 *       &lt;attribute name="Grant" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface BodyPDFGrant {


    /**
     * Gets the value of the grant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getGrant();

    /**
     * Sets the value of the grant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setGrant(String value);

}
