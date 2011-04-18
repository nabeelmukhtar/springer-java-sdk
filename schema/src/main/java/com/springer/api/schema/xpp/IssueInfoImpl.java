
package com.springer.api.schema.xpp;

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

import com.springer.api.schema.IssueCopyright;
import com.springer.api.schema.IssueHistory;
import com.springer.api.schema.IssueInfo;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issueIDStart",
    "issueIDEnd",
    "issueArticleCount",
    "issueHistory",
    "issueCopyright"
})
@XmlRootElement(name = "IssueInfo")
public class IssueInfoImpl
    implements Serializable, IssueInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "IssueIDStart", required = true)
    protected String issueIDStart;
    @XmlElement(name = "IssueIDEnd", required = true)
    protected String issueIDEnd;
    @XmlElement(name = "IssueArticleCount", required = true)
    protected String issueArticleCount;
    @XmlElement(name = "IssueHistory", required = true, type = IssueHistoryImpl.class)
    protected IssueHistoryImpl issueHistory;
    @XmlElement(name = "IssueCopyright", required = true, type = IssueCopyrightImpl.class)
    protected IssueCopyrightImpl issueCopyright;
    @XmlAttribute(name = "IssueType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issueType;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long tocLevels;

    public String getIssueIDStart() {
        return issueIDStart;
    }

    public void setIssueIDStart(String value) {
        this.issueIDStart = value;
    }

    public String getIssueIDEnd() {
        return issueIDEnd;
    }

    public void setIssueIDEnd(String value) {
        this.issueIDEnd = value;
    }

    public String getIssueArticleCount() {
        return issueArticleCount;
    }

    public void setIssueArticleCount(String value) {
        this.issueArticleCount = value;
    }

    public IssueHistory getIssueHistory() {
        return issueHistory;
    }

    public void setIssueHistory(IssueHistory value) {
        this.issueHistory = ((IssueHistoryImpl) value);
    }

    public IssueCopyright getIssueCopyright() {
        return issueCopyright;
    }

    public void setIssueCopyright(IssueCopyright value) {
        this.issueCopyright = ((IssueCopyrightImpl) value);
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String value) {
        this.issueType = value;
    }

    public Long getTocLevels() {
        return tocLevels;
    }

    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

}
