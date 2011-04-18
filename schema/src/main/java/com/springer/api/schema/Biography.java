
package com.springer.api.schema;



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
public interface Biography {


    /**
     * Gets the value of the formalPara property.
     * 
     * @return
     *     possible object is
     *     {@link FormalPara }
     *     
     */
    FormalPara getFormalPara();

    /**
     * Sets the value of the formalPara property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormalPara }
     *     
     */
    void setFormalPara(FormalPara value);

}
