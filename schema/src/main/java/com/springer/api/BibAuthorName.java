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
 * The Class BibAuthorName.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "initials",
    "familyName",
    "particle"
})
@XmlRootElement(name = "BibAuthorName")
public class BibAuthorName
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The initials. */
    @XmlElement(name = "Initials", required = true)
    protected String initials;
    
    /** The family name. */
    @XmlElement(name = "FamilyName", required = true)
    protected String familyName;
    
    /** The particle. */
    @XmlElement(name = "Particle")
    protected String particle;

    /**
     * Gets the initials.
     * 
     * @return the initials
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the initials.
     * 
     * @param value the new initials
     */
    public void setInitials(String value) {
        this.initials = value;
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
     * Gets the particle.
     * 
     * @return the particle
     */
    public String getParticle() {
        return particle;
    }

    /**
     * Sets the particle.
     * 
     * @param value the new particle
     */
    public void setParticle(String value) {
        this.particle = value;
    }

}
