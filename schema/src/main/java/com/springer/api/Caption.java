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

import org.w3._1999.xhtml.P;


/**
 * The Class Caption.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "p",
    "captionNumber",
    "captionContent"
})
@XmlRootElement(name = "Caption")
public class Caption
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The p. */
    protected P p;
    
    /** The caption number. */
    @XmlElement(name = "CaptionNumber")
    protected String captionNumber;
    
    /** The caption content. */
    @XmlElement(name = "CaptionContent")
    protected CaptionContent captionContent;
    
    /** The language. */
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;

    /**
     * Gets the p.
     * 
     * @return the p
     */
    public P getP() {
        return p;
    }

    /**
     * Sets the p.
     * 
     * @param value the new p
     */
    public void setP(P value) {
        this.p = value;
    }

    /**
     * Gets the caption number.
     * 
     * @return the caption number
     */
    public String getCaptionNumber() {
        return captionNumber;
    }

    /**
     * Sets the caption number.
     * 
     * @param value the new caption number
     */
    public void setCaptionNumber(String value) {
        this.captionNumber = value;
    }

    /**
     * Gets the caption content.
     * 
     * @return the caption content
     */
    public CaptionContent getCaptionContent() {
        return captionContent;
    }

    /**
     * Sets the caption content.
     * 
     * @param value the new caption content
     */
    public void setCaptionContent(CaptionContent value) {
        this.captionContent = value;
    }

    /**
     * Gets the language.
     * 
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language.
     * 
     * @param value the new language
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
