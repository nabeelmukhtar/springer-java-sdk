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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class ArticleGrants.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metadataGrant",
    "abstractGrant",
    "bodyPDFGrant",
    "bodyHTMLGrant",
    "bibliographyGrant",
    "esmGrant"
})
@XmlRootElement(name = "ArticleGrants")
public class ArticleGrants
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The metadata grant. */
    @XmlElement(name = "MetadataGrant", required = true)
    protected MetadataGrant metadataGrant;
    
    /** The abstract grant. */
    @XmlElement(name = "AbstractGrant", required = true)
    protected AbstractGrant abstractGrant;
    
    /** The body pdf grant. */
    @XmlElement(name = "BodyPDFGrant", required = true)
    protected BodyPDFGrant bodyPDFGrant;
    
    /** The body html grant. */
    @XmlElement(name = "BodyHTMLGrant", required = true)
    protected BodyHTMLGrant bodyHTMLGrant;
    
    /** The bibliography grant. */
    @XmlElement(name = "BibliographyGrant", required = true)
    protected BibliographyGrant bibliographyGrant;
    
    /** The esm grant. */
    @XmlElement(name = "ESMGrant", required = true)
    protected ESMGrant esmGrant;
    
    /** The type. */
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Gets the metadata grant.
     * 
     * @return the metadata grant
     */
    public MetadataGrant getMetadataGrant() {
        return metadataGrant;
    }

    /**
     * Sets the metadata grant.
     * 
     * @param value the new metadata grant
     */
    public void setMetadataGrant(MetadataGrant value) {
        this.metadataGrant = value;
    }

    /**
     * Gets the abstract grant.
     * 
     * @return the abstract grant
     */
    public AbstractGrant getAbstractGrant() {
        return abstractGrant;
    }

    /**
     * Sets the abstract grant.
     * 
     * @param value the new abstract grant
     */
    public void setAbstractGrant(AbstractGrant value) {
        this.abstractGrant = value;
    }

    /**
     * Gets the body pdf grant.
     * 
     * @return the body pdf grant
     */
    public BodyPDFGrant getBodyPDFGrant() {
        return bodyPDFGrant;
    }

    /**
     * Sets the body pdf grant.
     * 
     * @param value the new body pdf grant
     */
    public void setBodyPDFGrant(BodyPDFGrant value) {
        this.bodyPDFGrant = value;
    }

    /**
     * Gets the body html grant.
     * 
     * @return the body html grant
     */
    public BodyHTMLGrant getBodyHTMLGrant() {
        return bodyHTMLGrant;
    }

    /**
     * Sets the body html grant.
     * 
     * @param value the new body html grant
     */
    public void setBodyHTMLGrant(BodyHTMLGrant value) {
        this.bodyHTMLGrant = value;
    }

    /**
     * Gets the bibliography grant.
     * 
     * @return the bibliography grant
     */
    public BibliographyGrant getBibliographyGrant() {
        return bibliographyGrant;
    }

    /**
     * Sets the bibliography grant.
     * 
     * @param value the new bibliography grant
     */
    public void setBibliographyGrant(BibliographyGrant value) {
        this.bibliographyGrant = value;
    }

    /**
     * Gets the eSM grant.
     * 
     * @return the eSM grant
     */
    public ESMGrant getESMGrant() {
        return esmGrant;
    }

    /**
     * Sets the eSM grant.
     * 
     * @param value the new eSM grant
     */
    public void setESMGrant(ESMGrant value) {
        this.esmGrant = value;
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

}
