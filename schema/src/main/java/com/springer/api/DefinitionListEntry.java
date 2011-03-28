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
 * The Class DefinitionListEntry.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "term",
    "description"
})
@XmlRootElement(name = "DefinitionListEntry")
public class DefinitionListEntry
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The term. */
    @XmlElement(name = "Term", required = true)
    protected Term term;
    
    /** The description. */
    @XmlElement(name = "Description", required = true)
    protected Description description;

    /**
     * Gets the term.
     * 
     * @return the term
     */
    public Term getTerm() {
        return term;
    }

    /**
     * Sets the term.
     * 
     * @param value the new term
     */
    public void setTerm(Term value) {
        this.term = value;
    }

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * 
     * @param value the new description
     */
    public void setDescription(Description value) {
        this.description = value;
    }

}
