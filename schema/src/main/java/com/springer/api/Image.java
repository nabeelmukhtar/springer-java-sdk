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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class Image.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caption",
    "fileOrFullTextOrLocation",
    "table",
    "articleTitleOrAuthorsOrDOI",
    "chapterId",
    "bookTitleId",
    "bookDOI",
    "isxn",
    "subjectCollection",
    "subjects",
    "copyrightHolderOrKeywordsOrOpenAccess",
    "imageType",
    "articleURI",
    "provider",
    "dateLoaded"
})
@XmlRootElement(name = "Image")
public class Image
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The caption. */
    @XmlElement(name = "Caption", required = true)
    protected Caption caption;
    
    /** The file or full text or location. */
    @XmlElements({
        @XmlElement(name = "Location", type = String.class),
        @XmlElement(name = "File", type = File.class),
        @XmlElement(name = "FullText", type = FullText.class)
    })
    protected List<Serializable> fileOrFullTextOrLocation;
    
    /** The table. */
    @XmlElement(name = "Table")
    protected Table table;
    
    /** The article title or authors or doi. */
    @XmlElementRefs({
        @XmlElementRef(name = "JournalId", type = JAXBElement.class),
        @XmlElementRef(name = "DOI", type = JAXBElement.class),
        @XmlElementRef(name = "VolumeId", type = JAXBElement.class),
        @XmlElementRef(name = "PubDate", type = JAXBElement.class),
        @XmlElementRef(name = "Authors", type = Authors.class),
        @XmlElementRef(name = "ArticleTitle", type = ArticleTitle.class),
        @XmlElementRef(name = "Institutions", type = Institutions.class),
        @XmlElementRef(name = "SourceTitle", type = JAXBElement.class),
        @XmlElementRef(name = "SourceType", type = JAXBElement.class),
        @XmlElementRef(name = "IssueId", type = JAXBElement.class)
    })
    protected List<Serializable> articleTitleOrAuthorsOrDOI;
    
    /** The chapter id. */
    @XmlElement(name = "ChapterId", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long chapterId;
    
    /** The book title id. */
    @XmlElement(name = "BookTitleId", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long bookTitleId;
    
    /** The book doi. */
    @XmlElement(name = "BookDOI")
    protected String bookDOI;
    
    /** The isxn. */
    @XmlElement(name = "ISXN", required = true)
    protected ISXN isxn;
    
    /** The subject collection. */
    @XmlElement(name = "SubjectCollection", required = true)
    protected String subjectCollection;
    
    /** The subjects. */
    @XmlElement(name = "Subjects", required = true)
    protected Subjects subjects;
    
    /** The copyright holder or keywords or open access. */
    @XmlElements({
        @XmlElement(name = "CopyrightHolder", type = String.class),
        @XmlElement(name = "Keywords", type = Keywords.class),
        @XmlElement(name = "OpenAccess", type = Boolean.class)
    })
    protected List<Serializable> copyrightHolderOrKeywordsOrOpenAccess;
    
    /** The image type. */
    @XmlElement(name = "ImageType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imageType;
    
    /** The article uri. */
    @XmlElement(name = "ArticleURI")
    protected String articleURI;
    
    /** The provider. */
    @XmlElement(name = "Provider", required = true)
    protected String provider;
    
    /** The date loaded. */
    @XmlElement(name = "DateLoaded")
    protected XMLGregorianCalendar dateLoaded;
    
    /** The id. */
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    
    /** The language. */
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    
    /** The lang. */
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    /**
     * Gets the caption.
     * 
     * @return the caption
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the caption.
     * 
     * @param value the new caption
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }

    /**
     * Gets the file or full text or location.
     * 
     * @return the file or full text or location
     */
    public List<Serializable> getFileOrFullTextOrLocation() {
        if (fileOrFullTextOrLocation == null) {
            fileOrFullTextOrLocation = new ArrayList<Serializable>();
        }
        return this.fileOrFullTextOrLocation;
    }

    /**
     * Gets the table.
     * 
     * @return the table
     */
    public Table getTable() {
        return table;
    }

    /**
     * Sets the table.
     * 
     * @param value the new table
     */
    public void setTable(Table value) {
        this.table = value;
    }

    /**
     * Gets the article title or authors or doi.
     * 
     * @return the article title or authors or doi
     */
    public List<Serializable> getArticleTitleOrAuthorsOrDOI() {
        if (articleTitleOrAuthorsOrDOI == null) {
            articleTitleOrAuthorsOrDOI = new ArrayList<Serializable>();
        }
        return this.articleTitleOrAuthorsOrDOI;
    }

    /**
     * Gets the chapter id.
     * 
     * @return the chapter id
     */
    public Long getChapterId() {
        return chapterId;
    }

    /**
     * Sets the chapter id.
     * 
     * @param value the new chapter id
     */
    public void setChapterId(Long value) {
        this.chapterId = value;
    }

    /**
     * Gets the book title id.
     * 
     * @return the book title id
     */
    public Long getBookTitleId() {
        return bookTitleId;
    }

    /**
     * Sets the book title id.
     * 
     * @param value the new book title id
     */
    public void setBookTitleId(Long value) {
        this.bookTitleId = value;
    }

    /**
     * Gets the book doi.
     * 
     * @return the book doi
     */
    public String getBookDOI() {
        return bookDOI;
    }

    /**
     * Sets the book doi.
     * 
     * @param value the new book doi
     */
    public void setBookDOI(String value) {
        this.bookDOI = value;
    }

    /**
     * Gets the iSXN.
     * 
     * @return the iSXN
     */
    public ISXN getISXN() {
        return isxn;
    }

    /**
     * Sets the iSXN.
     * 
     * @param value the new iSXN
     */
    public void setISXN(ISXN value) {
        this.isxn = value;
    }

    /**
     * Gets the subject collection.
     * 
     * @return the subject collection
     */
    public String getSubjectCollection() {
        return subjectCollection;
    }

    /**
     * Sets the subject collection.
     * 
     * @param value the new subject collection
     */
    public void setSubjectCollection(String value) {
        this.subjectCollection = value;
    }

    /**
     * Gets the subjects.
     * 
     * @return the subjects
     */
    public Subjects getSubjects() {
        return subjects;
    }

    /**
     * Sets the subjects.
     * 
     * @param value the new subjects
     */
    public void setSubjects(Subjects value) {
        this.subjects = value;
    }

    /**
     * Gets the copyright holder or keywords or open access.
     * 
     * @return the copyright holder or keywords or open access
     */
    public List<Serializable> getCopyrightHolderOrKeywordsOrOpenAccess() {
        if (copyrightHolderOrKeywordsOrOpenAccess == null) {
            copyrightHolderOrKeywordsOrOpenAccess = new ArrayList<Serializable>();
        }
        return this.copyrightHolderOrKeywordsOrOpenAccess;
    }

    /**
     * Gets the image type.
     * 
     * @return the image type
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Sets the image type.
     * 
     * @param value the new image type
     */
    public void setImageType(String value) {
        this.imageType = value;
    }

    /**
     * Gets the article uri.
     * 
     * @return the article uri
     */
    public String getArticleURI() {
        return articleURI;
    }

    /**
     * Sets the article uri.
     * 
     * @param value the new article uri
     */
    public void setArticleURI(String value) {
        this.articleURI = value;
    }

    /**
     * Gets the provider.
     * 
     * @return the provider
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the provider.
     * 
     * @param value the new provider
     */
    public void setProvider(String value) {
        this.provider = value;
    }

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
     * Gets the id.
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param value the new id
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the language.
     * 
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language.
     * 
     * @param value the new language
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the lang.
     * 
     * @return the lang
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the lang.
     * 
     * @param value the new lang
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
