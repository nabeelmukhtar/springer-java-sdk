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
    public String getEisbn() {
        return eisbn;
    }
    public void setEisbn(String value) {
        eisbn = ((String) value);
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String value) {
        isbn = ((String) value);
    }
    public String getIssn() {
        return issn;
    }
    public void setIssn(String value) {
        issn = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
        }
        setEisbn(XppUtils.getAttributeValueFromNode(parser, "EISBN"));
        setIsbn(XppUtils.getAttributeValueFromNode(parser, "ISBN"));
        setIssn(XppUtils.getAttributeValueFromNode(parser, "ISSN"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
