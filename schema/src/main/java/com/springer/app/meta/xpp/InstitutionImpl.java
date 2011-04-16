
package com.springer.app.meta.xpp;

import java.io.IOException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.xpp.BaseSchemaEntity;
import com.springer.api.schema.xpp.XppUtils;
import com.springer.app.meta.Institution;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orgName",
    "geoOrg",
    "country"
})
@XmlRootElement(name = "Institution")
public class InstitutionImpl
    extends BaseSchemaEntity implements Institution
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "OrgName", required = true)
    protected String orgName;
    @XmlElement(name = "GeoOrg")
    protected String geoOrg;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlAttribute
    protected String geo;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String value) {
        this.orgName = value;
    }

    public String getGeoOrg() {
        return geoOrg;
    }

    public void setGeoOrg(String value) {
        this.geoOrg = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String value) {
        this.geo = value;
    }

	@Override
	public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);

        while (parser.nextTag() == XmlPullParser.START_TAG) {
        	String name = parser.getName();
        	
        	if (name.equals("code")) {
        		setCode(XppUtils.getElementValueFromNode(parser));
            } else {
                // Consume something we don't understand.
            	LOG.warning("Found tag that we don't recognize: " + name);
            	XppUtils.skipSubTree(parser);
            }
        }
	}

	@Override
	public void toXml(XmlSerializer serializer) throws IOException {
		XmlSerializer element = serializer.startTag(null, "action");
		XppUtils.setElementValueToNode(element, "code", getCode());
		element.endTag(null, "action");;
	}
}
