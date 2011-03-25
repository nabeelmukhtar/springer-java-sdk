
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
    "formalPara"
})
@XmlRootElement(name = "Biography")
public class Biography implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "FormalPara", required = true)
    protected FormalPara formalPara;

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
