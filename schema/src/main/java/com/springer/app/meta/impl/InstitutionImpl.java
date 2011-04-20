
package com.springer.app.meta.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.springer.app.meta.Institution;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orgName",
    "geoOrg",
    "country"
})
@XmlRootElement(name = "Institution")
public class InstitutionImpl
    implements Serializable, Institution
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "OrgName", required = true)
    protected String orgName;
    @XmlElement(name = "GeoOrg")
    protected String geoOrg;
    @XmlElement(name = "Country")
    protected String country;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
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

}
