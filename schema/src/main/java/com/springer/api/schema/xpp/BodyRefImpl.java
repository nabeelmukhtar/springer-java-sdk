package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.BodyRef;
public class BodyRefImpl extends BaseSchemaEntity implements BodyRef {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String fileRef;
    protected String outputMedium;
    protected String pdfType;
    protected String targetType;
    public String getFileRef() {
        return fileRef;
    }
    public void setFileRef(String value) {
        fileRef = ((String) value);
    }
    public String getOutputMedium() {
        return outputMedium;
    }
    public void setOutputMedium(String value) {
        outputMedium = ((String) value);
    }
    public String getPDFType() {
        return pdfType;
    }
    public void setPDFType(String value) {
        pdfType = ((String) value);
    }
    public String getTargetType() {
        return targetType;
    }
    public void setTargetType(String value) {
        targetType = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            LOG.warning("Found tag that we don't recognize: " + name);
            XppUtils.skipSubTree(parser);
        }
        setFileRef(XppUtils.getAttributeValueFromNode(parser, "FileRef"));
        setOutputMedium(XppUtils.getAttributeValueFromNode(parser, "OutputMedium"));
        setPDFType(XppUtils.getAttributeValueFromNode(parser, "PDFType"));
        setTargetType(XppUtils.getAttributeValueFromNode(parser, "TargetType"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
