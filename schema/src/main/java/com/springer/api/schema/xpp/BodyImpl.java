package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Body;
import com.springer.api.schema.Section1;
public class BodyImpl extends BaseSchemaEntity implements Body {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Section1> section1S;
    public List<Section1> getSection1s() {
        if (section1S == null) {
            section1S = new ArrayList<Section1>();
        }
        return this.section1S;
    }
    public void setSection1s(List<Section1> value) {
        this.section1S = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Section1")) {
                Section1Impl node = new Section1Impl();
                node.init(parser);
                getSection1s().add(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
