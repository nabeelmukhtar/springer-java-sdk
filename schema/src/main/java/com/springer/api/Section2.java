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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class Section2.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "figureOrParaOrTable",
    "section3"
})
@XmlRootElement(name = "Section2")
public class Section2
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The heading. */
    @XmlElement(name = "Heading", required = true)
    protected Heading heading;
    
    /** The figure or para or table. */
    @XmlElements({
        @XmlElement(name = "Figure", type = Figure.class),
        @XmlElement(name = "Para", type = Para.class),
        @XmlElement(name = "Table", type = Table.class)
    })
    protected List<Object> figureOrParaOrTable;
    
    /** The section3. */
    @XmlElement(name = "Section3")
    protected List<Section3> section3;
    
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
     * Gets the figure or para or table.
     * 
     * @return the figure or para or table
     */
    public List<Object> getFigureOrParaOrTable() {
        if (figureOrParaOrTable == null) {
            figureOrParaOrTable = new ArrayList<Object>();
        }
        return this.figureOrParaOrTable;
    }

    /**
     * Gets the section3.
     * 
     * @return the section3
     */
    public List<Section3> getSection3() {
        if (section3 == null) {
            section3 = new ArrayList<Section3>();
        }
        return this.section3;
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
