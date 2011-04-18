package com.springer.app.meta.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;
import com.springer.app.meta.Authors;
import com.springer.app.meta.Info;
import com.springer.app.meta.Institutions;
import com.springer.app.meta.SubjectGroup;
import com.springer.app.meta.Title;
public class InfoImpl extends BaseSchemaEntity implements Info {
    private final static long serialVersionUID = 2461660169443089969L;
    protected Date dateLoaded;
    protected AuthorsImpl authors;
    protected InstitutionsImpl institutions;
    protected String date;
    protected String type;
    protected String doi;
    protected TitleImpl title;
    protected String isxn;
    protected List<String> journals;
    protected List<String> pubNames;
    protected String articleFirstPage;
    protected String publication;
    protected String publicationType;
    protected SubjectGroupImpl subjectGroup;
    public Date getDateLoaded() {
        return dateLoaded;
    }
    public void setDateLoaded(Date value) {
        dateLoaded = ((Date) value);
    }
    public Authors getAuthors() {
        return authors;
    }
    public void setAuthors(Authors value) {
        authors = ((AuthorsImpl) value);
    }
    public Institutions getInstitutions() {
        return institutions;
    }
    public void setInstitutions(Institutions value) {
        institutions = ((InstitutionsImpl) value);
    }
    public String getDate() {
        return date;
    }
    public void setDate(String value) {
        date = ((String) value);
    }
    public String getType() {
        return type;
    }
    public void setType(String value) {
        type = ((String) value);
    }
    public String getDOI() {
        return doi;
    }
    public void setDOI(String value) {
        doi = ((String) value);
    }
    public Title getTitle() {
        return title;
    }
    public void setTitle(Title value) {
        title = ((TitleImpl) value);
    }
    public String getISXN() {
        return isxn;
    }
    public void setISXN(String value) {
        isxn = ((String) value);
    }
    public List<String> getJournals() {
        if (journals == null) {
            journals = new ArrayList<String>();
        }
        return this.journals;
    }
    public void setJournals(List<String> value) {
        this.journals = value;
    }
    public List<String> getPubNames() {
        if (pubNames == null) {
            pubNames = new ArrayList<String>();
        }
        return this.pubNames;
    }
    public void setPubNames(List<String> value) {
        this.pubNames = value;
    }
    public String getArticleFirstPage() {
        return articleFirstPage;
    }
    public void setArticleFirstPage(String value) {
        articleFirstPage = ((String) value);
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String value) {
        publication = ((String) value);
    }
    public String getPublicationType() {
        return publicationType;
    }
    public void setPublicationType(String value) {
        publicationType = ((String) value);
    }
    public SubjectGroup getSubjectGroup() {
        return subjectGroup;
    }
    public void setSubjectGroup(SubjectGroup value) {
        subjectGroup = ((SubjectGroupImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("DateLoaded")) {
                setDateLoaded(XppUtils.getElementValueAsDateFromNode(parser));
            } else if (name.equals("Authors")) {
                AuthorsImpl node = new AuthorsImpl();
                node.init(parser);
                setAuthors(node);
            } else if (name.equals("Institutions")) {
                InstitutionsImpl node = new InstitutionsImpl();
                node.init(parser);
                setInstitutions(node);
            } else if (name.equals("Date")) {
                setDate(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Type")) {
                setType(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("DOI")) {
                setDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Title")) {
                TitleImpl node = new TitleImpl();
                node.init(parser);
                setTitle(node);
            } else if (name.equals("ISXN")) {
                setISXN(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Journal")) {
                getJournals().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PubName")) {
                getPubNames().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleFirstPage")) {
                setArticleFirstPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Publication")) {
                setPublication(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PublicationType")) {
                setPublicationType(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("SubjectGroup")) {
                SubjectGroupImpl node = new SubjectGroupImpl();
                node.init(parser);
                setSubjectGroup(node);
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
