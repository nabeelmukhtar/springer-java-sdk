
package com.springer.api.impl;

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

import com.springer.api.JournalInfo;
import com.springer.api.JournalSubjectGroup;

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
public class JournalInfoImpl
    implements Serializable, JournalInfo
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
    @XmlElement(name = "JournalSubjectGroup", required = true, type = JournalSubjectGroupImpl.class)
    protected JournalSubjectGroupImpl journalSubjectGroup;
    @XmlAttribute(name = "JournalProductType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String journalProductType;
    @XmlAttribute(name = "NumberingStyle", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberingStyle;

    public String getJournalID() {
        return journalID;
    }

    public void setJournalID(String value) {
        this.journalID = value;
    }

    public String getJournalPrintISSN() {
        return journalPrintISSN;
    }

    public void setJournalPrintISSN(String value) {
        this.journalPrintISSN = value;
    }

    public String getJournalElectronicISSN() {
        return journalElectronicISSN;
    }

    public void setJournalElectronicISSN(String value) {
        this.journalElectronicISSN = value;
    }

    public Long getJournalSPIN() {
        return journalSPIN;
    }

    public void setJournalSPIN(Long value) {
        this.journalSPIN = value;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String value) {
        this.journalTitle = value;
    }

    public String getJournalSubTitle() {
        return journalSubTitle;
    }

    public void setJournalSubTitle(String value) {
        this.journalSubTitle = value;
    }

    public String getJournalAbbreviatedTitle() {
        return journalAbbreviatedTitle;
    }

    public void setJournalAbbreviatedTitle(String value) {
        this.journalAbbreviatedTitle = value;
    }

    public JournalSubjectGroup getJournalSubjectGroup() {
        return journalSubjectGroup;
    }

    public void setJournalSubjectGroup(JournalSubjectGroup value) {
        this.journalSubjectGroup = ((JournalSubjectGroupImpl) value);
    }

    public String getJournalProductType() {
        return journalProductType;
    }

    public void setJournalProductType(String value) {
        this.journalProductType = value;
    }

    public String getNumberingStyle() {
        return numberingStyle;
    }

    public void setNumberingStyle(String value) {
        this.numberingStyle = value;
    }

}
