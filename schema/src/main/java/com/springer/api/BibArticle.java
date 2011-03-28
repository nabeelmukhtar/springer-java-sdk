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
 * The Class BibArticle.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bibAuthorName",
    "year",
    "articleTitle",
    "journalTitle",
    "volumeID",
    "issueID",
    "firstPage",
    "lastPage",
    "occurrence"
})
@XmlRootElement(name = "BibArticle")
public class BibArticle
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The bib author name. */
    @XmlElement(name = "BibAuthorName")
    protected List<BibAuthorName> bibAuthorName;
    
    /** The year. */
    @XmlElement(name = "Year", required = true)
    protected String year;
    
    /** The article title. */
    @XmlElement(name = "ArticleTitle", required = true)
    protected ArticleTitle articleTitle;
    
    /** The journal title. */
    @XmlElement(name = "JournalTitle", required = true)
    protected String journalTitle;
    
    /** The volume id. */
    @XmlElement(name = "VolumeID", required = true)
    protected String volumeID;
    
    /** The issue id. */
    @XmlElement(name = "IssueID")
    protected String issueID;
    
    /** The first page. */
    @XmlElement(name = "FirstPage", required = true)
    protected String firstPage;
    
    /** The last page. */
    @XmlElement(name = "LastPage", required = true)
    protected String lastPage;
    
    /** The occurrence. */
    @XmlElement(name = "Occurrence")
    protected List<Occurrence> occurrence;

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
     * Gets the article title.
     * 
     * @return the article title
     */
    public ArticleTitle getArticleTitle() {
        return articleTitle;
    }

    /**
     * Sets the article title.
     * 
     * @param value the new article title
     */
    public void setArticleTitle(ArticleTitle value) {
        this.articleTitle = value;
    }

    /**
     * Gets the journal title.
     * 
     * @return the journal title
     */
    public String getJournalTitle() {
        return journalTitle;
    }

    /**
     * Sets the journal title.
     * 
     * @param value the new journal title
     */
    public void setJournalTitle(String value) {
        this.journalTitle = value;
    }

    /**
     * Gets the volume id.
     * 
     * @return the volume id
     */
    public String getVolumeID() {
        return volumeID;
    }

    /**
     * Sets the volume id.
     * 
     * @param value the new volume id
     */
    public void setVolumeID(String value) {
        this.volumeID = value;
    }

    /**
     * Gets the issue id.
     * 
     * @return the issue id
     */
    public String getIssueID() {
        return issueID;
    }

    /**
     * Sets the issue id.
     * 
     * @param value the new issue id
     */
    public void setIssueID(String value) {
        this.issueID = value;
    }

    /**
     * Gets the first page.
     * 
     * @return the first page
     */
    public String getFirstPage() {
        return firstPage;
    }

    /**
     * Sets the first page.
     * 
     * @param value the new first page
     */
    public void setFirstPage(String value) {
        this.firstPage = value;
    }

    /**
     * Gets the last page.
     * 
     * @return the last page
     */
    public String getLastPage() {
        return lastPage;
    }

    /**
     * Sets the last page.
     * 
     * @param value the new last page
     */
    public void setLastPage(String value) {
        this.lastPage = value;
    }

    /**
     * Gets the occurrence.
     * 
     * @return the occurrence
     */
    public List<Occurrence> getOccurrence() {
        if (occurrence == null) {
            occurrence = new ArrayList<Occurrence>();
        }
        return this.occurrence;
    }

}
