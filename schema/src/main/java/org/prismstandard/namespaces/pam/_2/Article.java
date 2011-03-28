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

package org.prismstandard.namespaces.pam._2;

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
import org.prismstandard.namespaces.basic._2.Number;
import org.prismstandard.namespaces.basic._2.Volume;


/**
 * The Class Article.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identifier",
    "title",
    "creator",
    "publicationName",
    "isbn",
    "issn",
    "doi",
    "publisher",
    "publicationDate",
    "volume",
    "number",
    "startingPage",
    "url",
    "copyright"
})
@XmlRootElement(name = "article")
public class Article
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The identifier. */
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String identifier;
    
    /** The title. */
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String title;
    
    /** The creator. */
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected List<String> creator;
    
    /** The publication name. */
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    protected String publicationName;
    
    /** The isbn. */
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isbn;
    
    /** The issn. */
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issn;
    
    /** The doi. */
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    protected String doi;
    
    /** The publisher. */
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String publisher;
    
    /** The publication date. */
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String publicationDate;
    
    /** The volume. */
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/")
    protected Volume volume;
    
    /** The number. */
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/")
    protected Number number;
    
    /** The starting page. */
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String startingPage;
    
    /** The url. */
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    protected String url;
    
    /** The copyright. */
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    protected String copyright;

    /**
     * Gets the identifier.
     * 
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the identifier.
     * 
     * @param value the new identifier
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * 
     * @param value the new title
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the creator.
     * 
     * @return the creator
     */
    public List<String> getCreator() {
        if (creator == null) {
            creator = new ArrayList<String>();
        }
        return this.creator;
    }

    /**
     * Gets the publication name.
     * 
     * @return the publication name
     */
    public String getPublicationName() {
        return publicationName;
    }

    /**
     * Sets the publication name.
     * 
     * @param value the new publication name
     */
    public void setPublicationName(String value) {
        this.publicationName = value;
    }

    /**
     * Gets the isbn.
     * 
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the isbn.
     * 
     * @param value the new isbn
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Gets the issn.
     * 
     * @return the issn
     */
    public String getIssn() {
        return issn;
    }

    /**
     * Sets the issn.
     * 
     * @param value the new issn
     */
    public void setIssn(String value) {
        this.issn = value;
    }

    /**
     * Gets the doi.
     * 
     * @return the doi
     */
    public String getDoi() {
        return doi;
    }

    /**
     * Sets the doi.
     * 
     * @param value the new doi
     */
    public void setDoi(String value) {
        this.doi = value;
    }

    /**
     * Gets the publisher.
     * 
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the publisher.
     * 
     * @param value the new publisher
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the publication date.
     * 
     * @return the publication date
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the publication date.
     * 
     * @param value the new publication date
     */
    public void setPublicationDate(String value) {
        this.publicationDate = value;
    }

    /**
     * Gets the volume.
     * 
     * @return the volume
     */
    public Volume getVolume() {
        return volume;
    }

    /**
     * Sets the volume.
     * 
     * @param value the new volume
     */
    public void setVolume(Volume value) {
        this.volume = value;
    }

    /**
     * Gets the number.
     * 
     * @return the number
     */
    public Number getNumber() {
        return number;
    }

    /**
     * Sets the number.
     * 
     * @param value the new number
     */
    public void setNumber(Number value) {
        this.number = value;
    }

    /**
     * Gets the starting page.
     * 
     * @return the starting page
     */
    public String getStartingPage() {
        return startingPage;
    }

    /**
     * Sets the starting page.
     * 
     * @param value the new starting page
     */
    public void setStartingPage(String value) {
        this.startingPage = value;
    }

    /**
     * Gets the url.
     * 
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url.
     * 
     * @param value the new url
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the copyright.
     * 
     * @return the copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the copyright.
     * 
     * @param value the new copyright
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

}
