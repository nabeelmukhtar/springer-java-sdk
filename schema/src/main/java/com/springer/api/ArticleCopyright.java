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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class ArticleCopyright.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "copyrightHolderName",
    "copyrightYear"
})
@XmlRootElement(name = "ArticleCopyright")
public class ArticleCopyright
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The copyright holder name. */
    @XmlElement(name = "CopyrightHolderName", required = true)
    protected String copyrightHolderName;
    
    /** The copyright year. */
    @XmlElement(name = "CopyrightYear", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long copyrightYear;

    /**
     * Gets the copyright holder name.
     * 
     * @return the copyright holder name
     */
    public String getCopyrightHolderName() {
        return copyrightHolderName;
    }

    /**
     * Sets the copyright holder name.
     * 
     * @param value the new copyright holder name
     */
    public void setCopyrightHolderName(String value) {
        this.copyrightHolderName = value;
    }

    /**
     * Gets the copyright year.
     * 
     * @return the copyright year
     */
    public Long getCopyrightYear() {
        return copyrightYear;
    }

    /**
     * Sets the copyright year.
     * 
     * @param value the new copyright year
     */
    public void setCopyrightYear(Long value) {
        this.copyrightYear = value;
    }

}
