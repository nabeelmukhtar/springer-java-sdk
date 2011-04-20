package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.SubjectCollection;
public class SubjectCollectionImpl extends BaseSchemaEntity implements SubjectCollection {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String content;
    protected String code;
    public String getContent() {
        return content;
    }
    public void setContent(String value) {
        content = ((String) value);
    }
    public String getCode() {
        return code;
    }
    public void setCode(String value) {
        code = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setCode(XppUtils.getAttributeValueFromNode(parser, "Code"));
        setContent(XppUtils.getElementValueFromNode(parser));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
