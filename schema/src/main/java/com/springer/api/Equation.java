
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
import org.w3._2001.xmlschema.Adapter1;


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
 *         &lt;element ref="{}EquationNumber"/>
 *         &lt;element ref="{}MediaObject"/>
 *         &lt;element ref="{}EquationSource"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "equationNumber",
    "mediaObject",
    "equationSource"
})
@XmlRootElement(name = "Equation")
public class Equation implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "EquationNumber", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long equationNumber;
    @XmlElement(name = "MediaObject", required = true)
    protected MediaObject mediaObject;
    @XmlElement(name = "EquationSource", required = true)
    protected EquationSource equationSource;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the value of the equationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEquationNumber() {
        return equationNumber;
    }

    /**
     * Sets the value of the equationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquationNumber(Long value) {
        this.equationNumber = value;
    }

    /**
     * Gets the value of the mediaObject property.
     * 
     * @return
     *     possible object is
     *     {@link MediaObject }
     *     
     */
    public MediaObject getMediaObject() {
        return mediaObject;
    }

    /**
     * Sets the value of the mediaObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaObject }
     *     
     */
    public void setMediaObject(MediaObject value) {
        this.mediaObject = value;
    }

    /**
     * Gets the value of the equationSource property.
     * 
     * @return
     *     possible object is
     *     {@link EquationSource }
     *     
     */
    public EquationSource getEquationSource() {
        return equationSource;
    }

    /**
     * Sets the value of the equationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquationSource }
     *     
     */
    public void setEquationSource(EquationSource value) {
        this.equationSource = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
