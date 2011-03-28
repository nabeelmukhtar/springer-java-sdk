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
 * The Class Section3.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "para",
    "figure",
    "section4"
})
@XmlRootElement(name = "Section3")
public class Section3
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
    
    /** The figure. */
    @XmlElement(name = "Figure")
    protected Figure figure;
    
    /** The section4. */
    @XmlElement(name = "Section4")
    protected List<Section4> section4;
    
    /** The id. */
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

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
     * Gets the figure.
     * 
     * @return the figure
     */
    public Figure getFigure() {
        return figure;
    }

    /**
     * Sets the figure.
     * 
     * @param value the new figure
     */
    public void setFigure(Figure value) {
        this.figure = value;
    }

    /**
     * Gets the section4.
     * 
     * @return the section4
     */
    public List<Section4> getSection4() {
        if (section4 == null) {
            section4 = new ArrayList<Section4>();
        }
        return this.section4;
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

}
