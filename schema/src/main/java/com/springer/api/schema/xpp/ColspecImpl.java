package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Colspec;
public class ColspecImpl extends BaseSchemaEntity implements Colspec {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String colname;
    protected Long colnum;
    public String getColname() {
        return colname;
    }
    public void setColname(String value) {
        colname = ((String) value);
    }
    public Long getColnum() {
        return colnum;
    }
    public void setColnum(Long value) {
        colnum = ((Long) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setColname(XppUtils.getAttributeValueFromNode(parser, "##default"));
        setColnum(XppUtils.getAttributeValueAsLongFromNode(parser, "##default"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
