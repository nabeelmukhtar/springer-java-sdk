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
import com.springer.api.schema.Table;
public class Section1Impl extends BaseSchemaEntity implements Section1 {
    private final static long serialVersionUID = 2461660169443089969L;
    protected HeadingImpl heading;
    protected TableImpl table;
    protected List<Para> paras;
    protected List<Section2> section2S;
    protected String id;
    protected String type;
    public Heading getHeading() {
        return heading;
    }
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    public Table getTable() {
        return table;
    }
    public void setTable(Table value) {
        table = ((TableImpl) value);
    }
    public List<Para> getParas() {
        if (paras == null) {
            paras = new ArrayList<Para>();
        }
        return this.paras;
    }
    public void setParas(List<Para> value) {
        this.paras = value;
    }
    public List<Section2> getSection2s() {
        if (section2S == null) {
            section2S = new ArrayList<Section2>();
        }
        return this.section2S;
    }
    public void setSection2s(List<Section2> value) {
        this.section2S = value;
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
            } else if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                setTable(node);
            } else if (name.equals("Para")) {
                ParaImpl node = new ParaImpl();
                node.init(parser);
                getParas().add(node);
            } else if (name.equals("Section2")) {
                Section2Impl node = new Section2Impl();
                node.init(parser);
                getSection2s().add(node);
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
