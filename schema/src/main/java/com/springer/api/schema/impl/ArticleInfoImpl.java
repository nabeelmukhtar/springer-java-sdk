
package com.springer.api.schema.impl;

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

import com.springer.api.schema.ArticleContext;
import com.springer.api.schema.ArticleCopyright;
import com.springer.api.schema.ArticleEditorialResponsibility;
import com.springer.api.schema.ArticleGrants;
import com.springer.api.schema.ArticleHistory;
import com.springer.api.schema.ArticleInfo;
import com.springer.api.schema.ArticleSubTitle;
import com.springer.api.schema.ArticleTitle;

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
public class ArticleInfoImpl
    implements Serializable, ArticleInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ArticleID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleID;
    @XmlElement(name = "ArticleDOI", required = true)
    protected String articleDOI;
    @XmlElement(name = "ArticleSequenceNumber", required = true)
    protected String articleSequenceNumber;
    @XmlElement(name = "ArticleTitle", required = true, type = ArticleTitleImpl.class)
    protected ArticleTitleImpl articleTitle;
    @XmlElement(name = "ArticleSubTitle", type = ArticleSubTitleImpl.class)
    protected ArticleSubTitleImpl articleSubTitle;
    @XmlElement(name = "ArticleCategory")
    protected String articleCategory;
    @XmlElement(name = "ArticleFirstPage", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleFirstPage;
    @XmlElement(name = "ArticleLastPage", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleLastPage;
    @XmlElement(name = "ArticleHistory", required = true, type = ArticleHistoryImpl.class)
    protected ArticleHistoryImpl articleHistory;
    @XmlElement(name = "ArticleEditorialResponsibility", type = ArticleEditorialResponsibilityImpl.class)
    protected ArticleEditorialResponsibilityImpl articleEditorialResponsibility;
    @XmlElement(name = "ArticleCopyright", required = true, type = ArticleCopyrightImpl.class)
    protected ArticleCopyrightImpl articleCopyright;
    @XmlElement(name = "ArticleGrants", required = true, type = ArticleGrantsImpl.class)
    protected ArticleGrantsImpl articleGrants;
    @XmlElement(name = "ArticleContext", type = ArticleContextImpl.class)
    protected ArticleContextImpl articleContext;
    @XmlAttribute(name = "ArticleCitation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleCitation;
    @XmlAttribute(name = "ArticleType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleType;
    @XmlAttribute(name = "ContainsESM", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String containsESM;
    @XmlAttribute(name = "Language", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "NumberingStyle", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberingStyle;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long tocLevels;

    public String getArticleID() {
        return articleID;
    }

    public void setArticleID(String value) {
        this.articleID = value;
    }

    public String getArticleDOI() {
        return articleDOI;
    }

    public void setArticleDOI(String value) {
        this.articleDOI = value;
    }

    public String getArticleSequenceNumber() {
        return articleSequenceNumber;
    }

    public void setArticleSequenceNumber(String value) {
        this.articleSequenceNumber = value;
    }

    public ArticleTitle getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(ArticleTitle value) {
        this.articleTitle = ((ArticleTitleImpl) value);
    }

    public ArticleSubTitle getArticleSubTitle() {
        return articleSubTitle;
    }

    public void setArticleSubTitle(ArticleSubTitle value) {
        this.articleSubTitle = ((ArticleSubTitleImpl) value);
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String value) {
        this.articleCategory = value;
    }

    public String getArticleFirstPage() {
        return articleFirstPage;
    }

    public void setArticleFirstPage(String value) {
        this.articleFirstPage = value;
    }

    public String getArticleLastPage() {
        return articleLastPage;
    }

    public void setArticleLastPage(String value) {
        this.articleLastPage = value;
    }

    public ArticleHistory getArticleHistory() {
        return articleHistory;
    }

    public void setArticleHistory(ArticleHistory value) {
        this.articleHistory = ((ArticleHistoryImpl) value);
    }

    public ArticleEditorialResponsibility getArticleEditorialResponsibility() {
        return articleEditorialResponsibility;
    }

    public void setArticleEditorialResponsibility(ArticleEditorialResponsibility value) {
        this.articleEditorialResponsibility = ((ArticleEditorialResponsibilityImpl) value);
    }

    public ArticleCopyright getArticleCopyright() {
        return articleCopyright;
    }

    public void setArticleCopyright(ArticleCopyright value) {
        this.articleCopyright = ((ArticleCopyrightImpl) value);
    }

    public ArticleGrants getArticleGrants() {
        return articleGrants;
    }

    public void setArticleGrants(ArticleGrants value) {
        this.articleGrants = ((ArticleGrantsImpl) value);
    }

    public ArticleContext getArticleContext() {
        return articleContext;
    }

    public void setArticleContext(ArticleContext value) {
        this.articleContext = ((ArticleContextImpl) value);
    }

    public String getArticleCitation() {
        return articleCitation;
    }

    public void setArticleCitation(String value) {
        this.articleCitation = value;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String value) {
        this.articleType = value;
    }

    public String getContainsESM() {
        return containsESM;
    }

    public void setContainsESM(String value) {
        this.containsESM = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getNumberingStyle() {
        return numberingStyle;
    }

    public void setNumberingStyle(String value) {
        this.numberingStyle = value;
    }

    public Long getTocLevels() {
        return tocLevels;
    }

    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

}
