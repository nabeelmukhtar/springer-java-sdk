package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.InternalRef;
public class InternalRefImpl extends BaseSchemaEntity implements InternalRef {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String value;
    protected String refID;
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        value = ((String) value);
    }
    public String getRefID() {
        return refID;
    }
    public void setRefID(String value) {
        refID = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setRefID(XppUtils.getAttributeValueFromNode(parser, "RefID"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
