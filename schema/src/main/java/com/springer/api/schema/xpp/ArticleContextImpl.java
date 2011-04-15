
package com.springer.api.schema.xpp;

import java.io.IOException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

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
    extends BaseSchemaEntity implements ArticleContext
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

	@Override
	public void init(XmlPullParser parser) throws IOException,
			XmlPullParserException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
