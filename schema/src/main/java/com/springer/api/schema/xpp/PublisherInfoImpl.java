package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.PublisherInfo;
public class PublisherInfoImpl extends BaseSchemaEntity implements PublisherInfo {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String publisherName;
    protected String publisherLocation;
    protected String publisherURL;
    public String getPublisherName() {
        return publisherName;
    }
    public void setPublisherName(String value) {
        publisherName = ((String) value);
    }
    public String getPublisherLocation() {
        return publisherLocation;
    }
    public void setPublisherLocation(String value) {
        publisherLocation = ((String) value);
    }
    public String getPublisherURL() {
        return publisherURL;
    }
    public void setPublisherURL(String value) {
        publisherURL = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("PublisherName")) {
                setPublisherName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PublisherLocation")) {
                setPublisherLocation(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PublisherURL")) {
                setPublisherURL(XppUtils.getElementValueFromNode(parser));
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
