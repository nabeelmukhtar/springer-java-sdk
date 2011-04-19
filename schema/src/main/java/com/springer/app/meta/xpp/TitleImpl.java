package com.springer.app.meta.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Emphasis;
import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.EmphasisImpl;
import com.springer.api.schema.xpp.XppUtils;
import com.springer.app.meta.Title;
public class TitleImpl extends BaseSchemaEntity implements Title {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Emphasis> emphasis;
    public List<Emphasis> getEmphasises() {
        if (emphasis == null) {
            emphasis = new ArrayList<Emphasis>();
        }
        return this.emphasis;
    }
    public void setEmphasises(List<Emphasis> value) {
        this.emphasis = value;
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Emphasis")) {
            	EmphasisImpl node = new EmphasisImpl();
                node.init(parser);
                getEmphasises().add(node);
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
