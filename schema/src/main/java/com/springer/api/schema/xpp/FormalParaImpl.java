package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.FormalPara;
import com.springer.api.schema.Heading;
import com.springer.api.schema.Para;
public class FormalParaImpl extends BaseSchemaEntity implements FormalPara {
    private final static long serialVersionUID = 2461660169443089969L;
    protected HeadingImpl heading;
    protected ParaImpl para;
    protected String outputMedium;
    protected String renderingStyle;
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
    public String getOutputMedium() {
        return outputMedium;
    }
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    public String getRenderingStyle() {
        return renderingStyle;
    }
    public void setRenderingStyle(String value) {
        renderingStyle = ((String) value);
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
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        setRenderingStyle(XppUtils.getAttributeValueFromNode(parser, "RenderingStyle"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
