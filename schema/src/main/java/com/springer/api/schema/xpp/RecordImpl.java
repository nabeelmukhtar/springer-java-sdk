package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Image;
import com.springer.api.schema.Record;
public class RecordImpl extends BaseSchemaEntity implements Record {
    private final static long serialVersionUID = 2461660169443089969L;
    protected ImageImpl image;
    public Image getImage() {
        return image;
    }
    public void setImage(Image value) {
        image = ((ImageImpl) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Image")) {
                ImageImpl node = new ImageImpl();
                node.init(parser);
                setImage(node);
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
