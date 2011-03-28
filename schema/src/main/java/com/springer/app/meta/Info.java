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

package com.springer.app.meta;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Class Info.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dateLoaded",
    "authors",
    "institutions",
    "date",
    "type",
    "doi",
    "title",
    "isxn",
    "journalOrPubName",
    "articleFirstPage",
    "publication",
    "publicationType",
    "subjectGroup"
})
@XmlRootElement(name = "Info")
public class Info
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The date loaded. */
    @XmlElement(name = "DateLoaded")
    protected XMLGregorianCalendar dateLoaded;
    
    /** The authors. */
    @XmlElement(name = "Authors", required = true)
    protected Authors authors;
    
    /** The institutions. */
    @XmlElement(name = "Institutions", required = true)
    protected Institutions institutions;
    
    /** The date. */
    @XmlElement(name = "Date", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String date;
    
    /** The type. */
    @XmlElement(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    
    /** The doi. */
    @XmlElement(name = "DOI", required = true)
    protected String doi;
    
    /** The title. */
    @XmlElement(name = "Title", required = true)
    protected Title title;
    
    /** The isxn. */
    @XmlElement(name = "ISXN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isxn;
    
    /** The journal or pub name. */
    @XmlElementRefs({
        @XmlElementRef(name = "PubName", namespace = "http://www.springer.com/app/meta", type = JAXBElement.class),
        @XmlElementRef(name = "Journal", namespace = "http://www.springer.com/app/meta", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> journalOrPubName;
    
    /** The article first page. */
    @XmlElement(name = "ArticleFirstPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleFirstPage;
    
    /** The publication. */
    @XmlElement(name = "Publication", required = true)
    protected String publication;
    
    /** The publication type. */
    @XmlElement(name = "PublicationType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String publicationType;
    
    /** The subject group. */
    @XmlElement(name = "SubjectGroup", required = true)
    protected SubjectGroup subjectGroup;

    /**
     * Gets the date loaded.
     * 
     * @return the date loaded
     */
    public XMLGregorianCalendar getDateLoaded() {
        return dateLoaded;
    }

    /**
     * Sets the date loaded.
     * 
     * @param value the new date loaded
     */
    public void setDateLoaded(XMLGregorianCalendar value) {
        this.dateLoaded = value;
    }

    /**
     * Gets the authors.
     * 
     * @return the authors
     */
    public Authors getAuthors() {
        return authors;
    }

    /**
     * Sets the authors.
     * 
     * @param value the new authors
     */
    public void setAuthors(Authors value) {
        this.authors = value;
    }

    /**
     * Gets the institutions.
     * 
     * @return the institutions
     */
    public Institutions getInstitutions() {
        return institutions;
    }

    /**
     * Sets the institutions.
     * 
     * @param value the new institutions
     */
    public void setInstitutions(Institutions value) {
        this.institutions = value;
    }

    /**
     * Gets the date.
     * 
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date.
     * 
     * @param value the new date
     */
    public void setDate(String value) {
        this.date = value;
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

    /**
     * Gets the dOI.
     * 
     * @return the dOI
     */
    public String getDOI() {
        return doi;
    }

    /**
     * Sets the dOI.
     * 
     * @param value the new dOI
     */
    public void setDOI(String value) {
        this.doi = value;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param value the new title
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the iSXN.
     * 
     * @return the iSXN
     */
    public String getISXN() {
        return isxn;
    }

    /**
     * Sets the iSXN.
     * 
     * @param value the new iSXN
     */
    public void setISXN(String value) {
        this.isxn = value;
    }

    /**
     * Gets the journal or pub name.
     * 
     * @return the journal or pub name
     */
    public List<JAXBElement<String>> getJournalOrPubName() {
        if (journalOrPubName == null) {
            journalOrPubName = new ArrayList<JAXBElement<String>>();
        }
        return this.journalOrPubName;
    }

    /**
     * Gets the article first page.
     * 
     * @return the article first page
     */
    public String getArticleFirstPage() {
        return articleFirstPage;
    }

    /**
     * Sets the article first page.
     * 
     * @param value the new article first page
     */
    public void setArticleFirstPage(String value) {
        this.articleFirstPage = value;
    }

    /**
     * Gets the publication.
     * 
     * @return the publication
     */
    public String getPublication() {
        return publication;
    }

    /**
     * Sets the publication.
     * 
     * @param value the new publication
     */
    public void setPublication(String value) {
        this.publication = value;
    }

    /**
     * Gets the publication type.
     * 
     * @return the publication type
     */
    public String getPublicationType() {
        return publicationType;
    }

    /**
     * Sets the publication type.
     * 
     * @param value the new publication type
     */
    public void setPublicationType(String value) {
        this.publicationType = value;
    }

    /**
     * Gets the subject group.
     * 
     * @return the subject group
     */
    public SubjectGroup getSubjectGroup() {
        return subjectGroup;
    }

    /**
     * Sets the subject group.
     * 
     * @param value the new subject group
     */
    public void setSubjectGroup(SubjectGroup value) {
        this.subjectGroup = value;
    }

}
