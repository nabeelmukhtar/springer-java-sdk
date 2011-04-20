
package com.springer.api.schema;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}SeriesID">
 *       &lt;sequence>
 *         &lt;element ref="{}SeriesTitle"/>
 *         &lt;element ref="{}SeriesAbbreviatedTitle"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SeriesType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TocLevels" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface SeriesInfo
    extends SeriesID
{


    /**
     * Gets the value of the seriesTitle property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesTitle }
     *     
     */
    SeriesTitle getSeriesTitle();

    /**
     * Sets the value of the seriesTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesTitle }
     *     
     */
    void setSeriesTitle(SeriesTitle value);

    /**
     * Gets the value of the seriesAbbreviatedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSeriesAbbreviatedTitle();

    /**
     * Sets the value of the seriesAbbreviatedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSeriesAbbreviatedTitle(String value);

    /**
     * Gets the value of the seriesType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSeriesType();

    /**
     * Sets the value of the seriesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSeriesType(String value);

    /**
     * Gets the value of the tocLevels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getTocLevels();

    /**
     * Sets the value of the tocLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTocLevels(Long value);

}
