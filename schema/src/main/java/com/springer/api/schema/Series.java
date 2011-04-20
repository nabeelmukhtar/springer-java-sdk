
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
 *         &lt;element ref="{}SeriesInfo"/>
 *         &lt;element ref="{}Book"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Series {


    /**
     * Gets the value of the seriesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesInfo }
     *     
     */
    SeriesInfo getSeriesInfo();

    /**
     * Sets the value of the seriesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesInfo }
     *     
     */
    void setSeriesInfo(SeriesInfo value);

    /**
     * Gets the value of the book property.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    Book getBook();

    /**
     * Sets the value of the book property.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    void setBook(Book value);

}
