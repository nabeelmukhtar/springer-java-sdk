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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class AbstractSection.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "para"
})
@XmlRootElement(name = "AbstractSection")
public class AbstractSection
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The heading. */
    @XmlElement(name = "Heading", required = true)
    protected Heading heading;
    
    /** The para. */
    @XmlElement(name = "Para", required = true)
    protected Para para;

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
     * Gets the para.
     * 
     * @return the para
     */
    public Para getPara() {
        return para;
    }

    /**
     * Sets the para.
     * 
     * @param value the new para
     */
    public void setPara(Para value) {
        this.para = value;
    }

}
