
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleTitle;
import com.springer.api.schema.BibArticle;
import com.springer.api.schema.BibAuthorName;
import com.springer.api.schema.Occurrence;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bibAuthorName",
    "year",
    "articleTitle",
    "journalTitle",
    "volumeID",
    "issueID",
    "firstPage",
    "lastPage",
    "occurrence"
})
@XmlRootElement(name = "BibArticle")
public class BibArticleImpl
    extends BaseSchemaEntity implements BibArticle
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BibAuthorName", type = BibAuthorNameImpl.class)
    protected List<BibAuthorName> bibAuthorName;
    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "ArticleTitle", required = true, type = ArticleTitleImpl.class)
    protected ArticleTitleImpl articleTitle;
    @XmlElement(name = "JournalTitle", required = true)
    protected String journalTitle;
    @XmlElement(name = "VolumeID", required = true)
    protected String volumeID;
    @XmlElement(name = "IssueID")
    protected String issueID;
    @XmlElement(name = "FirstPage", required = true)
    protected String firstPage;
    @XmlElement(name = "LastPage", required = true)
    protected String lastPage;
    @XmlElement(name = "Occurrence", type = OccurrenceImpl.class)
    protected List<Occurrence> occurrence;

    public List<BibAuthorName> getBibAuthorName() {
        if (bibAuthorName == null) {
            bibAuthorName = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String value) {
        this.year = value;
    }

    public ArticleTitle getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(ArticleTitle value) {
        this.articleTitle = ((ArticleTitleImpl) value);
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String value) {
        this.journalTitle = value;
    }

    public String getVolumeID() {
        return volumeID;
    }

    public void setVolumeID(String value) {
        this.volumeID = value;
    }

    public String getIssueID() {
        return issueID;
    }

    public void setIssueID(String value) {
        this.issueID = value;
    }

    public String getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(String value) {
        this.firstPage = value;
    }

    public String getLastPage() {
        return lastPage;
    }

    public void setLastPage(String value) {
        this.lastPage = value;
    }

    public List<Occurrence> getOccurrence() {
        if (occurrence == null) {
            occurrence = new ArrayList<Occurrence>();
        }
        return this.occurrence;
    }

	@Override
	public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);

        while (parser.nextTag() == XmlPullParser.START_TAG) {
        	String name = parser.getName();
        	
        	if (name.equals("code")) {
        		setCode(XppUtils.getElementValueFromNode(parser));
            } else {
                // Consume something we don't understand.
            	LOG.warning("Found tag that we don't recognize: " + name);
            	XppUtils.skipSubTree(parser);
            }
        }
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		XmlSerializer element = serializer.startTag(null, "action");
		XppUtils.setElementValueToNode(element, "code", getCode());
		element.endTag(null, "action");;
	}
}
