package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.AbstractGrant;
import com.springer.api.schema.BibliographyGrant;
import com.springer.api.schema.BodyHTMLGrant;
import com.springer.api.schema.BodyPDFGrant;
import com.springer.api.schema.ChapterGrants;
import com.springer.api.schema.ESMGrant;
import com.springer.api.schema.MetadataGrant;
public class ChapterGrantsImpl extends BaseSchemaEntity implements ChapterGrants {
    private final static long serialVersionUID = 2461660169443089969L;
    protected MetadataGrantImpl metadataGrant;
    protected AbstractGrantImpl abstractGrant;
    protected BodyPDFGrantImpl bodyPDFGrant;
    protected BodyHTMLGrantImpl bodyHTMLGrant;
    protected BibliographyGrantImpl bibliographyGrant;
    protected ESMGrantImpl esmGrant;
    protected String type;
    public MetadataGrant getMetadataGrant() {
        return metadataGrant;
    }
    public void setMetadataGrant(MetadataGrant value) {
        metadataGrant = ((MetadataGrantImpl) value);
    }
    public AbstractGrant getAbstractGrant() {
        return abstractGrant;
    }
    public void setAbstractGrant(AbstractGrant value) {
        abstractGrant = ((AbstractGrantImpl) value);
    }
    public BodyPDFGrant getBodyPDFGrant() {
        return bodyPDFGrant;
    }
    public void setBodyPDFGrant(BodyPDFGrant value) {
        bodyPDFGrant = ((BodyPDFGrantImpl) value);
    }
    public BodyHTMLGrant getBodyHTMLGrant() {
        return bodyHTMLGrant;
    }
    public void setBodyHTMLGrant(BodyHTMLGrant value) {
        bodyHTMLGrant = ((BodyHTMLGrantImpl) value);
    }
    public BibliographyGrant getBibliographyGrant() {
        return bibliographyGrant;
    }
    public void setBibliographyGrant(BibliographyGrant value) {
        bibliographyGrant = ((BibliographyGrantImpl) value);
    }
    public ESMGrant getESMGrant() {
        return esmGrant;
    }
    public void setESMGrant(ESMGrant value) {
        esmGrant = ((ESMGrantImpl) value);
    }
    public String getType() {
        return type;
    }
    public void setType(String value) {
        type = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("MetadataGrant")) {
                MetadataGrantImpl node = new MetadataGrantImpl();
                node.init(parser);
                setMetadataGrant(node);
            } else if (name.equals("AbstractGrant")) {
                AbstractGrantImpl node = new AbstractGrantImpl();
                node.init(parser);
                setAbstractGrant(node);
            } else if (name.equals("BodyPDFGrant")) {
                BodyPDFGrantImpl node = new BodyPDFGrantImpl();
                node.init(parser);
                setBodyPDFGrant(node);
            } else if (name.equals("BodyHTMLGrant")) {
                BodyHTMLGrantImpl node = new BodyHTMLGrantImpl();
                node.init(parser);
                setBodyHTMLGrant(node);
            } else if (name.equals("BibliographyGrant")) {
                BibliographyGrantImpl node = new BibliographyGrantImpl();
                node.init(parser);
                setBibliographyGrant(node);
            } else if (name.equals("ESMGrant")) {
                ESMGrantImpl node = new ESMGrantImpl();
                node.init(parser);
                setESMGrant(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
