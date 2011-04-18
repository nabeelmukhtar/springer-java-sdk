package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.MetadataGrant;
public class MetadataGrantImpl extends BaseSchemaEntity implements MetadataGrant {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String grant;
    public String getGrant() {
        return grant;
    }
    public void setGrant(String value) {
        grant = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
        }
        setGrant(XppUtils.getAttributeValueFromNode(parser, "Grant"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
