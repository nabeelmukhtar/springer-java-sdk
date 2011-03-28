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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class DefinitionList.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "definitionListEntry"
})
@XmlRootElement(name = "DefinitionList")
public class DefinitionList implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The definition list entry. */
    @XmlElement(name = "DefinitionListEntry", required = true)
    protected List<DefinitionListEntry> definitionListEntry;

    /**
     * Gets the definition list entry.
     * 
     * @return the definition list entry
     */
    public List<DefinitionListEntry> getDefinitionListEntry() {
        if (definitionListEntry == null) {
            definitionListEntry = new ArrayList<DefinitionListEntry>();
        }
        return this.definitionListEntry;
    }

}
