
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.ArticleContext;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "journalID",
    "volumeIDStart",
    "volumeIDEnd",
    "issueIDStart",
    "issueIDEnd"
})
@XmlRootElement(name = "ArticleContext")
public class ArticleContextImpl
    implements Serializable, ArticleContext
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "JournalID", required = true)
    protected String journalID;
    @XmlElement(name = "VolumeIDStart", required = true)
    protected String volumeIDStart;
    @XmlElement(name = "VolumeIDEnd", required = true)
    protected String volumeIDEnd;
    @XmlElement(name = "IssueIDStart", required = true)
    protected String issueIDStart;
    @XmlElement(name = "IssueIDEnd", required = true)
    protected String issueIDEnd;

    public String getJournalID() {
        return journalID;
    }

    public void setJournalID(String value) {
        this.journalID = value;
    }

    public String getVolumeIDStart() {
        return volumeIDStart;
    }

    public void setVolumeIDStart(String value) {
        this.volumeIDStart = value;
    }

    public String getVolumeIDEnd() {
        return volumeIDEnd;
    }

    public void setVolumeIDEnd(String value) {
        this.volumeIDEnd = value;
    }

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

}
