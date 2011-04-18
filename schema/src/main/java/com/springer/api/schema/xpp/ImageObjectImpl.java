package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.ImageObject;
import com.springer.api.schema.ImageObjectElement;
public class ImageObjectImpl extends BaseSchemaEntity implements ImageObject {
    private final static long serialVersionUID = 2461660169443089969L;
    protected ImageObjectElementImpl imageObjectElement;
    public ImageObjectElement getImageObjectElement() {
        return imageObjectElement;
    }
    public void setImageObjectElement(ImageObjectElement value) {
        imageObjectElement = ((ImageObjectElementImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("ImageObjectElement")) {
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
