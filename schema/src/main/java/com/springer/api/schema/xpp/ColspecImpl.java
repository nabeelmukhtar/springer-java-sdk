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
    protected String align;
    
    public String getAlign() {
        return align;
    }

    public void setAlign(String value) {
        this.align = value;
    }
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
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            LOG.warning("Found tag that we don't recognize: " + name);
            XppUtils.skipSubTree(parser);
        }
        setColname(XppUtils.getAttributeValueFromNode(parser, "colname"));
        setColnum(XppUtils.getAttributeValueAsLongFromNode(parser, "colnum"));
        setAlign(XppUtils.getAttributeValueFromNode(parser, "align"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
