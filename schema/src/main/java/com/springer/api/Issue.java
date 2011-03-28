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
 * The Class Issue.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issueInfo",
    "article"
})
@XmlRootElement(name = "Issue")
public class Issue
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The issue info. */
    @XmlElement(name = "IssueInfo", required = true)
    protected IssueInfo issueInfo;
    
    /** The article. */
    @XmlElement(name = "Article", required = true)
    protected Article article;
    
    /** The issue type. */
    @XmlAttribute(name = "IssueType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issueType;
    
    /** The output medium. */
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    /**
     * Gets the issue info.
     * 
     * @return the issue info
     */
    public IssueInfo getIssueInfo() {
        return issueInfo;
    }

    /**
     * Sets the issue info.
     * 
     * @param value the new issue info
     */
    public void setIssueInfo(IssueInfo value) {
        this.issueInfo = value;
    }

    /**
     * Gets the article.
     * 
     * @return the article
     */
    public Article getArticle() {
        return article;
    }

    /**
     * Sets the article.
     * 
     * @param value the new article
     */
    public void setArticle(Article value) {
        this.article = value;
    }

    /**
     * Gets the issue type.
     * 
     * @return the issue type
     */
    public String getIssueType() {
        return issueType;
    }

    /**
     * Sets the issue type.
     * 
     * @param value the new issue type
     */
    public void setIssueType(String value) {
        this.issueType = value;
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
