package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ImageObjectElement;
public class ImageObjectElementImpl extends BaseSchemaEntity implements ImageObjectElement {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String color;
    protected String fileRef;
    protected String format;
    protected String rendition;
    protected String type;
    public String getColor() {
        return color;
    }
    public void setColor(String value) {
        color = ((String) value);
    }
    public String getFileRef() {
        return fileRef;
    }
    public void setFileRef(String value) {
        fileRef = ((String) value);
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String value) {
        format = ((String) value);
    }
    public String getRendition() {
        return rendition;
    }
    public void setRendition(String value) {
        rendition = ((String) value);
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
        }
        setColor(XppUtils.getAttributeValueFromNode(parser, "Color"));
        setFileRef(XppUtils.getAttributeValueFromNode(parser, "FileRef"));
        setFormat(XppUtils.getAttributeValueFromNode(parser, "Format"));
        setRendition(XppUtils.getAttributeValueFromNode(parser, "Rendition"));
        setType(XppUtils.getAttributeValueFromNode(parser, "Type"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
