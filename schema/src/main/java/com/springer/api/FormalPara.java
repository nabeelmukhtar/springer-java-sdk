
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
 *         &lt;element ref="{}Heading"/>
 *         &lt;element ref="{}Para"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OutputMedium" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="RenderingStyle" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "para"
})
@XmlRootElement(name = "FormalPara")
public class FormalPara
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", required = true)
    protected Heading heading;
    @XmlElement(name = "Para", required = true)
    protected Para para;
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;
    @XmlAttribute(name = "RenderingStyle", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String renderingStyle;

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Heading }
     *     
     */
    public Heading getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heading }
     *     
     */
    public void setHeading(Heading value) {
        this.heading = value;
    }

    /**
     * Gets the value of the para property.
     * 
     * @return
     *     possible object is
     *     {@link Para }
     *     
     */
    public Para getPara() {
        return para;
    }

    /**
     * Sets the value of the para property.
     * 
     * @param value
     *     allowed object is
     *     {@link Para }
     *     
     */
    public void setPara(Para value) {
        this.para = value;
    }

    /**
     * Gets the value of the outputMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputMedium() {
        return outputMedium;
    }

    /**
     * Sets the value of the outputMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

    /**
     * Gets the value of the renderingStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingStyle() {
        return renderingStyle;
    }

    /**
     * Sets the value of the renderingStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderingStyle(String value) {
        this.renderingStyle = value;
    }

}
