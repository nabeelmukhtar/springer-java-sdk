
package com.springer.api.schema;



/**
 * <p>Java class for SeriesID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeriesID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}SeriesID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface SeriesID {


    /**
     * Gets the value of the seriesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getSeriesID();

    /**
     * Sets the value of the seriesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSeriesID(Long value);

}
