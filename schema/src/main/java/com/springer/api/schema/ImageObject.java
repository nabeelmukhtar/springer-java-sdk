
package com.springer.api.schema;



/**
 * <p>Java class for ImageObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ImageObjectElement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ImageObject {


    /**
     * Gets the value of the imageObjectElement property.
     * 
     * @return
     *     possible object is
     *     {@link ImageObjectElement }
     *     
     */
    ImageObjectElement getImageObjectElement();

    /**
     * Sets the value of the imageObjectElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageObjectElement }
     *     
     */
    void setImageObjectElement(ImageObjectElement value);

}
