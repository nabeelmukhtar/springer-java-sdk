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

package com.springer.app.meta;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class Institution.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orgName",
    "geoOrg",
    "country"
})
@XmlRootElement(name = "Institution")
public class Institution
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The org name. */
    @XmlElement(name = "OrgName", required = true)
    protected String orgName;
    
    /** The geo org. */
    @XmlElement(name = "GeoOrg")
    protected String geoOrg;
    
    /** The country. */
    @XmlElement(name = "Country", required = true)
    protected String country;
    
    /** The geo. */
    @XmlAttribute
    protected String geo;

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
     * Gets the geo org.
     * 
     * @return the geo org
     */
    public String getGeoOrg() {
        return geoOrg;
    }

    /**
     * Sets the geo org.
     * 
     * @param value the new geo org
     */
    public void setGeoOrg(String value) {
        this.geoOrg = value;
    }

    /**
     * Gets the country.
     * 
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country.
     * 
     * @param value the new country
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the geo.
     * 
     * @return the geo
     */
    public String getGeo() {
        return geo;
    }

    /**
     * Sets the geo.
     * 
     * @param value the new geo
     */
    public void setGeo(String value) {
        this.geo = value;
    }

}
