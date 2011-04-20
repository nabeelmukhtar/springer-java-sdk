package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleTitle;
public class ArticleTitleImpl extends BaseSchemaEntity implements ArticleTitle {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String language;
    protected List<Object> content;
    protected String outputMedium;
    
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
    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "Language"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        int eventType = parser.next();
        while (eventType == XmlPullParser.START_TAG || eventType == XmlPullParser.TEXT) {
        	if (eventType == XmlPullParser.START_TAG) {
                String name = parser.getName();
                if (name.equals("Emphasis")) {
                    EmphasisImpl node = new EmphasisImpl();
                    node.init(parser);
                    getContent().add(node);
                } else if (name.equals("Superscript")) {
                    SuperscriptImpl node = new SuperscriptImpl();
                    node.init(parser);
                    getContent().add(node);
                } else if (name.equals("InlineEquation")) {
                	InlineEquationImpl node = new InlineEquationImpl();
                    node.init(parser);
                    getContent().add(node);
                } else {                // Consume something we don't understand.
                    LOG.warning("Found tag that we don't recognize: " + name);
                    XppUtils.skipSubTree(parser);
                }
        	} else {
        		getContent().add(parser.getText());
        	}
        	eventType = parser.next();
        }
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
