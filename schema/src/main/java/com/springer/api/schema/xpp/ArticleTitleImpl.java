package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleTitle;
public class ArticleTitleImpl extends BaseSchemaEntity implements ArticleTitle {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String language;
    protected String value;
    
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        value = ((String) value);
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
        setValue(XppUtils.getElementValueFromNode(parser));        
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
