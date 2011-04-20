package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Footnote;
import com.springer.api.schema.Para;
public class FootnoteImpl extends BaseSchemaEntity implements Footnote {
    private final static long serialVersionUID = 2461660169443089969L;
    protected ParaImpl para;
    protected String id;
    public Para getPara() {
        return para;
    }
    public void setPara(Para value) {
        para = ((ParaImpl) value);
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
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Para")) {
                ParaImpl node = new ParaImpl();
                node.init(parser);
                setPara(node);
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
