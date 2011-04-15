
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.schema.Affiliation;
import com.springer.api.schema.OrgAddress;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orgDivision",
    "orgName",
    "orgAddress"
})
@XmlRootElement(name = "Affiliation")
public class AffiliationImpl
    implements Serializable, Affiliation
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "OrgDivision")
    protected String orgDivision;
    @XmlElement(name = "OrgName", required = true)
    protected String orgName;
    @XmlElement(name = "OrgAddress", required = true, type = OrgAddressImpl.class)
    protected OrgAddressImpl orgAddress;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    public String getOrgDivision() {
        return orgDivision;
    }

    public void setOrgDivision(String value) {
        this.orgDivision = value;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String value) {
        this.orgName = value;
    }

    public OrgAddress getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(OrgAddress value) {
        this.orgAddress = ((OrgAddressImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
