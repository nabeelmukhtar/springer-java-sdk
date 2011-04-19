package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.FacetValue;
public class FacetValueImpl extends BaseSchemaEntity implements FacetValue {
    private final static long serialVersionUID = 2461660169443089969L;
    protected Long count;
    protected String value;
    public Long getCount() {
        return count;
    }
    public void setCount(Long value) {
        count = ((Long) value);
    }
    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setCount(XppUtils.getAttributeValueAsLongFromNode(parser, "count"));
        setValue(XppUtils.getElementValueFromNode(parser));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
