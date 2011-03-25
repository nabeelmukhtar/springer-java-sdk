
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
 *         &lt;element ref="{}RefSource"/>
 *         &lt;element ref="{}RefTarget"/>
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
    "refSource",
    "refTarget"
})
@XmlRootElement(name = "ExternalRef")
public class ExternalRef implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "RefSource", required = true)
    protected String refSource;
    @XmlElement(name = "RefTarget", required = true)
    protected RefTarget refTarget;

    /**
     * Gets the value of the refSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefSource() {
        return refSource;
    }

    /**
     * Sets the value of the refSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefSource(String value) {
        this.refSource = value;
    }

    /**
     * Gets the value of the refTarget property.
     * 
     * @return
     *     possible object is
     *     {@link RefTarget }
     *     
     */
    public RefTarget getRefTarget() {
        return refTarget;
    }

    /**
     * Sets the value of the refTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefTarget }
     *     
     */
    public void setRefTarget(RefTarget value) {
        this.refTarget = value;
    }

}
