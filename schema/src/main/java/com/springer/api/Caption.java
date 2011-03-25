
package com.springer.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}p" minOccurs="0"/>
 *         &lt;element ref="{}CaptionNumber" minOccurs="0"/>
 *         &lt;element ref="{}CaptionContent" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "p",
    "captionNumber",
    "captionContent"
})
@XmlRootElement(name = "Caption")
public class Caption
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected P p;
    @XmlElement(name = "CaptionNumber")
    protected String captionNumber;
    @XmlElement(name = "CaptionContent")
    protected CaptionContent captionContent;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link P }
     *     
     */
    public P getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link P }
     *     
     */
    public void setP(P value) {
        this.p = value;
    }

    /**
     * Gets the value of the captionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionNumber() {
        return captionNumber;
    }

    /**
     * Sets the value of the captionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionNumber(String value) {
        this.captionNumber = value;
    }

    /**
     * Gets the value of the captionContent property.
     * 
     * @return
     *     possible object is
     *     {@link CaptionContent }
     *     
     */
    public CaptionContent getCaptionContent() {
        return captionContent;
    }

    /**
     * Sets the value of the captionContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaptionContent }
     *     
     */
    public void setCaptionContent(CaptionContent value) {
        this.captionContent = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
