
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
 *         &lt;element ref="{}query"/>
 *         &lt;element ref="{}apiKey" minOccurs="0"/>
 *         &lt;element ref="{}result"/>
 *         &lt;element ref="{}records"/>
 *         &lt;element ref="{}facets"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Response {


    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getQuery();

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setQuery(String value);

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getApiKey();

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setApiKey(String value);

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    Result getResult();

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    void setResult(Result value);

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link Records }
     *     
     */
    Records getRecords();

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link Records }
     *     
     */
    void setRecords(Records value);

    /**
     * Gets the value of the facets property.
     * 
     * @return
     *     possible object is
     *     {@link Facets }
     *     
     */
    Facets getFacets();

    /**
     * Sets the value of the facets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Facets }
     *     
     */
    void setFacets(Facets value);

}
