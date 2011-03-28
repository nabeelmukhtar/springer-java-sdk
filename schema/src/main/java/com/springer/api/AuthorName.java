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
 * The Class AuthorName.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "givenName",
    "familyName"
})
@XmlRootElement(name = "AuthorName")
public class AuthorName implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The given name. */
    @XmlElement(name = "GivenName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String givenName;
    
    /** The family name. */
    @XmlElement(name = "FamilyName", required = true)
    protected String familyName;
    
    /** The display order. */
    @XmlAttribute(name = "DisplayOrder", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String displayOrder;

    /**
     * Gets the given name.
     * 
     * @return the given name
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the given name.
     * 
     * @param value the new given name
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the family name.
     * 
     * @return the family name
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the family name.
     * 
     * @param value the new family name
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the display order.
     * 
     * @return the display order
     */
    public String getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the display order.
     * 
     * @param value the new display order
     */
    public void setDisplayOrder(String value) {
        this.displayOrder = value;
    }

}
