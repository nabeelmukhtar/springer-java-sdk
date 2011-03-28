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
 * The Class Affiliation.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orgDivision",
    "orgName",
    "orgAddress"
})
@XmlRootElement(name = "Affiliation")
public class Affiliation
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The org division. */
    @XmlElement(name = "OrgDivision")
    protected String orgDivision;
    
    /** The org name. */
    @XmlElement(name = "OrgName", required = true)
    protected String orgName;
    
    /** The org address. */
    @XmlElement(name = "OrgAddress", required = true)
    protected OrgAddress orgAddress;
    
    /** The id. */
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the org division.
     * 
     * @return the org division
     */
    public String getOrgDivision() {
        return orgDivision;
    }

    /**
     * Sets the org division.
     * 
     * @param value the new org division
     */
    public void setOrgDivision(String value) {
        this.orgDivision = value;
    }

    /**
     * Gets the org name.
     * 
     * @return the org name
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the org name.
     * 
     * @param value the new org name
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the org address.
     * 
     * @return the org address
     */
    public OrgAddress getOrgAddress() {
        return orgAddress;
    }

    /**
     * Sets the org address.
     * 
     * @param value the new org address
     */
    public void setOrgAddress(OrgAddress value) {
        this.orgAddress = value;
    }

    /**
     * Gets the iD.
     * 
     * @return the iD
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the iD.
     * 
     * @param value the new iD
     */
    public void setID(String value) {
        this.id = value;
    }

}
