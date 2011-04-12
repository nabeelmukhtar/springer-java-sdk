
package com.springer.api.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.ExternalRef;
import com.springer.api.RefTarget;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refSource",
    "refTarget"
})
@XmlRootElement(name = "ExternalRef")
public class ExternalRefImpl implements Serializable, ExternalRef
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "RefSource", required = true)
    protected String refSource;
    @XmlElement(name = "RefTarget", required = true, type = RefTargetImpl.class)
    protected RefTargetImpl refTarget;

    public String getRefSource() {
        return refSource;
    }

    public void setRefSource(String value) {
        this.refSource = value;
    }

    public RefTarget getRefTarget() {
        return refTarget;
    }

    public void setRefTarget(RefTarget value) {
        this.refTarget = ((RefTargetImpl) value);
    }

}
