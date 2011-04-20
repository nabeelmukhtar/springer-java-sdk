package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Appendix;
import com.springer.api.schema.Section1;
public class AppendixImpl extends BaseSchemaEntity implements Appendix {
    private final static long serialVersionUID = 2461660169443089969L;
    protected Section1Impl section1;
    protected String id;
    public Section1 getSection1() {
        return section1;
    }
    public void setSection1(Section1 value) {
        section1 = ((Section1Impl) value);
    }
    public String getID() {
        return id;
    }
    public void setID(String value) {
        id = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Section1")) {
                Section1Impl node = new Section1Impl();
                node.init(parser);
                setSection1(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
