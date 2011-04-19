package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.MediaObject;
import com.springer.api.schema.TextObject;
public class MediaObjectImpl extends ImageObjectImpl implements MediaObject {
    private final static long serialVersionUID = 2461660169443089969L;
    protected TextObjectImpl textObject;
    public TextObject getTextObject() {
        return textObject;
    }
    public void setTextObject(TextObject value) {
        textObject = ((TextObjectImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("TextObject")) {
                TextObjectImpl node = new TextObjectImpl();
                node.init(parser);
                setTextObject(node);
            } else if (name.equals("ImageObject")) {
                ImageObjectElementImpl node = new ImageObjectElementImpl();
                node.init(parser);
                setImageObjectElement(node);
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
