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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class Abstract.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "para",
    "abstractSection"
})
@XmlRootElement(name = "Abstract")
public class Abstract
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The heading. */
    @XmlElement(name = "Heading", required = true)
    protected Heading heading;
    
    /** The para. */
    @XmlElement(name = "Para")
    protected Para para;
    
    /** The abstract section. */
    @XmlElement(name = "AbstractSection")
    protected List<AbstractSection> abstractSection;
    
    /** The id. */
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    
    /** The language. */
    @XmlAttribute(name = "Language", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    
    /** The output medium. */
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    /**
     * Gets the heading.
     * 
     * @return the heading
     */
    public Heading getHeading() {
        return heading;
    }

    /**
     * Sets the heading.
     * 
     * @param value the new heading
     */
    public void setHeading(Heading value) {
        this.heading = value;
    }

    /**
     * Gets the para.
     * 
     * @return the para
     */
    public Para getPara() {
        return para;
    }

    /**
     * Sets the para.
     * 
     * @param value the new para
     */
    public void setPara(Para value) {
        this.para = value;
    }

    /**
     * Gets the abstract section.
     * 
     * @return the abstract section
     */
    public List<AbstractSection> getAbstractSection() {
        if (abstractSection == null) {
            abstractSection = new ArrayList<AbstractSection>();
        }
        return this.abstractSection;
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

    /**
     * Gets the output medium.
     * 
     * @return the output medium
     */
    public String getOutputMedium() {
        return outputMedium;
    }

    /**
     * Sets the output medium.
     * 
     * @param value the new output medium
     */
    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

}
