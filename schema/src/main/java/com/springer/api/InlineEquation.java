
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
 *         &lt;element ref="{}InlineMediaObject"/>
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
    "inlineMediaObject",
    "equationSource"
})
@XmlRootElement(name = "InlineEquation")
public class InlineEquation implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "InlineMediaObject", required = true)
    protected ImageObject inlineMediaObject;
    @XmlElement(name = "EquationSource", required = true)
    protected EquationSource equationSource;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the value of the inlineMediaObject property.
     * 
     * @return
     *     possible object is
     *     {@link ImageObject }
     *     
     */
    public ImageObject getInlineMediaObject() {
        return inlineMediaObject;
    }

    /**
     * Sets the value of the inlineMediaObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageObject }
     *     
     */
    public void setInlineMediaObject(ImageObject value) {
        this.inlineMediaObject = value;
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
