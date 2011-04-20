
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
 *         &lt;element ref="{}PartInfo"/>
 *         &lt;element ref="{}Chapter"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Part {


    /**
     * Gets the value of the partInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartInfo }
     *     
     */
    PartInfo getPartInfo();

    /**
     * Sets the value of the partInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartInfo }
     *     
     */
    void setPartInfo(PartInfo value);

    /**
     * Gets the value of the chapter property.
     * 
     * @return
     *     possible object is
     *     {@link Chapter }
     *     
     */
    Chapter getChapter();

    /**
     * Sets the value of the chapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chapter }
     *     
     */
    void setChapter(Chapter value);

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
