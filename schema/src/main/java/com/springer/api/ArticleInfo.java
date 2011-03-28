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
 * The Class ArticleInfo.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "articleID",
    "articleDOI",
    "articleSequenceNumber",
    "articleTitle",
    "articleSubTitle",
    "articleCategory",
    "articleFirstPage",
    "articleLastPage",
    "articleHistory",
    "articleEditorialResponsibility",
    "articleCopyright",
    "articleGrants",
    "articleContext"
})
@XmlRootElement(name = "ArticleInfo")
public class ArticleInfo
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The article id. */
    @XmlElement(name = "ArticleID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleID;
    
    /** The article doi. */
    @XmlElement(name = "ArticleDOI", required = true)
    protected String articleDOI;
    
    /** The article sequence number. */
    @XmlElement(name = "ArticleSequenceNumber", required = true)
    protected String articleSequenceNumber;
    
    /** The article title. */
    @XmlElement(name = "ArticleTitle", required = true)
    protected ArticleTitle articleTitle;
    
    /** The article sub title. */
    @XmlElement(name = "ArticleSubTitle")
    protected ArticleSubTitle articleSubTitle;
    
    /** The article category. */
    @XmlElement(name = "ArticleCategory")
    protected String articleCategory;
    
    /** The article first page. */
    @XmlElement(name = "ArticleFirstPage", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleFirstPage;
    
    /** The article last page. */
    @XmlElement(name = "ArticleLastPage", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleLastPage;
    
    /** The article history. */
    @XmlElement(name = "ArticleHistory", required = true)
    protected ArticleHistory articleHistory;
    
    /** The article editorial responsibility. */
    @XmlElement(name = "ArticleEditorialResponsibility")
    protected ArticleEditorialResponsibility articleEditorialResponsibility;
    
    /** The article copyright. */
    @XmlElement(name = "ArticleCopyright", required = true)
    protected ArticleCopyright articleCopyright;
    
    /** The article grants. */
    @XmlElement(name = "ArticleGrants", required = true)
    protected ArticleGrants articleGrants;
    
    /** The article context. */
    @XmlElement(name = "ArticleContext")
    protected ArticleContext articleContext;
    
    /** The article citation. */
    @XmlAttribute(name = "ArticleCitation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleCitation;
    
    /** The article type. */
    @XmlAttribute(name = "ArticleType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleType;
    
    /** The contains esm. */
    @XmlAttribute(name = "ContainsESM", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String containsESM;
    
    /** The language. */
    @XmlAttribute(name = "Language", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    
    /** The numbering style. */
    @XmlAttribute(name = "NumberingStyle", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberingStyle;
    
    /** The toc levels. */
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long tocLevels;

    /**
     * Gets the article id.
     * 
     * @return the article id
     */
    public String getArticleID() {
        return articleID;
    }

    /**
     * Sets the article id.
     * 
     * @param value the new article id
     */
    public void setArticleID(String value) {
        this.articleID = value;
    }

    /**
     * Gets the article doi.
     * 
     * @return the article doi
     */
    public String getArticleDOI() {
        return articleDOI;
    }

    /**
     * Sets the article doi.
     * 
     * @param value the new article doi
     */
    public void setArticleDOI(String value) {
        this.articleDOI = value;
    }

    /**
     * Gets the article sequence number.
     * 
     * @return the article sequence number
     */
    public String getArticleSequenceNumber() {
        return articleSequenceNumber;
    }

    /**
     * Sets the article sequence number.
     * 
     * @param value the new article sequence number
     */
    public void setArticleSequenceNumber(String value) {
        this.articleSequenceNumber = value;
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
     * Gets the article sub title.
     * 
     * @return the article sub title
     */
    public ArticleSubTitle getArticleSubTitle() {
        return articleSubTitle;
    }

    /**
     * Sets the article sub title.
     * 
     * @param value the new article sub title
     */
    public void setArticleSubTitle(ArticleSubTitle value) {
        this.articleSubTitle = value;
    }

    /**
     * Gets the article category.
     * 
     * @return the article category
     */
    public String getArticleCategory() {
        return articleCategory;
    }

    /**
     * Sets the article category.
     * 
     * @param value the new article category
     */
    public void setArticleCategory(String value) {
        this.articleCategory = value;
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
     * Gets the article last page.
     * 
     * @return the article last page
     */
    public String getArticleLastPage() {
        return articleLastPage;
    }

    /**
     * Sets the article last page.
     * 
     * @param value the new article last page
     */
    public void setArticleLastPage(String value) {
        this.articleLastPage = value;
    }

    /**
     * Gets the article history.
     * 
     * @return the article history
     */
    public ArticleHistory getArticleHistory() {
        return articleHistory;
    }

    /**
     * Sets the article history.
     * 
     * @param value the new article history
     */
    public void setArticleHistory(ArticleHistory value) {
        this.articleHistory = value;
    }

    /**
     * Gets the article editorial responsibility.
     * 
     * @return the article editorial responsibility
     */
    public ArticleEditorialResponsibility getArticleEditorialResponsibility() {
        return articleEditorialResponsibility;
    }

    /**
     * Sets the article editorial responsibility.
     * 
     * @param value the new article editorial responsibility
     */
    public void setArticleEditorialResponsibility(ArticleEditorialResponsibility value) {
        this.articleEditorialResponsibility = value;
    }

    /**
     * Gets the article copyright.
     * 
     * @return the article copyright
     */
    public ArticleCopyright getArticleCopyright() {
        return articleCopyright;
    }

    /**
     * Sets the article copyright.
     * 
     * @param value the new article copyright
     */
    public void setArticleCopyright(ArticleCopyright value) {
        this.articleCopyright = value;
    }

    /**
     * Gets the article grants.
     * 
     * @return the article grants
     */
    public ArticleGrants getArticleGrants() {
        return articleGrants;
    }

    /**
     * Sets the article grants.
     * 
     * @param value the new article grants
     */
    public void setArticleGrants(ArticleGrants value) {
        this.articleGrants = value;
    }

    /**
     * Gets the article context.
     * 
     * @return the article context
     */
    public ArticleContext getArticleContext() {
        return articleContext;
    }

    /**
     * Sets the article context.
     * 
     * @param value the new article context
     */
    public void setArticleContext(ArticleContext value) {
        this.articleContext = value;
    }

    /**
     * Gets the article citation.
     * 
     * @return the article citation
     */
    public String getArticleCitation() {
        return articleCitation;
    }

    /**
     * Sets the article citation.
     * 
     * @param value the new article citation
     */
    public void setArticleCitation(String value) {
        this.articleCitation = value;
    }

    /**
     * Gets the article type.
     * 
     * @return the article type
     */
    public String getArticleType() {
        return articleType;
    }

    /**
     * Sets the article type.
     * 
     * @param value the new article type
     */
    public void setArticleType(String value) {
        this.articleType = value;
    }

    /**
     * Gets the contains esm.
     * 
     * @return the contains esm
     */
    public String getContainsESM() {
        return containsESM;
    }

    /**
     * Sets the contains esm.
     * 
     * @param value the new contains esm
     */
    public void setContainsESM(String value) {
        this.containsESM = value;
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
     * Gets the numbering style.
     * 
     * @return the numbering style
     */
    public String getNumberingStyle() {
        return numberingStyle;
    }

    /**
     * Sets the numbering style.
     * 
     * @param value the new numbering style
     */
    public void setNumberingStyle(String value) {
        this.numberingStyle = value;
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
