package org.prismstandard.namespaces.pam._2.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.prismstandard.namespaces.basic._2.Volume;
import org.prismstandard.namespaces.basic._2.xpp.NumberImpl;
import org.prismstandard.namespaces.basic._2.xpp.VolumeImpl;
import org.prismstandard.namespaces.pam._2.Article;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;
public class ArticleImpl extends BaseSchemaEntity implements Article {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String identifier;
    protected String title;
    protected List<String> creators;
    protected String publicationName;
    protected String isbn;
    protected String issn;
    protected String doi;
    protected String publisher;
    protected String publicationDate;
    protected VolumeImpl volume;
    protected NumberImpl number;
    protected String startingPage;
    protected String url;
    protected String copyright;
    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String value) {
        identifier = ((String) value);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String value) {
        title = ((String) value);
    }
    public List<String> getCreators() {
        if (creators == null) {
            creators = new ArrayList<String>();
        }
        return this.creators;
    }
    public void setCreators(List<String> value) {
        this.creators = value;
    }
    public String getPublicationName() {
        return publicationName;
    }
    public void setPublicationName(String value) {
        publicationName = ((String) value);
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String value) {
        isbn = ((String) value);
    }
    public String getIssn() {
        return issn;
    }
    public void setIssn(String value) {
        issn = ((String) value);
    }
    public String getDoi() {
        return doi;
    }
    public void setDoi(String value) {
        doi = ((String) value);
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String value) {
        publisher = ((String) value);
    }
    public String getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(String value) {
        publicationDate = ((String) value);
    }
    public Volume getVolume() {
        return volume;
    }
    public void setVolume(Volume value) {
        volume = ((VolumeImpl) value);
    }
    public org.prismstandard.namespaces.basic._2.Number getNumber() {
        return number;
    }
    public void setNumber(org.prismstandard.namespaces.basic._2.Number value) {
        number = ((NumberImpl) value);
    }
    public String getStartingPage() {
        return startingPage;
    }
    public void setStartingPage(String value) {
        startingPage = ((String) value);
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String value) {
        url = ((String) value);
    }
    public String getCopyright() {
        return copyright;
    }
    public void setCopyright(String value) {
        copyright = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("##default")) {
                setIdentifier(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setTitle(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("creator")) {
                getCreators().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setPublicationName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setIsbn(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setIssn(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setDoi(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setPublisher(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setPublicationDate(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setVolume(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setStartingPage(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setUrl(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("##default")) {
                setCopyright(XppUtils.getElementValueFromNode(parser));
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
