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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class Article.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "articleInfo",
    "articleHeader",
    "body",
    "bodyRef",
    "articleBackmatter"
})
@XmlRootElement(name = "Article")
public class Article
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The article info. */
    @XmlElement(name = "ArticleInfo", required = true)
    protected ArticleInfo articleInfo;
    
    /** The article header. */
    @XmlElement(name = "ArticleHeader", required = true)
    protected ArticleHeader articleHeader;
    
    /** The body. */
    @XmlElement(name = "Body")
    protected Body body;
    
    /** The body ref. */
    @XmlElement(name = "BodyRef", required = true)
    protected List<BodyRef> bodyRef;
    
    /** The article backmatter. */
    @XmlElement(name = "ArticleBackmatter", required = true)
    protected ArticleBackmatter articleBackmatter;
    
    /** The id. */
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    
    /** The output medium. */
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    /**
     * Gets the article info.
     * 
     * @return the article info
     */
    public ArticleInfo getArticleInfo() {
        return articleInfo;
    }

    /**
     * Sets the article info.
     * 
     * @param value the new article info
     */
    public void setArticleInfo(ArticleInfo value) {
        this.articleInfo = value;
    }

    /**
     * Gets the article header.
     * 
     * @return the article header
     */
    public ArticleHeader getArticleHeader() {
        return articleHeader;
    }

    /**
     * Sets the article header.
     * 
     * @param value the new article header
     */
    public void setArticleHeader(ArticleHeader value) {
        this.articleHeader = value;
    }

    /**
     * Gets the body.
     * 
     * @return the body
     */
    public Body getBody() {
        return body;
    }

    /**
     * Sets the body.
     * 
     * @param value the new body
     */
    public void setBody(Body value) {
        this.body = value;
    }

    /**
     * Gets the body ref.
     * 
     * @return the body ref
     */
    public List<BodyRef> getBodyRef() {
        if (bodyRef == null) {
            bodyRef = new ArrayList<BodyRef>();
        }
        return this.bodyRef;
    }

    /**
     * Gets the article backmatter.
     * 
     * @return the article backmatter
     */
    public ArticleBackmatter getArticleBackmatter() {
        return articleBackmatter;
    }

    /**
     * Sets the article backmatter.
     * 
     * @param value the new article backmatter
     */
    public void setArticleBackmatter(ArticleBackmatter value) {
        this.articleBackmatter = value;
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

    /**
     * Gets the output medium.
     * 
     * @return the output medium
     */
    public String getOutputMedium() {
        return outputMedium;
    }

    /**
     * Sets the output medium.
     * 
     * @param value the new output medium
     */
    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

}
