
package com.springer.api.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.AbstractGrant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AbstractGrant")
public class AbstractGrantImpl
    implements Serializable, AbstractGrant
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlAttribute(name = "Grant", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String grant;

    public String getGrant() {
        return grant;
    }

    public void setGrant(String value) {
        this.grant = value;
    }

}
