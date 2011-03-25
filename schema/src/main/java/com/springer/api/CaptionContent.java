
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
 *         &lt;element ref="{}SimplePara"/>
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
    "simplePara"
})
@XmlRootElement(name = "CaptionContent")
public class CaptionContent
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SimplePara", required = true)
    protected SimplePara simplePara;

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

}
