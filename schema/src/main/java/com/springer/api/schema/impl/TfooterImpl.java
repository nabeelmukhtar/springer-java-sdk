
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.SimplePara;
import com.springer.api.schema.Tfooter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simpleParas"
})
@XmlRootElement(name = "tfooter")
public class TfooterImpl
    implements Serializable, Tfooter
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SimplePara", required = true, type = SimpleParaImpl.class)
    protected List<SimplePara> simpleParas;

    public List<SimplePara> getSimpleParas() {
        if (simpleParas == null) {
            simpleParas = new ArrayList<SimplePara>();
        }
        return this.simpleParas;
    }

}
