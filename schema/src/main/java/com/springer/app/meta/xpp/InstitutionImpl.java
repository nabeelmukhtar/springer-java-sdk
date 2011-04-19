package com.springer.app.meta.xpp;
import java.io.IOException;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;
import com.springer.app.meta.Institution;
public class InstitutionImpl extends BaseSchemaEntity implements Institution {
    private final static long serialVersionUID = 2461660169443089969L;
    protected String orgName;
    protected String geoOrg;
    protected String country;
    protected String geo;
    public String getOrgName() {
        return orgName;
    }
    public void setOrgName(String value) {
        orgName = ((String) value);
    }
    public String getGeoOrg() {
        return geoOrg;
    }
    public void setGeoOrg(String value) {
        geoOrg = ((String) value);
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String value) {
        country = ((String) value);
    }
    public String getGeo() {
        return geo;
    }
    public void setGeo(String value) {
        geo = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("OrgName")) {
                setOrgName(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("GeoOrg")) {
                setGeoOrg(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Country")) {
                setCountry(XppUtils.getElementValueFromNode(parser));
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setGeo(XppUtils.getAttributeValueFromNode(parser, "geo"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
