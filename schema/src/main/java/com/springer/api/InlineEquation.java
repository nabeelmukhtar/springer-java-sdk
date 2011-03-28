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
 * The Class InlineEquation.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inlineMediaObject",
    "equationSource"
})
@XmlRootElement(name = "InlineEquation")
public class InlineEquation implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The inline media object. */
    @XmlElement(name = "InlineMediaObject", required = true)
    protected ImageObject inlineMediaObject;
    
    /** The equation source. */
    @XmlElement(name = "EquationSource", required = true)
    protected EquationSource equationSource;
    
    /** The id. */
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the inline media object.
     * 
     * @return the inline media object
     */
    public ImageObject getInlineMediaObject() {
        return inlineMediaObject;
    }

    /**
     * Sets the inline media object.
     * 
     * @param value the new inline media object
     */
    public void setInlineMediaObject(ImageObject value) {
        this.inlineMediaObject = value;
    }

    /**
     * Gets the equation source.
     * 
     * @return the equation source
     */
    public EquationSource getEquationSource() {
        return equationSource;
    }

    /**
     * Sets the equation source.
     * 
     * @param value the new equation source
     */
    public void setEquationSource(EquationSource value) {
        this.equationSource = value;
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
