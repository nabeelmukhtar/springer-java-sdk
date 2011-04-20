
package com.springer.app.meta;



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
 *         &lt;element ref="{http://www.springer.com/app/meta}OrgName"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}GeoOrg" minOccurs="0"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Country" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="geo" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Institution {


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
     * Gets the value of the geoOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getGeoOrg();

    /**
     * Sets the value of the geoOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setGeoOrg(String value);

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCountry();

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCountry(String value);

    /**
     * Gets the value of the geo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getGeo();

    /**
     * Sets the value of the geo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setGeo(String value);

}
