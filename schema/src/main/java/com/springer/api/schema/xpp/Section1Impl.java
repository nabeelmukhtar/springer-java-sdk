package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Heading;
import com.springer.api.schema.Para;
import com.springer.api.schema.Section1;
import com.springer.api.schema.Section2;
public class Section1Impl extends BaseSchemaEntity implements Section1 {
    private final static long serialVersionUID = 2461660169443089969L;
    protected HeadingImpl heading;
    protected List<Para> para;
    protected List<Section2> section2;
    protected String id;
    protected String type;
    public Heading getHeading() {
        return heading;
    }
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    public List<Para> getPara() {
        if (para == null) {
            para = new ArrayList<Para>();
        }
        return this.para;
    }
    public void setPara(List<Para> value) {
        this.para = value;
    }
    public List<Section2> getSection2() {
        if (section2 == null) {
            section2 = new ArrayList<Section2>();
        }
        return this.section2;
    }
    public void setSection2(List<Section2> value) {
        this.section2 = value;
    }
    public String getID() {
        return id;
    }
    public void setID(String value) {
        id = ((String) value);
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
            if (name.equals("Heading")) {
                HeadingImpl node = new HeadingImpl();
                node.init(parser);
                setHeading(node);
            } else if (name.equals("Para")) {
                ParaImpl node = new ParaImpl();
                node.init(parser);
                getPara().add(node);
            } else if (name.equals("Section2")) {
                Section2Impl node = new Section2Impl();
                node.init(parser);
                getSection2().add(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
