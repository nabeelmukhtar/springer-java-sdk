package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import com.springer.api.schema.*;
public class Section2Impl extends BaseSchemaEntity implements Section2 {
    private final static long serialVersionUID = 2461660169443089969L;
    protected HeadingImpl heading;
    protected List<Figure> figures;
    protected List<Para> paras;
    protected List<Table> tables;
    protected List<Section3> section3S;
    protected List<FormalPara> formalParas;
    protected String id;
    public Heading getHeading() {
        return heading;
    }
    public void setHeading(Heading value) {
        heading = ((HeadingImpl) value);
    }
    public List<Figure> getFigures() {
        if (figures == null) {
            figures = new ArrayList<Figure>();
        }
        return this.figures;
    }
    public void setFigures(List<Figure> value) {
        this.figures = value;
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
    public List<Table> getTables() {
        if (tables == null) {
            tables = new ArrayList<Table>();
        }
        return this.tables;
    }
    public void setTables(List<Table> value) {
        this.tables = value;
    }
    public List<Section3> getSection3s() {
        if (section3S == null) {
            section3S = new ArrayList<Section3>();
        }
        return this.section3S;
    }
    public void setSection3s(List<Section3> value) {
        this.section3S = value;
    }
    public List<FormalPara> getFormalParas() {
        if (formalParas == null) {
            formalParas = new ArrayList<FormalPara>();
        }
        return this.formalParas;
    }
    public void setFormalParas(List<FormalPara> value) {
        this.formalParas = value;
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
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Heading")) {
                HeadingImpl node = new HeadingImpl();
                node.init(parser);
                setHeading(node);
            } else if (name.equals("Figure")) {
                FigureImpl node = new FigureImpl();
                node.init(parser);
                getFigures().add(node);
            } else if (name.equals("Para")) {
                ParaImpl node = new ParaImpl();
                node.init(parser);
                getParas().add(node);
            } else if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                getTables().add(node);
            } else if (name.equals("Section3")) {
                Section3Impl node = new Section3Impl();
                node.init(parser);
                getSection3s().add(node);
            } else if (name.equals("FormalPara")) {
                FormalParaImpl node = new FormalParaImpl();
                node.init(parser);
                getFormalParas().add(node);
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
