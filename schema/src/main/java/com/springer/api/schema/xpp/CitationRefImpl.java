package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.CitationRef;
public class CitationRefImpl extends BaseSchemaEntity implements CitationRef {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String value;
    protected String citationID;
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        value = ((String) value);
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
        setCitationID(XppUtils.getAttributeValueFromNode(parser, "CitationID"));
        setValue(XppUtils.getElementValueFromNode(parser));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
