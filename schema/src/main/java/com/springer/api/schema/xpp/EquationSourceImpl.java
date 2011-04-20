package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.EquationSource;
public class EquationSourceImpl extends BaseSchemaEntity implements EquationSource {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String format;
    protected String content;
    public String getFormat() {
        return format;
    }
    public void setFormat(String value) {
        format = ((String) value);
    }
    public String getContent() {
        return content;
    }

    public void setContent(String value) {
        this.content = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setFormat(XppUtils.getAttributeValueFromNode(parser, "Format"));
        setContent(XppUtils.getElementValueFromNode(parser));
//        while (parser.nextTag() == XmlPullParser.START_TAG) {
//            String name = parser.getName();
//            LOG.warning("Found tag that we don't recognize: " + name);
//            XppUtils.skipSubTree(parser);
//        }
        
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
