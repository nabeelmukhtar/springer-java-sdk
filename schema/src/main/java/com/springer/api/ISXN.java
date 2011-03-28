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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class ISXN.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "ISXN")
public class ISXN
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The value. */
    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    
    /** The eisbn. */
    @XmlAttribute(name = "EISBN")
    protected String eisbn;
    
    /** The isbn. */
    @XmlAttribute(name = "ISBN")
    protected String isbn;
    
    /** The issn. */
    @XmlAttribute(name = "ISSN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issn;

    /**
     * Gets the value.
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     * 
     * @param value the new value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the eISBN.
     * 
     * @return the eISBN
     */
    public String getEISBN() {
        return eisbn;
    }

    /**
     * Sets the eISBN.
     * 
     * @param value the new eISBN
     */
    public void setEISBN(String value) {
        this.eisbn = value;
    }

    /**
     * Gets the iSBN.
     * 
     * @return the iSBN
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the iSBN.
     * 
     * @param value the new iSBN
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the iSSN.
     * 
     * @return the iSSN
     */
    public String getISSN() {
        return issn;
    }

    /**
     * Sets the iSSN.
     * 
     * @param value the new iSSN
     */
    public void setISSN(String value) {
        this.issn = value;
    }

}
