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
import com.springer.api.schema.Section3;
import com.springer.api.schema.Section4;
public class Section3Impl extends BaseSchemaEntity implements Section3 {
    private final static long serialVersionUID = 2461660169443089969L;
    protected HeadingImpl heading;
    protected ParaImpl para;
    protected FigureImpl figure;
    protected List<Section4> section4;
    protected String id;
    public Heading getHeading() {
        return heading;
    }
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    public Para getPara() {
        return para;
    }
    public void setPara(Para value) {
        para = ((ParaImpl) value);
    }
    public Figure getFigure() {
        return figure;
    }
    public void setFigure(Figure value) {
        figure = ((FigureImpl) value);
    }
    public List<Section4> getSection4() {
        if (section4 == null) {
            section4 = new ArrayList<Section4>();
        }
        return this.section4;
    }
    public void setSection4(List<Section4> value) {
        this.section4 = value;
    }
    public String getId() {
        return id;
    }
    public void setId(String value) {
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
            } else if (name.equals("Para")) {
                ParaImpl node = new ParaImpl();
                node.init(parser);
                setPara(node);
            } else if (name.equals("Figure")) {
                FigureImpl node = new FigureImpl();
                node.init(parser);
                setFigure(node);
            } else if (name.equals("Section4")) {
                Section4Impl node = new Section4Impl();
                node.init(parser);
                getSection4().add(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setId(XppUtils.getAttributeValueFromNode(parser, "ID"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
