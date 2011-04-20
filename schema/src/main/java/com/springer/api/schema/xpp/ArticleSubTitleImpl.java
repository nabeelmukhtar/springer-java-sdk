package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleSubTitle;
public class ArticleSubTitleImpl extends BaseSchemaEntity implements ArticleSubTitle {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String language;
    
    protected List<Object> content;
    
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
        getContent().add(XppUtils.getElementValueFromNode(parser));        
//        while (parser.nextTag() == XmlPullParser.START_TAG) {
//            String name = parser.getName();
//            LOG.warning("Found tag that we don't recognize: " + name);
//            XppUtils.skipSubTree(parser);
//        }
        
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
