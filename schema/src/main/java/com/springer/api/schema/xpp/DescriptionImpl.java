package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Description;
import com.springer.api.schema.Para;
public class DescriptionImpl extends BaseSchemaEntity implements Description {
    private final static long serialVersionUID = 2461660169443089969L;
    protected ParaImpl para;
    public Para getPara() {
        return para;
    }
    public void setPara(Para value) {
        para = ((ParaImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Para")) {
                ParaImpl node = new ParaImpl();
                node.init(parser);
                setPara(node);
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