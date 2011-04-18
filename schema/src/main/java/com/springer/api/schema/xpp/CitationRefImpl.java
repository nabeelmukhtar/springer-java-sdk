package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.CitationRef;
public class CitationRefImpl extends BaseSchemaEntity implements CitationRef {
    private final static long serialVersionUID = 2461660169443089969L;
    protected Long value;
    protected String citationID;
    public Long getValue() {
        return value;
    }
    public void setValue(Long value) {
        value = ((Long) value);
    }
    public String getCitationID() {
        return citationID;
    }
    public void setCitationID(String value) {
        citationID = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
        }
        setCitationID(XppUtils.getAttributeValueFromNode(parser, "CitationID"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
