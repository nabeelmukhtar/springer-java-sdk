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
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class Tgroup.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "colspec",
    "thead",
    "tbody"
})
@XmlRootElement(name = "tgroup")
public class Tgroup
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The colspec. */
    @XmlElement(required = true)
    protected List<Colspec> colspec;
    
    /** The thead. */
    @XmlElement(required = true)
    protected Thead thead;
    
    /** The tbody. */
    @XmlElement(required = true)
    protected Tbody tbody;
    
    /** The align. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    
    /** The cols. */
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long cols;

    /**
     * Gets the colspec.
     * 
     * @return the colspec
     */
    public List<Colspec> getColspec() {
        if (colspec == null) {
            colspec = new ArrayList<Colspec>();
        }
        return this.colspec;
    }

    /**
     * Gets the thead.
     * 
     * @return the thead
     */
    public Thead getThead() {
        return thead;
    }

    /**
     * Sets the thead.
     * 
     * @param value the new thead
     */
    public void setThead(Thead value) {
        this.thead = value;
    }

    /**
     * Gets the tbody.
     * 
     * @return the tbody
     */
    public Tbody getTbody() {
        return tbody;
    }

    /**
     * Sets the tbody.
     * 
     * @param value the new tbody
     */
    public void setTbody(Tbody value) {
        this.tbody = value;
    }

    /**
     * Gets the align.
     * 
     * @return the align
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the align.
     * 
     * @param value the new align
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the cols.
     * 
     * @return the cols
     */
    public Long getCols() {
        return cols;
    }

    /**
     * Sets the cols.
     * 
     * @param value the new cols
     */
    public void setCols(Long value) {
        this.cols = value;
    }

}
