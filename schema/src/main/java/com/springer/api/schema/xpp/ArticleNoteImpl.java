package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleNote;
import com.springer.api.schema.SimplePara;
public class ArticleNoteImpl extends BaseSchemaEntity implements ArticleNote {
    private final static long serialVersionUID = 2461660169443089969L;
    protected SimpleParaImpl simplePara;
    protected String type;
    public SimplePara getSimplePara() {
        return simplePara;
    }
    public void setSimplePara(SimplePara value) {
        simplePara = ((SimpleParaImpl) value);
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
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("SimplePara")) {
                SimpleParaImpl node = new SimpleParaImpl();
                node.init(parser);
                setSimplePara(node);
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
