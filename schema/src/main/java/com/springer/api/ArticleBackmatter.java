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
 * The Class ArticleBackmatter.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "acknowledgments",
    "bibliography"
})
@XmlRootElement(name = "ArticleBackmatter")
public class ArticleBackmatter
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The acknowledgments. */
    @XmlElement(name = "Acknowledgments")
    protected Acknowledgments acknowledgments;
    
    /** The bibliography. */
    @XmlElement(name = "Bibliography", required = true)
    protected Bibliography bibliography;

    /**
     * Gets the acknowledgments.
     * 
     * @return the acknowledgments
     */
    public Acknowledgments getAcknowledgments() {
        return acknowledgments;
    }

    /**
     * Sets the acknowledgments.
     * 
     * @param value the new acknowledgments
     */
    public void setAcknowledgments(Acknowledgments value) {
        this.acknowledgments = value;
    }

    /**
     * Gets the bibliography.
     * 
     * @return the bibliography
     */
    public Bibliography getBibliography() {
        return bibliography;
    }

    /**
     * Sets the bibliography.
     * 
     * @param value the new bibliography
     */
    public void setBibliography(Bibliography value) {
        this.bibliography = value;
    }

}
