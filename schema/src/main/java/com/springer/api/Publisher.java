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
import com.springer.app.meta.Info;


/**
 * The Class Publisher.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "publisherInfo",
    "journal",
    "info"
})
@XmlRootElement(name = "Publisher")
public class Publisher
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The publisher info. */
    @XmlElement(name = "PublisherInfo", required = true)
    protected PublisherInfo publisherInfo;
    
    /** The journal. */
    @XmlElement(name = "Journal", required = true)
    protected Journal journal;
    
    /** The info. */
    @XmlElement(name = "Info", namespace = "http://www.springer.com/app/meta", required = true)
    protected Info info;
    
    /** The lang. */
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    /**
     * Gets the publisher info.
     * 
     * @return the publisher info
     */
    public PublisherInfo getPublisherInfo() {
        return publisherInfo;
    }

    /**
     * Sets the publisher info.
     * 
     * @param value the new publisher info
     */
    public void setPublisherInfo(PublisherInfo value) {
        this.publisherInfo = value;
    }

    /**
     * Gets the journal.
     * 
     * @return the journal
     */
    public Journal getJournal() {
        return journal;
    }

    /**
     * Sets the journal.
     * 
     * @param value the new journal
     */
    public void setJournal(Journal value) {
        this.journal = value;
    }

    /**
     * Gets the info.
     * 
     * @return the info
     */
    public Info getInfo() {
        return info;
    }

    /**
     * Sets the info.
     * 
     * @param value the new info
     */
    public void setInfo(Info value) {
        this.info = value;
    }

    /**
     * Gets the lang.
     * 
     * @return the lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the lang.
     * 
     * @param value the new lang
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
