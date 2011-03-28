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
import org.w3._2001.xmlschema.Adapter1;


/**
 * The Class IssueInfo.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issueIDStart",
    "issueIDEnd",
    "issueArticleCount",
    "issueHistory",
    "issueCopyright"
})
@XmlRootElement(name = "IssueInfo")
public class IssueInfo
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The issue id start. */
    @XmlElement(name = "IssueIDStart", required = true)
    protected String issueIDStart;
    
    /** The issue id end. */
    @XmlElement(name = "IssueIDEnd", required = true)
    protected String issueIDEnd;
    
    /** The issue article count. */
    @XmlElement(name = "IssueArticleCount", required = true)
    protected String issueArticleCount;
    
    /** The issue history. */
    @XmlElement(name = "IssueHistory", required = true)
    protected IssueHistory issueHistory;
    
    /** The issue copyright. */
    @XmlElement(name = "IssueCopyright", required = true)
    protected IssueCopyright issueCopyright;
    
    /** The issue type. */
    @XmlAttribute(name = "IssueType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issueType;
    
    /** The toc levels. */
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long tocLevels;

    /**
     * Gets the issue id start.
     * 
     * @return the issue id start
     */
    public String getIssueIDStart() {
        return issueIDStart;
    }

    /**
     * Sets the issue id start.
     * 
     * @param value the new issue id start
     */
    public void setIssueIDStart(String value) {
        this.issueIDStart = value;
    }

    /**
     * Gets the issue id end.
     * 
     * @return the issue id end
     */
    public String getIssueIDEnd() {
        return issueIDEnd;
    }

    /**
     * Sets the issue id end.
     * 
     * @param value the new issue id end
     */
    public void setIssueIDEnd(String value) {
        this.issueIDEnd = value;
    }

    /**
     * Gets the issue article count.
     * 
     * @return the issue article count
     */
    public String getIssueArticleCount() {
        return issueArticleCount;
    }

    /**
     * Sets the issue article count.
     * 
     * @param value the new issue article count
     */
    public void setIssueArticleCount(String value) {
        this.issueArticleCount = value;
    }

    /**
     * Gets the issue history.
     * 
     * @return the issue history
     */
    public IssueHistory getIssueHistory() {
        return issueHistory;
    }

    /**
     * Sets the issue history.
     * 
     * @param value the new issue history
     */
    public void setIssueHistory(IssueHistory value) {
        this.issueHistory = value;
    }

    /**
     * Gets the issue copyright.
     * 
     * @return the issue copyright
     */
    public IssueCopyright getIssueCopyright() {
        return issueCopyright;
    }

    /**
     * Sets the issue copyright.
     * 
     * @param value the new issue copyright
     */
    public void setIssueCopyright(IssueCopyright value) {
        this.issueCopyright = value;
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
     * Gets the toc levels.
     * 
     * @return the toc levels
     */
    public Long getTocLevels() {
        return tocLevels;
    }

    /**
     * Sets the toc levels.
     * 
     * @param value the new toc levels
     */
    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

}
