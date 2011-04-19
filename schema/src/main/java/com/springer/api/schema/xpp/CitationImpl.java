package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BibArticle;
import com.springer.api.schema.BibBook;
import com.springer.api.schema.BibChapter;
import com.springer.api.schema.BibUnstructured;
import com.springer.api.schema.Citation;
public class CitationImpl extends BaseSchemaEntity implements Citation {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String citationNumber;
    protected BibArticleImpl bibArticle;
    protected BibBookImpl bibBook;
    protected BibChapterImpl bibChapter;
    protected BibUnstructuredImpl bibUnstructured;
    protected String id;
    public String getCitationNumber() {
        return citationNumber;
    }
    public void setCitationNumber(String value) {
        citationNumber = ((String) value);
    }
    public BibArticle getBibArticle() {
        return bibArticle;
    }
    public void setBibArticle(BibArticle value) {
        bibArticle = ((BibArticleImpl) value);
    }
    public BibBook getBibBook() {
        return bibBook;
    }
    public void setBibBook(BibBook value) {
        bibBook = ((BibBookImpl) value);
    }
    public BibChapter getBibChapter() {
        return bibChapter;
    }
    public void setBibChapter(BibChapter value) {
        bibChapter = ((BibChapterImpl) value);
    }
    public BibUnstructured getBibUnstructured() {
        return bibUnstructured;
    }
    public void setBibUnstructured(BibUnstructured value) {
        bibUnstructured = ((BibUnstructuredImpl) value);
    }
    public String getID() {
        return id;
    }
    public void setID(String value) {
        id = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("CitationNumber")) {
                setCitationNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("BibArticle")) {
                BibArticleImpl node = new BibArticleImpl();
                node.init(parser);
                setBibArticle(node);
            } else if (name.equals("BibBook")) {
                BibBookImpl node = new BibBookImpl();
                node.init(parser);
                setBibBook(node);
            } else if (name.equals("BibChapter")) {
                BibChapterImpl node = new BibChapterImpl();
                node.init(parser);
                setBibChapter(node);
            } else if (name.equals("BibUnstructured")) {
                BibUnstructuredImpl node = new BibUnstructuredImpl();
                node.init(parser);
                setBibUnstructured(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
