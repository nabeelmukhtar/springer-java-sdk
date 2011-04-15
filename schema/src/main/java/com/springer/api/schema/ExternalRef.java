
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
 *         &lt;element ref="{}RefSource"/>
 *         &lt;element ref="{}RefTarget"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ExternalRef {


    /**
     * Gets the value of the refSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getRefSource();

    /**
     * Sets the value of the refSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setRefSource(String value);

    /**
     * Gets the value of the refTarget property.
     * 
     * @return
     *     possible object is
     *     {@link RefTarget }
     *     
     */
    RefTarget getRefTarget();

    /**
     * Sets the value of the refTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefTarget }
     *     
     */
    void setRefTarget(RefTarget value);

}
