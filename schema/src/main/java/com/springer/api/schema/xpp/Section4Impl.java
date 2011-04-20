package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Heading;
import com.springer.api.schema.Section4;
public class Section4Impl extends BaseSchemaEntity implements Section4 {
    private final static long serialVersionUID = 2461660169443089969L;
    protected HeadingImpl heading;
    protected List<Object> figuresAndParas;
    protected String id;
    public Heading getHeading() {
        return heading;
    }
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    public List<Object> getFiguresAndParas() {
        if (figuresAndParas == null) {
            figuresAndParas = new ArrayList<Object>();
        }
        return this.figuresAndParas;
    }
    public void setFiguresAndParas(List<Object> value) {
        this.figuresAndParas = value;
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
            if (name.equals("Heading")) {
                HeadingImpl node = new HeadingImpl();
                node.init(parser);
                setHeading(node);
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
