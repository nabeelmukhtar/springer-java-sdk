package com.springer.api.schema.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.OrgAddress;
public class OrgAddressImpl extends BaseSchemaEntity implements OrgAddress {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String postbox;
    protected String street;
    protected String city;
    protected String postcode;
    protected String state;
    protected String country;
    public String getPostbox() {
        return postbox;
    }
    public void setPostbox(String value) {
        postbox = ((String) value);
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String value) {
        street = ((String) value);
    }
    public String getCity() {
        return city;
    }
    public void setCity(String value) {
        city = ((String) value);
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String value) {
        postcode = ((String) value);
    }
    public String getState() {
        return state;
    }
    public void setState(String value) {
        state = ((String) value);
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String value) {
        country = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Postbox")) {
                setPostbox(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Street")) {
                setStreet(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("City")) {
                setCity(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Postcode")) {
                setPostcode(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("State")) {
                setState(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Country")) {
                setCountry(XppUtils.getElementValueFromNode(parser));
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
