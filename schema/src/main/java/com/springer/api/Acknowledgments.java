
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Heading"/>
 *         &lt;element ref="{}SimplePara"/>
 *         &lt;element ref="{}FormalPara"/>
 *       &lt;/sequence>
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
    "simplePara",
    "formalPara"
})
@XmlRootElement(name = "Acknowledgments")
public class Acknowledgments
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", required = true)
    protected Heading heading;
    @XmlElement(name = "SimplePara", required = true)
    protected SimplePara simplePara;
    @XmlElement(name = "FormalPara", required = true)
    protected FormalPara formalPara;

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
     * Gets the value of the simplePara property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePara }
     *     
     */
    public SimplePara getSimplePara() {
        return simplePara;
    }

    /**
     * Sets the value of the simplePara property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePara }
     *     
     */
    public void setSimplePara(SimplePara value) {
        this.simplePara = value;
    }

    /**
     * Gets the value of the formalPara property.
     * 
     * @return
     *     possible object is
     *     {@link FormalPara }
     *     
     */
    public FormalPara getFormalPara() {
        return formalPara;
    }

    /**
     * Sets the value of the formalPara property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormalPara }
     *     
     */
    public void setFormalPara(FormalPara value) {
        this.formalPara = value;
    }

}
