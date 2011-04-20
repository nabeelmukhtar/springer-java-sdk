
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.ExternalRef;
import com.springer.api.schema.RefSource;
import com.springer.api.schema.RefTarget;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refSource",
    "refTarget"
})
@XmlRootElement(name = "ExternalRef")
public class ExternalRefImpl implements Serializable, ExternalRef
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "RefSource", required = true, type = RefSourceImpl.class)
    protected RefSourceImpl refSource;
    @XmlElement(name = "RefTarget", required = true, type = RefTargetImpl.class)
    protected RefTargetImpl refTarget;

    public RefSource getRefSource() {
        return refSource;
    }

    public void setRefSource(RefSource value) {
        this.refSource = ((RefSourceImpl) value);
    }

    public RefTarget getRefTarget() {
        return refTarget;
    }

    public void setRefTarget(RefTarget value) {
        this.refTarget = ((RefTargetImpl) value);
    }

}
