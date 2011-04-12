
package com.springer.api.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.RefTarget;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RefTarget")
public class RefTargetImpl
    implements Serializable, RefTarget
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlAttribute(name = "Address", required = true)
    protected String address;
    @XmlAttribute(name = "TargetType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String targetType;

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String value) {
        this.targetType = value;
    }

}
