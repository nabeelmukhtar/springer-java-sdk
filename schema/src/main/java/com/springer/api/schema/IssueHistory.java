
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
 *         &lt;element ref="{}OnlineDate" minOccurs="0"/>
 *         &lt;element ref="{}PrintDate"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}CoverDate"/>
 *           &lt;element ref="{}PricelistYear"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface IssueHistory {


    /**
     * Gets the value of the onlineDate property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineDate }
     *     
     */
    OnlineDate getOnlineDate();

    /**
     * Sets the value of the onlineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineDate }
     *     
     */
    void setOnlineDate(OnlineDate value);

    /**
     * Gets the value of the printDate property.
     * 
     * @return
     *     possible object is
     *     {@link PrintDate }
     *     
     */
    PrintDate getPrintDate();

    /**
     * Sets the value of the printDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintDate }
     *     
     */
    void setPrintDate(PrintDate value);

    /**
     * Gets the value of the coverDate property.
     * 
     * @return
     *     possible object is
     *     {@link CoverDate }
     *     
     */
    CoverDate getCoverDate();

    /**
     * Sets the value of the coverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverDate }
     *     
     */
    void setCoverDate(CoverDate value);

    /**
     * Gets the value of the pricelistYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getPricelistYear();

    /**
     * Sets the value of the pricelistYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPricelistYear(Long value);

}
