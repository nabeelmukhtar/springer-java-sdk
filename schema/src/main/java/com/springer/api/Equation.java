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
 * The Class Equation.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "equationNumber",
    "mediaObject",
    "equationSource"
})
@XmlRootElement(name = "Equation")
public class Equation implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The equation number. */
    @XmlElement(name = "EquationNumber", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long equationNumber;
    
    /** The media object. */
    @XmlElement(name = "MediaObject", required = true)
    protected MediaObject mediaObject;
    
    /** The equation source. */
    @XmlElement(name = "EquationSource", required = true)
    protected EquationSource equationSource;
    
    /** The id. */
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the equation number.
     * 
     * @return the equation number
     */
    public Long getEquationNumber() {
        return equationNumber;
    }

    /**
     * Sets the equation number.
     * 
     * @param value the new equation number
     */
    public void setEquationNumber(Long value) {
        this.equationNumber = value;
    }

    /**
     * Gets the media object.
     * 
     * @return the media object
     */
    public MediaObject getMediaObject() {
        return mediaObject;
    }

    /**
     * Sets the media object.
     * 
     * @param value the new media object
     */
    public void setMediaObject(MediaObject value) {
        this.mediaObject = value;
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
