package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Acknowledgments;
import com.springer.api.schema.Appendix;
import com.springer.api.schema.ArticleBackmatter;
import com.springer.api.schema.Bibliography;
public class ArticleBackmatterImpl extends BaseSchemaEntity implements ArticleBackmatter {
    private final static long serialVersionUID = 2461660169443089969L;
    protected AcknowledgmentsImpl acknowledgments;
    protected AppendixImpl appendix;
    protected BibliographyImpl bibliography;
    public Acknowledgments getAcknowledgments() {
        return acknowledgments;
    }
    public void setAcknowledgments(Acknowledgments value) {
        acknowledgments = ((AcknowledgmentsImpl) value);
    }
    public Appendix getAppendix() {
        return appendix;
    }
    public void setAppendix(Appendix value) {
        appendix = ((AppendixImpl) value);
    }
    public Bibliography getBibliography() {
        return bibliography;
    }
    public void setBibliography(Bibliography value) {
        bibliography = ((BibliographyImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Acknowledgments")) {
                AcknowledgmentsImpl node = new AcknowledgmentsImpl();
                node.init(parser);
                setAcknowledgments(node);
            } else if (name.equals("Appendix")) {
                AppendixImpl node = new AppendixImpl();
                node.init(parser);
                setAppendix(node);
            } else if (name.equals("Bibliography")) {
                BibliographyImpl node = new BibliographyImpl();
                node.init(parser);
                setBibliography(node);
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
