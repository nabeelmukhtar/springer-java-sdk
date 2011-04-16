
package com.springer.api.schema.xpp;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.springer.api.schema.OrgAddress;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "street",
    "cityOrPostcode",
    "state",
    "country"
})
@XmlRootElement(name = "OrgAddress")
public class OrgAddressImpl
    extends BaseSchemaEntity implements OrgAddress
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElementRefs({
        @XmlElementRef(name = "City", type = JAXBElement.class),
        @XmlElementRef(name = "Postcode", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> cityOrPostcode;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Country")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String value) {
        this.street = value;
    }

    public List<JAXBElement<String>> getCityOrPostcode() {
        if (cityOrPostcode == null) {
            cityOrPostcode = new ArrayList<JAXBElement<String>>();
        }
        return this.cityOrPostcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String value) {
        this.state = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
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
