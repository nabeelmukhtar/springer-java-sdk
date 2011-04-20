
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
 *         &lt;element ref="{}ItemNumber"/>
 *         &lt;element ref="{}ItemContent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ListItem {


    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getItemNumber();

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setItemNumber(String value);

    /**
     * Gets the value of the itemContent property.
     * 
     * @return
     *     possible object is
     *     {@link ItemContent }
     *     
     */
    ItemContent getItemContent();

    /**
     * Sets the value of the itemContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemContent }
     *     
     */
    void setItemContent(ItemContent value);

}
