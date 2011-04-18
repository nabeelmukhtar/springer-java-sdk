package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Caption;
import com.springer.api.schema.Figure;
import com.springer.api.schema.MediaObject;
public class FigureImpl extends BaseSchemaEntity implements Figure {
    private final static long serialVersionUID = 2461660169443089969L;
    protected CaptionImpl caption;
    protected MediaObjectImpl mediaObject;
    protected String category;
    protected String _float;
    protected String id;
    public Caption getCaption() {
        return caption;
    }
    public void setCaption(Caption value) {
        caption = ((CaptionImpl) value);
    }
    public MediaObject getMediaObject() {
        return mediaObject;
    }
    public void setMediaObject(MediaObject value) {
        mediaObject = ((MediaObjectImpl) value);
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String value) {
        category = ((String) value);
    }
    public String getFloat() {
        return _float;
    }
    public void setFloat(String value) {
        _float = ((String) value);
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
            if (name.equals("Caption")) {
                CaptionImpl node = new CaptionImpl();
                node.init(parser);
                setCaption(node);
            } else if (name.equals("MediaObject")) {
                MediaObjectImpl node = new MediaObjectImpl();
                node.init(parser);
                setMediaObject(node);
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setCategory(XppUtils.getAttributeValueFromNode(parser, "Category"));
        setFloat(XppUtils.getAttributeValueFromNode(parser, "Float"));
        setID(XppUtils.getAttributeValueFromNode(parser, "ID"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
