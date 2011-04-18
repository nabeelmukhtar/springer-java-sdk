package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ISXN;
public class ISXNImpl extends BaseSchemaEntity implements ISXN {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String value;
    protected String eisbn;
    protected String isbn;
    protected String issn;
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        value = ((String) value);
    }
    public String getEISBN() {
        return eisbn;
    }
    public void setEISBN(String value) {
        eisbn = ((String) value);
    }
    public String getISBN() {
        return isbn;
    }
    public void setISBN(String value) {
        isbn = ((String) value);
    }
    public String getISSN() {
        return issn;
    }
    public void setISSN(String value) {
        issn = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setEISBN(XppUtils.getAttributeValueFromNode(parser, "EISBN"));
        setISBN(XppUtils.getAttributeValueFromNode(parser, "ISBN"));
        setISSN(XppUtils.getAttributeValueFromNode(parser, "ISSN"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
