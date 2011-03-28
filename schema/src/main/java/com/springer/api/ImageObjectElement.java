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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class ImageObjectElement.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ImageObjectElement")
public class ImageObjectElement
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The color. */
    @XmlAttribute(name = "Color", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String color;
    
    /** The file ref. */
    @XmlAttribute(name = "FileRef", required = true)
    protected String fileRef;
    
    /** The format. */
    @XmlAttribute(name = "Format", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String format;
    
    /** The rendition. */
    @XmlAttribute(name = "Rendition", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rendition;
    
    /** The type. */
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Gets the color.
     * 
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color.
     * 
     * @param value the new color
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the file ref.
     * 
     * @return the file ref
     */
    public String getFileRef() {
        return fileRef;
    }

    /**
     * Sets the file ref.
     * 
     * @param value the new file ref
     */
    public void setFileRef(String value) {
        this.fileRef = value;
    }

    /**
     * Gets the format.
     * 
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the format.
     * 
     * @param value the new format
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the rendition.
     * 
     * @return the rendition
     */
    public String getRendition() {
        return rendition;
    }

    /**
     * Sets the rendition.
     * 
     * @param value the new rendition
     */
    public void setRendition(String value) {
        this.rendition = value;
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
