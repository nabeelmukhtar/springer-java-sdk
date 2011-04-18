
package com.springer.api.schema;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}ImageObject">
 *       &lt;sequence>
 *         &lt;element ref="{}TextObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface MediaObject
    extends ImageObject
{


    /**
     * Gets the value of the textObject property.
     * 
     * @return
     *     possible object is
     *     {@link TextObject }
     *     
     */
    TextObject getTextObject();

    /**
     * Sets the value of the textObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextObject }
     *     
     */
    void setTextObject(TextObject value);

}
