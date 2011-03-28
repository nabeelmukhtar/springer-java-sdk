/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

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
 * The Class JournalInfo.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The journal id. */
    @XmlElement(name = "JournalID", required = true)
    protected String journalID;
    
    /** The journal print issn. */
    @XmlElement(name = "JournalPrintISSN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String journalPrintISSN;
    
    /** The journal electronic issn. */
    @XmlElement(name = "JournalElectronicISSN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String journalElectronicISSN;
    
    /** The journal spin. */
    @XmlElement(name = "JournalSPIN", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long journalSPIN;
    
    /** The journal title. */
    @XmlElement(name = "JournalTitle", required = true)
    protected String journalTitle;
    
    /** The journal sub title. */
    @XmlElement(name = "JournalSubTitle")
    protected String journalSubTitle;
    
    /** The journal abbreviated title. */
    @XmlElement(name = "JournalAbbreviatedTitle", required = true)
    protected String journalAbbreviatedTitle;
    
    /** The journal subject group. */
    @XmlElement(name = "JournalSubjectGroup", required = true)
    protected JournalSubjectGroup journalSubjectGroup;
    
    /** The journal product type. */
    @XmlAttribute(name = "JournalProductType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String journalProductType;
    
    /** The numbering style. */
    @XmlAttribute(name = "NumberingStyle", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberingStyle;

    /**
     * Gets the journal id.
     * 
     * @return the journal id
     */
    public String getJournalID() {
        return journalID;
    }

    /**
     * Sets the journal id.
     * 
     * @param value the new journal id
     */
    public void setJournalID(String value) {
        this.journalID = value;
    }

    /**
     * Gets the journal print issn.
     * 
     * @return the journal print issn
     */
    public String getJournalPrintISSN() {
        return journalPrintISSN;
    }

    /**
     * Sets the journal print issn.
     * 
     * @param value the new journal print issn
     */
    public void setJournalPrintISSN(String value) {
        this.journalPrintISSN = value;
    }

    /**
     * Gets the journal electronic issn.
     * 
     * @return the journal electronic issn
     */
    public String getJournalElectronicISSN() {
        return journalElectronicISSN;
    }

    /**
     * Sets the journal electronic issn.
     * 
     * @param value the new journal electronic issn
     */
    public void setJournalElectronicISSN(String value) {
        this.journalElectronicISSN = value;
    }

    /**
     * Gets the journal spin.
     * 
     * @return the journal spin
     */
    public Long getJournalSPIN() {
        return journalSPIN;
    }

    /**
     * Sets the journal spin.
     * 
     * @param value the new journal spin
     */
    public void setJournalSPIN(Long value) {
        this.journalSPIN = value;
    }

    /**
     * Gets the journal title.
     * 
     * @return the journal title
     */
    public String getJournalTitle() {
        return journalTitle;
    }

    /**
     * Sets the journal title.
     * 
     * @param value the new journal title
     */
    public void setJournalTitle(String value) {
        this.journalTitle = value;
    }

    /**
     * Gets the journal sub title.
     * 
     * @return the journal sub title
     */
    public String getJournalSubTitle() {
        return journalSubTitle;
    }

    /**
     * Sets the journal sub title.
     * 
     * @param value the new journal sub title
     */
    public void setJournalSubTitle(String value) {
        this.journalSubTitle = value;
    }

    /**
     * Gets the journal abbreviated title.
     * 
     * @return the journal abbreviated title
     */
    public String getJournalAbbreviatedTitle() {
        return journalAbbreviatedTitle;
    }

    /**
     * Sets the journal abbreviated title.
     * 
     * @param value the new journal abbreviated title
     */
    public void setJournalAbbreviatedTitle(String value) {
        this.journalAbbreviatedTitle = value;
    }

    /**
     * Gets the journal subject group.
     * 
     * @return the journal subject group
     */
    public JournalSubjectGroup getJournalSubjectGroup() {
        return journalSubjectGroup;
    }

    /**
     * Sets the journal subject group.
     * 
     * @param value the new journal subject group
     */
    public void setJournalSubjectGroup(JournalSubjectGroup value) {
        this.journalSubjectGroup = value;
    }

    /**
     * Gets the journal product type.
     * 
     * @return the journal product type
     */
    public String getJournalProductType() {
        return journalProductType;
    }

    /**
     * Sets the journal product type.
     * 
     * @param value the new journal product type
     */
    public void setJournalProductType(String value) {
        this.journalProductType = value;
    }

    /**
     * Gets the numbering style.
     * 
     * @return the numbering style
     */
    public String getNumberingStyle() {
        return numberingStyle;
    }

    /**
     * Sets the numbering style.
     * 
     * @param value the new numbering style
     */
    public void setNumberingStyle(String value) {
        this.numberingStyle = value;
    }

}
