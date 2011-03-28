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
 * The Class VolumeInfo.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "volumeIDStart",
    "volumeIDEnd",
    "volumeIssueCount"
})
@XmlRootElement(name = "VolumeInfo")
public class VolumeInfo
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The volume id start. */
    @XmlElement(name = "VolumeIDStart", required = true)
    protected String volumeIDStart;
    
    /** The volume id end. */
    @XmlElement(name = "VolumeIDEnd", required = true)
    protected String volumeIDEnd;
    
    /** The volume issue count. */
    @XmlElement(name = "VolumeIssueCount", required = true)
    protected String volumeIssueCount;
    
    /** The toc levels. */
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long tocLevels;
    
    /** The volume type. */
    @XmlAttribute(name = "VolumeType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String volumeType;

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
     * Gets the volume issue count.
     * 
     * @return the volume issue count
     */
    public String getVolumeIssueCount() {
        return volumeIssueCount;
    }

    /**
     * Sets the volume issue count.
     * 
     * @param value the new volume issue count
     */
    public void setVolumeIssueCount(String value) {
        this.volumeIssueCount = value;
    }

    /**
     * Gets the toc levels.
     * 
     * @return the toc levels
     */
    public Long getTocLevels() {
        return tocLevels;
    }

    /**
     * Sets the toc levels.
     * 
     * @param value the new toc levels
     */
    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

    /**
     * Gets the volume type.
     * 
     * @return the volume type
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * Sets the volume type.
     * 
     * @param value the new volume type
     */
    public void setVolumeType(String value) {
        this.volumeType = value;
    }

}
