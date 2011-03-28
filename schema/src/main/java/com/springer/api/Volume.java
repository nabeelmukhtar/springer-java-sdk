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
 * The Class Volume.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "volumeInfo",
    "issue"
})
@XmlRootElement(name = "Volume")
public class Volume
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The volume info. */
    @XmlElement(name = "VolumeInfo", required = true)
    protected VolumeInfo volumeInfo;
    
    /** The issue. */
    @XmlElement(name = "Issue", required = true)
    protected Issue issue;
    
    /** The output medium. */
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    /**
     * Gets the volume info.
     * 
     * @return the volume info
     */
    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    /**
     * Sets the volume info.
     * 
     * @param value the new volume info
     */
    public void setVolumeInfo(VolumeInfo value) {
        this.volumeInfo = value;
    }

    /**
     * Gets the issue.
     * 
     * @return the issue
     */
    public Issue getIssue() {
        return issue;
    }

    /**
     * Sets the issue.
     * 
     * @param value the new issue
     */
    public void setIssue(Issue value) {
        this.issue = value;
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
