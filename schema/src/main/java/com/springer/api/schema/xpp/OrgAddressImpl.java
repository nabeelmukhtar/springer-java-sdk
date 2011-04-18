package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.OrgAddress;
public class OrgAddressImpl extends BaseSchemaEntity implements OrgAddress {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String street;
    protected List<Object> cityAndPostcode;
    protected String state;
    protected String country;
    public String getStreet() {
        return street;
    }
    public void setStreet(String value) {
        street = ((String) value);
    }
    public List<Object> getCityAndPostcode() {
        if (cityAndPostcode == null) {
            cityAndPostcode = new ArrayList<Object>();
        }
        return this.cityAndPostcode;
    }
    public void setCityAndPostcode(List<Object> value) {
        this.cityAndPostcode = value;
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
            if (name.equals("Street")) {
                setStreet(XppUtils.getElementValueFromNode(parser));
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
