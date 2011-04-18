
package com.springer.api.schema.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.schema.OrgAddress;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "street",
    "city",
    "postcode",
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
    @XmlElement(name = "City", required = true)
    protected List<String> city;
    @XmlElement(name = "Postcode", required = true)
    protected List<String> postcode;
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

    public List<String> getCity() {
        if (city == null) {
            city = new ArrayList<String>();
        }
        return this.city;
    }

    public List<String> getPostcode() {
        if (postcode == null) {
            postcode = new ArrayList<String>();
        }
        return this.postcode;
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
