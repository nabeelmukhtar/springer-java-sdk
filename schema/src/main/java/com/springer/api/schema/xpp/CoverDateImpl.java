package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.CoverDate;
public class CoverDateImpl extends BaseSchemaEntity implements CoverDate {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String year;
    protected String month;
    public String getYear() {
        return year;
    }
    public void setYear(String value) {
        year = ((String) value);
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String value) {
        month = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Year")) {
                setYear(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Month")) {
                setMonth(XppUtils.getElementValueFromNode(parser));
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
