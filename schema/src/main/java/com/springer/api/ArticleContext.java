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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class ArticleContext.
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

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The journal id. */
    @XmlElement(name = "JournalID", required = true)
    protected String journalID;
    
    /** The volume id start. */
    @XmlElement(name = "VolumeIDStart", required = true)
    protected String volumeIDStart;
    
    /** The volume id end. */
    @XmlElement(name = "VolumeIDEnd", required = true)
    protected String volumeIDEnd;
    
    /** The issue id start. */
    @XmlElement(name = "IssueIDStart", required = true)
    protected String issueIDStart;
    
    /** The issue id end. */
    @XmlElement(name = "IssueIDEnd", required = true)
    protected String issueIDEnd;

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
     * Gets the volume id start.
     * 
     * @return the volume id start
     */
    public String getVolumeIDStart() {
        return volumeIDStart;
    }

    /**
     * Sets the volume id start.
     * 
     * @param value the new volume id start
     */
    public void setVolumeIDStart(String value) {
        this.volumeIDStart = value;
    }

    /**
     * Gets the volume id end.
     * 
     * @return the volume id end
     */
    public String getVolumeIDEnd() {
        return volumeIDEnd;
    }

    /**
     * Sets the volume id end.
     * 
     * @param value the new volume id end
     */
    public void setVolumeIDEnd(String value) {
        this.volumeIDEnd = value;
    }

    /**
     * Gets the issue id start.
     * 
     * @return the issue id start
     */
    public String getIssueIDStart() {
        return issueIDStart;
    }

    /**
     * Sets the issue id start.
     * 
     * @param value the new issue id start
     */
    public void setIssueIDStart(String value) {
        this.issueIDStart = value;
    }

    /**
     * Gets the issue id end.
     * 
     * @return the issue id end
     */
    public String getIssueIDEnd() {
        return issueIDEnd;
    }

    /**
     * Sets the issue id end.
     * 
     * @param value the new issue id end
     */
    public void setIssueIDEnd(String value) {
        this.issueIDEnd = value;
    }

}
