
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
 *         &lt;element ref="{}OrgDivision" minOccurs="0"/>
 *         &lt;element ref="{}OrgName"/>
 *         &lt;element ref="{}OrgAddress"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Affiliation {


    /**
     * Gets the value of the orgDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getOrgDivision();

    /**
     * Sets the value of the orgDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setOrgDivision(String value);

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getOrgName();

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setOrgName(String value);

    /**
     * Gets the value of the orgAddress property.
     * 
     * @return
     *     possible object is
     *     {@link OrgAddress }
     *     
     */
    OrgAddress getOrgAddress();

    /**
     * Sets the value of the orgAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgAddress }
     *     
     */
    void setOrgAddress(OrgAddress value);

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
