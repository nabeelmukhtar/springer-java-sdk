
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.OrgAddress;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "street",
    "cities",
    "postcodes",
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
    protected List<String> cities;
    @XmlElement(name = "Postcode", required = true)
    protected List<String> postcodes;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Country")
    protected String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String value) {
        this.street = value;
    }

    public List<String> getCities() {
        if (cities == null) {
            cities = new ArrayList<String>();
        }
        return this.cities;
    }

    public List<String> getPostcodes() {
        if (postcodes == null) {
            postcodes = new ArrayList<String>();
        }
        return this.postcodes;
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
