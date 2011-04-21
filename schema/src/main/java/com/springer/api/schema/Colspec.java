
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
 *       &lt;attribute name="align" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="char" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="colname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="colnum" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Colspec {


    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAlign();

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAlign(String value);

    /**
     * Gets the value of the char property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getChar();

    /**
     * Sets the value of the char property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setChar(String value);

    /**
     * Gets the value of the colname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getColname();

    /**
     * Sets the value of the colname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setColname(String value);

    /**
     * Gets the value of the colnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getColnum();

    /**
     * Sets the value of the colnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setColnum(Long value);

}
