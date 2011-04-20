package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.SeriesID;
public class SeriesIDImpl extends BaseSchemaEntity implements SeriesID {
    private final static long serialVersionUID = 2461660169443089969L;
    protected Long seriesID;
    public Long getSeriesID() {
        return seriesID;
    }
    public void setSeriesID(Long value) {
        seriesID = ((Long) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("SeriesID")) {
                setSeriesID(XppUtils.getElementValueAsLongFromNode(parser));
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
