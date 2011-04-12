
package com.springer.api.xpp;

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

import com.springer.api.OrgAddress;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "street",
    "cityOrPostcode",
    "state",
    "country"
})
@XmlRootElement(name = "OrgAddress")
public class OrgAddressImpl
    implements Serializable, OrgAddress
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

}
