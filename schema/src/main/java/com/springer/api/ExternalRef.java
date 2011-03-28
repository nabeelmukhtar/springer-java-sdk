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
 * The Class ExternalRef.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refSource",
    "refTarget"
})
@XmlRootElement(name = "ExternalRef")
public class ExternalRef implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The ref source. */
    @XmlElement(name = "RefSource", required = true)
    protected String refSource;
    
    /** The ref target. */
    @XmlElement(name = "RefTarget", required = true)
    protected RefTarget refTarget;

    /**
     * Gets the ref source.
     * 
     * @return the ref source
     */
    public String getRefSource() {
        return refSource;
    }

    /**
     * Sets the ref source.
     * 
     * @param value the new ref source
     */
    public void setRefSource(String value) {
        this.refSource = value;
    }

    /**
     * Gets the ref target.
     * 
     * @return the ref target
     */
    public RefTarget getRefTarget() {
        return refTarget;
    }

    /**
     * Sets the ref target.
     * 
     * @param value the new ref target
     */
    public void setRefTarget(RefTarget value) {
        this.refTarget = value;
    }

}
