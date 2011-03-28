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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class Author.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Author")
public class Author
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The content. */
    @XmlElementRefs({
        @XmlElementRef(name = "AuthorName", type = AuthorName.class),
        @XmlElementRef(name = "Biography", type = Biography.class),
        @XmlElementRef(name = "Contact", type = Contact.class)
    })
    @XmlMixed
    protected List<Object> content;
    
    /** The affiliation ids. */
    @XmlAttribute(name = "AffiliationIDS")
    protected String affiliationIDS;
    
    /** The corresponding affiliation id. */
    @XmlAttribute(name = "CorrespondingAffiliationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String correspondingAffiliationID;

    /**
     * Gets the content.
     * 
     * @return the content
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the affiliation ids.
     * 
     * @return the affiliation ids
     */
    public String getAffiliationIDS() {
        return affiliationIDS;
    }

    /**
     * Sets the affiliation ids.
     * 
     * @param value the new affiliation ids
     */
    public void setAffiliationIDS(String value) {
        this.affiliationIDS = value;
    }

    /**
     * Gets the corresponding affiliation id.
     * 
     * @return the corresponding affiliation id
     */
    public String getCorrespondingAffiliationID() {
        return correspondingAffiliationID;
    }

    /**
     * Sets the corresponding affiliation id.
     * 
     * @param value the new corresponding affiliation id
     */
    public void setCorrespondingAffiliationID(String value) {
        this.correspondingAffiliationID = value;
    }

}
