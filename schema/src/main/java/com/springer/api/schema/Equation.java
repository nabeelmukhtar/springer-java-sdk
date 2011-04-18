
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
 *         &lt;element ref="{}EquationNumber"/>
 *         &lt;element ref="{}MediaObject"/>
 *         &lt;element ref="{}EquationSource"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Equation {


    /**
     * Gets the value of the equationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getEquationNumber();

    /**
     * Sets the value of the equationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setEquationNumber(Long value);

    /**
     * Gets the value of the mediaObject property.
     * 
     * @return
     *     possible object is
     *     {@link MediaObject }
     *     
     */
    MediaObject getMediaObject();

    /**
     * Sets the value of the mediaObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaObject }
     *     
     */
    void setMediaObject(MediaObject value);

    /**
     * Gets the value of the equationSource property.
     * 
     * @return
     *     possible object is
     *     {@link EquationSource }
     *     
     */
    EquationSource getEquationSource();

    /**
     * Sets the value of the equationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquationSource }
     *     
     */
    void setEquationSource(EquationSource value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getID();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setID(String value);

}
