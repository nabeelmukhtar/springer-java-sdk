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
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class Citation.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "citationNumber",
    "bibArticle",
    "bibBook",
    "bibChapter",
    "bibUnstructured"
})
@XmlRootElement(name = "Citation")
public class Citation
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The citation number. */
    @XmlElement(name = "CitationNumber", required = true)
    protected BigDecimal citationNumber;
    
    /** The bib article. */
    @XmlElement(name = "BibArticle")
    protected BibArticle bibArticle;
    
    /** The bib book. */
    @XmlElement(name = "BibBook")
    protected BibBook bibBook;
    
    /** The bib chapter. */
    @XmlElement(name = "BibChapter")
    protected BibChapter bibChapter;
    
    /** The bib unstructured. */
    @XmlElement(name = "BibUnstructured")
    protected BibUnstructured bibUnstructured;
    
    /** The id. */
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the citation number.
     * 
     * @return the citation number
     */
    public BigDecimal getCitationNumber() {
        return citationNumber;
    }

    /**
     * Sets the citation number.
     * 
     * @param value the new citation number
     */
    public void setCitationNumber(BigDecimal value) {
        this.citationNumber = value;
    }

    /**
     * Gets the bib article.
     * 
     * @return the bib article
     */
    public BibArticle getBibArticle() {
        return bibArticle;
    }

    /**
     * Sets the bib article.
     * 
     * @param value the new bib article
     */
    public void setBibArticle(BibArticle value) {
        this.bibArticle = value;
    }

    /**
     * Gets the bib book.
     * 
     * @return the bib book
     */
    public BibBook getBibBook() {
        return bibBook;
    }

    /**
     * Sets the bib book.
     * 
     * @param value the new bib book
     */
    public void setBibBook(BibBook value) {
        this.bibBook = value;
    }

    /**
     * Gets the bib chapter.
     * 
     * @return the bib chapter
     */
    public BibChapter getBibChapter() {
        return bibChapter;
    }

    /**
     * Sets the bib chapter.
     * 
     * @param value the new bib chapter
     */
    public void setBibChapter(BibChapter value) {
        this.bibChapter = value;
    }

    /**
     * Gets the bib unstructured.
     * 
     * @return the bib unstructured
     */
    public BibUnstructured getBibUnstructured() {
        return bibUnstructured;
    }

    /**
     * Sets the bib unstructured.
     * 
     * @param value the new bib unstructured
     */
    public void setBibUnstructured(BibUnstructured value) {
        this.bibUnstructured = value;
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
