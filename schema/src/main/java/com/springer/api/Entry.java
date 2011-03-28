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
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class Entry.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simplePara"
})
@XmlRootElement(name = "entry")
public class Entry
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The simple para. */
    @XmlElement(name = "SimplePara")
    protected SimplePara simplePara;
    
    /** The align. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    
    /** The colname. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colname;
    
    /** The morerows. */
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long morerows;
    
    /** The nameend. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameend;
    
    /** The namest. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String namest;

    /**
     * Gets the simple para.
     * 
     * @return the simple para
     */
    public SimplePara getSimplePara() {
        return simplePara;
    }

    /**
     * Sets the simple para.
     * 
     * @param value the new simple para
     */
    public void setSimplePara(SimplePara value) {
        this.simplePara = value;
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
     * Gets the colname.
     * 
     * @return the colname
     */
    public String getColname() {
        return colname;
    }

    /**
     * Sets the colname.
     * 
     * @param value the new colname
     */
    public void setColname(String value) {
        this.colname = value;
    }

    /**
     * Gets the morerows.
     * 
     * @return the morerows
     */
    public Long getMorerows() {
        return morerows;
    }

    /**
     * Sets the morerows.
     * 
     * @param value the new morerows
     */
    public void setMorerows(Long value) {
        this.morerows = value;
    }

    /**
     * Gets the nameend.
     * 
     * @return the nameend
     */
    public String getNameend() {
        return nameend;
    }

    /**
     * Sets the nameend.
     * 
     * @param value the new nameend
     */
    public void setNameend(String value) {
        this.nameend = value;
    }

    /**
     * Gets the namest.
     * 
     * @return the namest
     */
    public String getNamest() {
        return namest;
    }

    /**
     * Sets the namest.
     * 
     * @param value the new namest
     */
    public void setNamest(String value) {
        this.namest = value;
    }

}
