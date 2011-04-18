package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Emphasis;
import com.springer.api.schema.Superscript;
public class EmphasisImpl extends BaseSchemaEntity implements Emphasis {
    private final static long serialVersionUID = 2461660169443089969L;
    protected List<Emphasis> emphasis;
    protected List<Superscript> superscript;
    protected String type;
    public List<Emphasis> getEmphasis() {
        if (emphasis == null) {
            emphasis = new ArrayList<Emphasis>();
        }
        return this.emphasis;
    }
    public void setEmphasis(List<Emphasis> value) {
        this.emphasis = value;
    }
    public List<Superscript> getSuperscript() {
        if (superscript == null) {
            superscript = new ArrayList<Superscript>();
        }
        return this.superscript;
    }
    public void setSuperscript(List<Superscript> value) {
        this.superscript = value;
    }
    public String getType() {
        return type;
    }
    public void setType(String value) {
        type = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Emphasis")) {
                EmphasisImpl node = new EmphasisImpl();
                node.init(parser);
                getEmphasis().add(node);
            } else if (name.equals("Superscript")) {
                SuperscriptImpl node = new SuperscriptImpl();
                node.init(parser);
                getSuperscript().add(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
