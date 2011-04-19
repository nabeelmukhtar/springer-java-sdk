package org.w3._1999.xhtml.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.w3._1999.xhtml.P;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
public class PImpl extends BaseSchemaEntity implements P {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<String> ps;
    protected List<String> subs;
    public List<String> getPS() {
        if (ps == null) {
            ps = new ArrayList<String>();
        }
        return this.ps;
    }
    public void setPS(List<String> value) {
        this.ps = value;
    }
    public List<String> getSubs() {
        if (subs == null) {
            subs = new ArrayList<String>();
        }
        return this.subs;
    }
    public void setSubs(List<String> value) {
        this.subs = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        int level = 1;
        while (level > 0) {
            int eventType = parser.next();
            if (eventType == XmlPullParser.END_TAG) {
                --level;
            } else if (eventType == XmlPullParser.START_TAG) {
                ++level;
            } else if (eventType == XmlPullParser.TEXT) {
            	getPS().add(parser.getText());
            }
        }
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
