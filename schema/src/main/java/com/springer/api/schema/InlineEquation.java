
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
public interface InlineEquation {


    /**
     * Gets the value of the inlineMediaObject property.
     * 
     * @return
     *     possible object is
     *     {@link ImageObject }
     *     
     */
    ImageObject getInlineMediaObject();

    /**
     * Sets the value of the inlineMediaObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageObject }
     *     
     */
    void setInlineMediaObject(ImageObject value);

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
