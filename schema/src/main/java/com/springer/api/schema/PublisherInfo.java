
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
 *         &lt;element ref="{}PublisherName"/>
 *         &lt;element ref="{}PublisherLocation"/>
 *         &lt;element ref="{}PublisherURL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface PublisherInfo {


    /**
     * Gets the value of the publisherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublisherName();

    /**
     * Sets the value of the publisherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublisherName(String value);

    /**
     * Gets the value of the publisherLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublisherLocation();

    /**
     * Sets the value of the publisherLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublisherLocation(String value);

    /**
     * Gets the value of the publisherURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublisherURL();

    /**
     * Sets the value of the publisherURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublisherURL(String value);

}
