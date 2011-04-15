
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
 *       &lt;attribute name="Color" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="FileRef" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Format" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="Rendition" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ImageObjectElement {


    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getColor();

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setColor(String value);

    /**
     * Gets the value of the fileRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFileRef();

    /**
     * Sets the value of the fileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFileRef(String value);

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFormat();

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFormat(String value);

    /**
     * Gets the value of the rendition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getRendition();

    /**
     * Sets the value of the rendition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setRendition(String value);

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

}
