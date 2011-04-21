
package com.springer.api.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.IssueCopyright;
import com.springer.api.schema.IssueHistory;
import com.springer.api.schema.IssueInfo;
import com.springer.api.schema.IssueTitle;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "issueIDStart",
    "issueIDEnd",
    "issueTitle",
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
    @XmlElement(name = "IssueTitle", type = IssueTitleImpl.class)
    protected IssueTitleImpl issueTitle;
    @XmlElement(name = "IssueArticleCount", required = true)
    protected String issueArticleCount;
    @XmlElement(name = "IssueHistory", required = true, type = IssueHistoryImpl.class)
    protected IssueHistoryImpl issueHistory;
    @XmlElement(name = "IssueCopyright", required = true, type = IssueCopyrightImpl.class)
    protected IssueCopyrightImpl issueCopyright;
    @XmlAttribute(name = "IssueType")
    protected String issueType;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
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

    public IssueTitle getIssueTitle() {
        return issueTitle;
    }

    public void setIssueTitle(IssueTitle value) {
        this.issueTitle = ((IssueTitleImpl) value);
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
