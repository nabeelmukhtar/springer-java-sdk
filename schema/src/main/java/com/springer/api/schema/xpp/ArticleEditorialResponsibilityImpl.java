package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ArticleEditorialResponsibility;
public class ArticleEditorialResponsibilityImpl extends BaseSchemaEntity implements ArticleEditorialResponsibility {
    private final static long serialVersionUID = 2461660169443089969L;
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
        }
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
