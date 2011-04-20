
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
 *         &lt;element ref="{}VolumeIDStart"/>
 *         &lt;element ref="{}VolumeIDEnd"/>
 *         &lt;element ref="{}IssueIDStart"/>
 *         &lt;element ref="{}IssueIDEnd"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ArticleContext {


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
     * Gets the value of the volumeIDStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getVolumeIDStart();

    /**
     * Sets the value of the volumeIDStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setVolumeIDStart(String value);

    /**
     * Gets the value of the volumeIDEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getVolumeIDEnd();

    /**
     * Sets the value of the volumeIDEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setVolumeIDEnd(String value);

    /**
     * Gets the value of the issueIDStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIssueIDStart();

    /**
     * Sets the value of the issueIDStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIssueIDStart(String value);

    /**
     * Gets the value of the issueIDEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIssueIDEnd();

    /**
     * Sets the value of the issueIDEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIssueIDEnd(String value);

}
