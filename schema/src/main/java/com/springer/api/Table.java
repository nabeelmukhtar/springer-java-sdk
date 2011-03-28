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


/**
 * The Class Table.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "table",
    "caption",
    "tgroup",
    "tfooter"
})
@XmlRootElement(name = "Table")
public class Table implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The table. */
    @XmlElement(name = "Table")
    protected Table table;
    
    /** The caption. */
    @XmlElement(name = "Caption")
    protected Caption caption;
    
    /** The tgroup. */
    protected Tgroup tgroup;
    
    /** The tfooter. */
    protected Tfooter tfooter;
    
    /** The _float. */
    @XmlAttribute(name = "Float")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String _float;
    
    /** The id. */
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the table.
     * 
     * @return the table
     */
    public Table getTable() {
        return table;
    }

    /**
     * Sets the table.
     * 
     * @param value the new table
     */
    public void setTable(Table value) {
        this.table = value;
    }

    /**
     * Gets the caption.
     * 
     * @return the caption
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the caption.
     * 
     * @param value the new caption
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }

    /**
     * Gets the tgroup.
     * 
     * @return the tgroup
     */
    public Tgroup getTgroup() {
        return tgroup;
    }

    /**
     * Sets the tgroup.
     * 
     * @param value the new tgroup
     */
    public void setTgroup(Tgroup value) {
        this.tgroup = value;
    }

    /**
     * Gets the tfooter.
     * 
     * @return the tfooter
     */
    public Tfooter getTfooter() {
        return tfooter;
    }

    /**
     * Sets the tfooter.
     * 
     * @param value the new tfooter
     */
    public void setTfooter(Tfooter value) {
        this.tfooter = value;
    }

    /**
     * Gets the float.
     * 
     * @return the float
     */
    public String getFloat() {
        return _float;
    }

    /**
     * Sets the float.
     * 
     * @param value the new float
     */
    public void setFloat(String value) {
        this._float = value;
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
