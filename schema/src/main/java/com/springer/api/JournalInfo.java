
package com.springer.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "journalID",
    "journalPrintISSN",
    "journalElectronicISSN",
    "journalSPIN",
    "journalTitle",
    "journalSubTitle",
    "journalAbbreviatedTitle",
    "journalSubjectGroup"
})
@XmlRootElement(name = "JournalInfo")
public class JournalInfo
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "JournalID", required = true)
    protected String journalID;
    @XmlElement(name = "JournalPrintISSN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String journalPrintISSN;
    @XmlElement(name = "JournalElectronicISSN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String journalElectronicISSN;
    @XmlElement(name = "JournalSPIN", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long journalSPIN;
    @XmlElement(name = "JournalTitle", required = true)
    protected String journalTitle;
    @XmlElement(name = "JournalSubTitle")
    protected String journalSubTitle;
    @XmlElement(name = "JournalAbbreviatedTitle", required = true)
    protected String journalAbbreviatedTitle;
    @XmlElement(name = "JournalSubjectGroup", required = true)
    protected JournalSubjectGroup journalSubjectGroup;
    @XmlAttribute(name = "JournalProductType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String journalProductType;
    @XmlAttribute(name = "NumberingStyle", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberingStyle;

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
     * Gets the value of the journalPrintISSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalPrintISSN() {
        return journalPrintISSN;
    }

    /**
     * Sets the value of the journalPrintISSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalPrintISSN(String value) {
        this.journalPrintISSN = value;
    }

    /**
     * Gets the value of the journalElectronicISSN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalElectronicISSN() {
        return journalElectronicISSN;
    }

    /**
     * Sets the value of the journalElectronicISSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalElectronicISSN(String value) {
        this.journalElectronicISSN = value;
    }

    /**
     * Gets the value of the journalSPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getJournalSPIN() {
        return journalSPIN;
    }

    /**
     * Sets the value of the journalSPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalSPIN(Long value) {
        this.journalSPIN = value;
    }

    /**
     * Gets the value of the journalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalTitle() {
        return journalTitle;
    }

    /**
     * Sets the value of the journalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalTitle(String value) {
        this.journalTitle = value;
    }

    /**
     * Gets the value of the journalSubTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalSubTitle() {
        return journalSubTitle;
    }

    /**
     * Sets the value of the journalSubTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalSubTitle(String value) {
        this.journalSubTitle = value;
    }

    /**
     * Gets the value of the journalAbbreviatedTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalAbbreviatedTitle() {
        return journalAbbreviatedTitle;
    }

    /**
     * Sets the value of the journalAbbreviatedTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalAbbreviatedTitle(String value) {
        this.journalAbbreviatedTitle = value;
    }

    /**
     * Gets the value of the journalSubjectGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JournalSubjectGroup }
     *     
     */
    public JournalSubjectGroup getJournalSubjectGroup() {
        return journalSubjectGroup;
    }

    /**
     * Sets the value of the journalSubjectGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalSubjectGroup }
     *     
     */
    public void setJournalSubjectGroup(JournalSubjectGroup value) {
        this.journalSubjectGroup = value;
    }

    /**
     * Gets the value of the journalProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalProductType() {
        return journalProductType;
    }

    /**
     * Sets the value of the journalProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalProductType(String value) {
        this.journalProductType = value;
    }

    /**
     * Gets the value of the numberingStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberingStyle() {
        return numberingStyle;
    }

    /**
     * Sets the value of the numberingStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberingStyle(String value) {
        this.numberingStyle = value;
    }

}
