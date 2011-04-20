package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.SimplePara;
import com.springer.api.schema.Tfooter;
public class TfooterImpl extends BaseSchemaEntity implements Tfooter {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<SimplePara> simpleParas;

    public List<SimplePara> getSimpleParas() {
        if (simpleParas == null) {
            simpleParas = new ArrayList<SimplePara>();
        }
        return this.simpleParas;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("SimplePara")) {
                SimpleParaImpl node = new SimpleParaImpl();
                node.init(parser);
                getSimpleParas().add(node);
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
