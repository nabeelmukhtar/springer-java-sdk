
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Body;
import com.springer.api.schema.Section1;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "section1S"
})
@XmlRootElement(name = "Body")
public class BodyImpl
    implements Serializable, Body
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Section1", required = true, type = Section1Impl.class)
    protected List<Section1> section1S;

    public List<Section1> getSection1s() {
        if (section1S == null) {
            section1S = new ArrayList<Section1>();
        }
        return this.section1S;
    }

}
