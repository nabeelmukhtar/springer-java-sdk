
package com.springer.api.schema;

import java.util.List;


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
 *         &lt;element ref="{}Para" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}Figure"/>
 *           &lt;element ref="{}Section4" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Section3 {


    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Heading }
     *     
     */
    Heading getHeading();

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heading }
     *     
     */
    void setHeading(Heading value);

    /**
     * Gets the value of the para property.
     * 
     * @return
     *     possible object is
     *     {@link Para }
     *     
     */
    Para getPara();

    /**
     * Sets the value of the para property.
     * 
     * @param value
     *     allowed object is
     *     {@link Para }
     *     
     */
    void setPara(Para value);

    /**
     * Gets the value of the figure property.
     * 
     * @return
     *     possible object is
     *     {@link Figure }
     *     
     */
    Figure getFigure();

    /**
     * Sets the value of the figure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Figure }
     *     
     */
    void setFigure(Figure value);

    /**
     * Gets the value of the section4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the section4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSection4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Section4 }
     * 
     * 
     */
    List<Section4> getSection4();

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