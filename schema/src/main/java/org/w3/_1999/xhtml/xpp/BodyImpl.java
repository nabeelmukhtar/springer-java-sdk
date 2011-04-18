package org.w3._1999.xhtml.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.w3._1999.xhtml.Body;
import org.w3._1999.xhtml.P;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;
public class BodyImpl extends BaseSchemaEntity implements Body {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String h1;
    protected List<P> ps;
    public String getH1() {
        return h1;
    }
    public void setH1(String value) {
        h1 = ((String) value);
    }
    public List<P> getPS() {
        if (ps == null) {
            ps = new ArrayList<P>();
        }
        return this.ps;
    }
    public void setPS(List<P> value) {
        this.ps = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("##default")) {
                setH1(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("p")) {
                PImpl node = new PImpl();
                node.init(parser);
                getPS().add(node);
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