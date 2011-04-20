
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.EditorName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "givenName",
    "familyName"
})
@XmlRootElement(name = "EditorName")
public class EditorNameImpl
    implements Serializable, EditorName
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "GivenName", required = true)
    protected String givenName;
    @XmlElement(name = "FamilyName", required = true)
    protected String familyName;
    @XmlAttribute(name = "DisplayOrder", required = true)
    protected String displayOrder;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String value) {
        this.givenName = value;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String value) {
        this.familyName = value;
    }

    public String getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(String value) {
        this.displayOrder = value;
    }

}
