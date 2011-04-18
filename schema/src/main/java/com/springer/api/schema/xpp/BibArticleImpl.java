package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleTitle;
import com.springer.api.schema.BibArticle;
import com.springer.api.schema.BibAuthorName;
import com.springer.api.schema.Occurrence;
public class BibArticleImpl extends BaseSchemaEntity implements BibArticle {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<BibAuthorName> bibAuthorName;
    protected String year;
    protected ArticleTitleImpl articleTitle;
    protected String journalTitle;
    protected String volumeID;
    protected String issueID;
    protected String firstPage;
    protected String lastPage;
    protected List<Occurrence> occurrence;
    public List<BibAuthorName> getBibAuthorName() {
        if (bibAuthorName == null) {
            bibAuthorName = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorName;
    }
    public void setBibAuthorName(List<BibAuthorName> value) {
        this.bibAuthorName = value;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String value) {
        year = ((String) value);
    }
    public ArticleTitle getArticleTitle() {
        return articleTitle;
    }
    public void setArticleTitle(ArticleTitle value) {
        articleTitle = ((ArticleTitleImpl) value);
    }
    public String getJournalTitle() {
        return journalTitle;
    }
    public void setJournalTitle(String value) {
        journalTitle = ((String) value);
    }
    public String getVolumeID() {
        return volumeID;
    }
    public void setVolumeID(String value) {
        volumeID = ((String) value);
    }
    public String getIssueID() {
        return issueID;
    }
    public void setIssueID(String value) {
        issueID = ((String) value);
    }
    public String getFirstPage() {
        return firstPage;
    }
    public void setFirstPage(String value) {
        firstPage = ((String) value);
    }
    public String getLastPage() {
        return lastPage;
    }
    public void setLastPage(String value) {
        lastPage = ((String) value);
    }
    public List<Occurrence> getOccurrence() {
        if (occurrence == null) {
            occurrence = new ArrayList<Occurrence>();
        }
        return this.occurrence;
    }
    public void setOccurrence(List<Occurrence> value) {
        this.occurrence = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("BibAuthorName")) {
                BibAuthorNameImpl node = new BibAuthorNameImpl();
                node.init(parser);
                getBibAuthorName().add(node);
            } else if (name.equals("Year")) {
                setYear(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleTitle")) {
                ArticleTitleImpl node = new ArticleTitleImpl();
                node.init(parser);
                setArticleTitle(node);
            } else if (name.equals("JournalTitle")) {
                setJournalTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeID")) {
                setVolumeID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("IssueID")) {
                setIssueID(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("FirstPage")) {
                setFirstPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("LastPage")) {
                setLastPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Occurrence")) {
                OccurrenceImpl node = new OccurrenceImpl();
                node.init(parser);
                getOccurrence().add(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
