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


/**
 * The Class BibBook.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bibAuthorName",
    "year",
    "bookTitle",
    "numberInSeries",
    "publisherName",
    "publisherLocation",
    "occurrence"
})
@XmlRootElement(name = "BibBook")
public class BibBook
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The bib author name. */
    @XmlElement(name = "BibAuthorName", required = true)
    protected List<BibAuthorName> bibAuthorName;
    
    /** The year. */
    @XmlElement(name = "Year", required = true)
    protected String year;
    
    /** The book title. */
    @XmlElement(name = "BookTitle", required = true)
    protected String bookTitle;
    
    /** The number in series. */
    @XmlElement(name = "NumberInSeries")
    protected String numberInSeries;
    
    /** The publisher name. */
    @XmlElement(name = "PublisherName", required = true)
    protected String publisherName;
    
    /** The publisher location. */
    @XmlElement(name = "PublisherLocation", required = true)
    protected String publisherLocation;
    
    /** The occurrence. */
    @XmlElement(name = "Occurrence")
    protected Occurrence occurrence;

    /**
     * Gets the bib author name.
     * 
     * @return the bib author name
     */
    public List<BibAuthorName> getBibAuthorName() {
        if (bibAuthorName == null) {
            bibAuthorName = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorName;
    }

    /**
     * Gets the year.
     * 
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the year.
     * 
     * @param value the new year
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the book title.
     * 
     * @return the book title
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets the book title.
     * 
     * @param value the new book title
     */
    public void setBookTitle(String value) {
        this.bookTitle = value;
    }

    /**
     * Gets the number in series.
     * 
     * @return the number in series
     */
    public String getNumberInSeries() {
        return numberInSeries;
    }

    /**
     * Sets the number in series.
     * 
     * @param value the new number in series
     */
    public void setNumberInSeries(String value) {
        this.numberInSeries = value;
    }

    /**
     * Gets the publisher name.
     * 
     * @return the publisher name
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the publisher name.
     * 
     * @param value the new publisher name
     */
    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    /**
     * Gets the publisher location.
     * 
     * @return the publisher location
     */
    public String getPublisherLocation() {
        return publisherLocation;
    }

    /**
     * Sets the publisher location.
     * 
     * @param value the new publisher location
     */
    public void setPublisherLocation(String value) {
        this.publisherLocation = value;
    }

    /**
     * Gets the occurrence.
     * 
     * @return the occurrence
     */
    public Occurrence getOccurrence() {
        return occurrence;
    }

    /**
     * Sets the occurrence.
     * 
     * @param value the new occurrence
     */
    public void setOccurrence(Occurrence value) {
        this.occurrence = value;
    }

}
