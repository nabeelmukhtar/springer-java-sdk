
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
 *         &lt;element ref="{}JournalID"/>
 *         &lt;element ref="{}JournalPrintISSN"/>
 *         &lt;element ref="{}JournalElectronicISSN"/>
 *         &lt;element ref="{}JournalSPIN" minOccurs="0"/>
 *         &lt;element ref="{}JournalTitle"/>
 *         &lt;element ref="{}JournalSubTitle" minOccurs="0"/>
 *         &lt;element ref="{}JournalAbbreviatedTitle"/>
 *         &lt;element ref="{}JournalSubjectGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="JournalProductType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="NumberingStyle" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface JournalInfo {


    /**
     * Gets the value of the journalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getJournalID();

    /**
     * Sets the value of the journalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setJournalID(String value);

    /**
     * Gets the value of the journalPrintISSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getJournalPrintISSN();

    /**
     * Sets the value of the journalPrintISSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setJournalPrintISSN(String value);

    /**
     * Gets the value of the journalElectronicISSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getJournalElectronicISSN();

    /**
     * Sets the value of the journalElectronicISSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setJournalElectronicISSN(String value);

    /**
     * Gets the value of the journalSPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getJournalSPIN();

    /**
     * Sets the value of the journalSPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setJournalSPIN(Long value);

    /**
     * Gets the value of the journalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getJournalTitle();

    /**
     * Sets the value of the journalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setJournalTitle(String value);

    /**
     * Gets the value of the journalSubTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getJournalSubTitle();

    /**
     * Sets the value of the journalSubTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setJournalSubTitle(String value);

    /**
     * Gets the value of the journalAbbreviatedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getJournalAbbreviatedTitle();

    /**
     * Sets the value of the journalAbbreviatedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setJournalAbbreviatedTitle(String value);

    /**
     * Gets the value of the journalSubjectGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JournalSubjectGroup }
     *     
     */
    JournalSubjectGroup getJournalSubjectGroup();

    /**
     * Sets the value of the journalSubjectGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalSubjectGroup }
     *     
     */
    void setJournalSubjectGroup(JournalSubjectGroup value);

    /**
     * Gets the value of the journalProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getJournalProductType();

    /**
     * Sets the value of the journalProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setJournalProductType(String value);

    /**
     * Gets the value of the numberingStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getNumberingStyle();

    /**
     * Sets the value of the numberingStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNumberingStyle(String value);

}
