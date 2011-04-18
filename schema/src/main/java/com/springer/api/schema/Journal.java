
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
 *         &lt;element ref="{}JournalInfo"/>
 *         &lt;element ref="{}JournalOnlineFirst"/>
 *         &lt;element ref="{}Volume"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OutputMedium" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Journal {


    /**
     * Gets the value of the journalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JournalInfo }
     *     
     */
    JournalInfo getJournalInfo();

    /**
     * Sets the value of the journalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalInfo }
     *     
     */
    void setJournalInfo(JournalInfo value);

    /**
     * Gets the value of the journalOnlineFirst property.
     * 
     * @return
     *     possible object is
     *     {@link JournalOnlineFirst }
     *     
     */
    JournalOnlineFirst getJournalOnlineFirst();

    /**
     * Sets the value of the journalOnlineFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalOnlineFirst }
     *     
     */
    void setJournalOnlineFirst(JournalOnlineFirst value);

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Volume }
     *     
     */
    Volume getVolume();

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volume }
     *     
     */
    void setVolume(Volume value);

    /**
     * Gets the value of the outputMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getOutputMedium();

    /**
     * Sets the value of the outputMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setOutputMedium(String value);

}
