package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.IssueTitle;
public class IssueTitleImpl extends BaseSchemaEntity implements IssueTitle {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String content;
    protected String language;
    public String getContent() {
        return content;
    }
    public void setContent(String value) {
        content = ((String) value);
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String value) {
        language = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setContent(XppUtils.getElementValueFromNode(parser));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
