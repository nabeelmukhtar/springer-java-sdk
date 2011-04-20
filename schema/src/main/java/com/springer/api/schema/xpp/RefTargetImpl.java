package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.RefTarget;
public class RefTargetImpl extends BaseSchemaEntity implements RefTarget {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String address;
    protected String targetType;
    public String getAddress() {
        return address;
    }
    public void setAddress(String value) {
        address = ((String) value);
    }
    public String getTargetType() {
        return targetType;
    }
    public void setTargetType(String value) {
        targetType = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setAddress(XppUtils.getAttributeValueFromNode(parser, "Address"));
        setTargetType(XppUtils.getAttributeValueFromNode(parser, "TargetType"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            LOG.warning("Found tag that we don't recognize: " + name);
            XppUtils.skipSubTree(parser);
        }
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
