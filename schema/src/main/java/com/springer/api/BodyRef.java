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
 * The Class BodyRef.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BodyRef")
public class BodyRef
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The file ref. */
    @XmlAttribute(name = "FileRef", required = true)
    protected String fileRef;
    
    /** The target type. */
    @XmlAttribute(name = "TargetType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String targetType;

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
     * Gets the target type.
     * 
     * @return the target type
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * Sets the target type.
     * 
     * @param value the new target type
     */
    public void setTargetType(String value) {
        this.targetType = value;
    }

}
