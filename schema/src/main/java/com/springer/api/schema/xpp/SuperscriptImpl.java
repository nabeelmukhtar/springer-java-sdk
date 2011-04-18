package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Superscript;
public class SuperscriptImpl extends BaseSchemaEntity implements Superscript {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Object> content;
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }
    public void setContent(List<Object> value) {
        this.content = value;
    }
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
