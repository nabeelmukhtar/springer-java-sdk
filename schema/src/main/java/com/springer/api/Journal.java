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


/**
 * The Class Journal.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "journalInfo",
    "journalOnlineFirst",
    "volume"
})
@XmlRootElement(name = "Journal")
public class Journal
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The journal info. */
    @XmlElement(name = "JournalInfo", required = true)
    protected JournalInfo journalInfo;
    
    /** The journal online first. */
    @XmlElement(name = "JournalOnlineFirst")
    protected JournalOnlineFirst journalOnlineFirst;
    
    /** The volume. */
    @XmlElement(name = "Volume")
    protected Volume volume;
    
    /** The output medium. */
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    /**
     * Gets the journal info.
     * 
     * @return the journal info
     */
    public JournalInfo getJournalInfo() {
        return journalInfo;
    }

    /**
     * Sets the journal info.
     * 
     * @param value the new journal info
     */
    public void setJournalInfo(JournalInfo value) {
        this.journalInfo = value;
    }

    /**
     * Gets the journal online first.
     * 
     * @return the journal online first
     */
    public JournalOnlineFirst getJournalOnlineFirst() {
        return journalOnlineFirst;
    }

    /**
     * Sets the journal online first.
     * 
     * @param value the new journal online first
     */
    public void setJournalOnlineFirst(JournalOnlineFirst value) {
        this.journalOnlineFirst = value;
    }

    /**
     * Gets the volume.
     * 
     * @return the volume
     */
    public Volume getVolume() {
        return volume;
    }

    /**
     * Sets the volume.
     * 
     * @param value the new volume
     */
    public void setVolume(Volume value) {
        this.volume = value;
    }

    /**
     * Gets the output medium.
     * 
     * @return the output medium
     */
    public String getOutputMedium() {
        return outputMedium;
    }

    /**
     * Sets the output medium.
     * 
     * @param value the new output medium
     */
    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

}
