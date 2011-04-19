package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.Images;
import com.springer.api.schema.Publisher;
import com.springer.api.schema.Result;
public class ResultImpl extends BaseSchemaEntity implements Result {
    private final static long serialVersionUID = 2461660169443089969L;
    protected PublisherImpl publisher;
    protected ImagesImpl images;
    protected Long total;
    protected Long start;
    protected Long pageLength;
    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher value) {
        publisher = ((PublisherImpl) value);
    }
    public Images getImages() {
        return images;
    }
    public void setImages(Images value) {
        images = ((ImagesImpl) value);
    }
    public Long getTotal() {
        return total;
    }
    public void setTotal(Long value) {
        total = ((Long) value);
    }
    public Long getStart() {
        return start;
    }
    public void setStart(Long value) {
        start = ((Long) value);
    }
    public Long getPageLength() {
        return pageLength;
    }
    public void setPageLength(Long value) {
        pageLength = ((Long) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Publisher")) {
                PublisherImpl node = new PublisherImpl();
                node.init(parser);
                setPublisher(node);
            } else if (name.equals("Images")) {
                ImagesImpl node = new ImagesImpl();
                node.init(parser);
                setImages(node);
            } else if (name.equals("total")) {
                setTotal(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("start")) {
                setStart(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("pageLength")) {
                setPageLength(XppUtils.getElementValueAsLongFromNode(parser));
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
