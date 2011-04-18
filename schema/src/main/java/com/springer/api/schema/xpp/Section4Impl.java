package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Figure;
import com.springer.api.schema.Heading;
import com.springer.api.schema.Para;
import com.springer.api.schema.Section4;
public class Section4Impl extends BaseSchemaEntity implements Section4 {
    private final static long serialVersionUID = 2461660169443089969L;
    protected HeadingImpl heading;
    protected List<Figure> figure;
    protected List<Para> para;
    protected String id;
    public Heading getHeading() {
        return heading;
    }
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    public List<Figure> getFigure() {
        if (figure == null) {
            figure = new ArrayList<Figure>();
        }
        return this.figure;
    }
    public void setFigure(List<Figure> value) {
        this.figure = value;
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
            } else if (name.equals("Figure")) {
                FigureImpl node = new FigureImpl();
                node.init(parser);
                getFigure().add(node);
            } else if (name.equals("Para")) {
                ParaImpl node = new ParaImpl();
                node.init(parser);
                getPara().add(node);
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
