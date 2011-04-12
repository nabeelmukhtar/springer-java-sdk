
package com.springer.api.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.Article;
import com.springer.api.Issue;
import com.springer.api.IssueInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issueInfo",
    "article"
})
@XmlRootElement(name = "Issue")
public class IssueImpl
    implements Serializable, Issue
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "IssueInfo", required = true, type = IssueInfoImpl.class)
    protected IssueInfoImpl issueInfo;
    @XmlElement(name = "Article", required = true, type = ArticleImpl.class)
    protected ArticleImpl article;
    @XmlAttribute(name = "IssueType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issueType;
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    public IssueInfo getIssueInfo() {
        return issueInfo;
    }

    public void setIssueInfo(IssueInfo value) {
        this.issueInfo = ((IssueInfoImpl) value);
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article value) {
        this.article = ((ArticleImpl) value);
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String value) {
        this.issueType = value;
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

}
