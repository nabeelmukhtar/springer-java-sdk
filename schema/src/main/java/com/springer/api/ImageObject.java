
package com.springer.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageObject", propOrder = {
    "imageObjectElement"
})
public class ImageObject implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ImageObjectElement", required = true)
    protected ImageObjectElement imageObjectElement;

    /**
     * Gets the value of the imageObjectElement property.
     * 
     * @return
     *     possible object is
     *     {@link ImageObjectElement }
     *     
     */
    public ImageObjectElement getImageObjectElement() {
        return imageObjectElement;
    }

    /**
     * Sets the value of the imageObjectElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageObjectElement }
     *     
     */
    public void setImageObjectElement(ImageObjectElement value) {
        this.imageObjectElement = value;
    }

}
