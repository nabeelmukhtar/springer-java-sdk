
package com.springer.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textObject"
})
@XmlRootElement(name = "MediaObject")
public class MediaObject
    extends ImageObject
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "TextObject")
    protected TextObject textObject;

    /**
     * Gets the value of the textObject property.
     * 
     * @return
     *     possible object is
     *     {@link TextObject }
     *     
     */
    public TextObject getTextObject() {
        return textObject;
    }

    /**
     * Sets the value of the textObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextObject }
     *     
     */
    public void setTextObject(TextObject value) {
        this.textObject = value;
    }

}
