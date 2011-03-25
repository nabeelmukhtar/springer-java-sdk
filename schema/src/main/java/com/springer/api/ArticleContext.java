
package com.springer.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "journalID",
    "volumeIDStart",
    "volumeIDEnd",
    "issueIDStart",
    "issueIDEnd"
})
@XmlRootElement(name = "ArticleContext")
public class ArticleContext
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "JournalID", required = true)
    protected String journalID;
    @XmlElement(name = "VolumeIDStart", required = true)
    protected String volumeIDStart;
    @XmlElement(name = "VolumeIDEnd", required = true)
    protected String volumeIDEnd;
    @XmlElement(name = "IssueIDStart", required = true)
    protected String issueIDStart;
    @XmlElement(name = "IssueIDEnd", required = true)
    protected String issueIDEnd;

    /**
     * Gets the value of the journalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalID() {
        return journalID;
    }

    /**
     * Sets the value of the journalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalID(String value) {
        this.journalID = value;
    }

    /**
     * Gets the value of the volumeIDStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeIDStart() {
        return volumeIDStart;
    }

    /**
     * Sets the value of the volumeIDStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeIDStart(String value) {
        this.volumeIDStart = value;
    }

    /**
     * Gets the value of the volumeIDEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeIDEnd() {
        return volumeIDEnd;
    }

    /**
     * Sets the value of the volumeIDEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeIDEnd(String value) {
        this.volumeIDEnd = value;
    }

    /**
     * Gets the value of the issueIDStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueIDStart() {
        return issueIDStart;
    }

    /**
     * Sets the value of the issueIDStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueIDStart(String value) {
        this.issueIDStart = value;
    }

    /**
     * Gets the value of the issueIDEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueIDEnd() {
        return issueIDEnd;
    }

    /**
     * Sets the value of the issueIDEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueIDEnd(String value) {
        this.issueIDEnd = value;
    }

}
