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
 * The Class Section1.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "para",
    "section2"
})
@XmlRootElement(name = "Section1")
public class Section1
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The heading. */
    @XmlElement(name = "Heading", required = true)
    protected Heading heading;
    
    /** The para. */
    @XmlElement(name = "Para")
    protected List<Para> para;
    
    /** The section2. */
    @XmlElement(name = "Section2")
    protected List<Section2> section2;
    
    /** The id. */
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    
    /** The type. */
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

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
    public List<Para> getPara() {
        if (para == null) {
            para = new ArrayList<Para>();
        }
        return this.para;
    }

    /**
     * Gets the section2.
     * 
     * @return the section2
     */
    public List<Section2> getSection2() {
        if (section2 == null) {
            section2 = new ArrayList<Section2>();
        }
        return this.section2;
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
     * Gets the type.
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param value the new type
     */
    public void setType(String value) {
        this.type = value;
    }

}
