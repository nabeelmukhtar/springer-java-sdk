package com.springer.api.schema.xpp;
import java.io.IOException;

import org.w3._1999.xhtml.P;
import org.w3._1999.xhtml.xpp.PImpl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Caption;
import com.springer.api.schema.CaptionContent;
public class CaptionImpl extends BaseSchemaEntity implements Caption {
    private final static long serialVersionUID = 2461660169443089969L;
    protected PImpl p;
    protected String captionNumber;
    protected CaptionContentImpl captionContent;
    protected String language;
    public P getP() {
        return p;
    }
    public void setP(P value) {
        p = ((PImpl) value);
    }
    public String getCaptionNumber() {
        return captionNumber;
    }
    public void setCaptionNumber(String value) {
        captionNumber = ((String) value);
    }
    public CaptionContent getCaptionContent() {
        return captionContent;
    }
    public void setCaptionContent(CaptionContent value) {
        captionContent = ((CaptionContentImpl) value);
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String value) {
        language = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("p")) {
            	PImpl node = new PImpl();
            	node.init(parser);
                setP(node);
            } else if (name.equals("CaptionNumber")) {
                setCaptionNumber(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("CaptionContent")) {
                CaptionContentImpl node = new CaptionContentImpl();
                node.init(parser);
                setCaptionContent(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
