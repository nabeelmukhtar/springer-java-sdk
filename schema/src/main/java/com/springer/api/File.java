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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class File.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "color",
    "format",
    "path",
    "type"
})
@XmlRootElement(name = "File")
public class File implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The color. */
    @XmlElement(name = "Color")
    protected Boolean color;
    
    /** The format. */
    @XmlElement(name = "Format")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String format;
    
    /** The path. */
    @XmlElement(name = "Path", required = true)
    protected List<Path> path;
    
    /** The type. */
    @XmlElement(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Checks if is color.
     * 
     * @return the boolean
     */
    public Boolean isColor() {
        return color;
    }

    /**
     * Sets the color.
     * 
     * @param value the new color
     */
    public void setColor(Boolean value) {
        this.color = value;
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
     * Gets the path.
     * 
     * @return the path
     */
    public List<Path> getPath() {
        if (path == null) {
            path = new ArrayList<Path>();
        }
        return this.path;
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
