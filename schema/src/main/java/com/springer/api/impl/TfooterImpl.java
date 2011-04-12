
package com.springer.api.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.SimplePara;
import com.springer.api.Tfooter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simplePara"
})
@XmlRootElement(name = "tfooter")
public class TfooterImpl
    implements Serializable, Tfooter
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SimplePara", required = true, type = SimpleParaImpl.class)
    protected SimpleParaImpl simplePara;

    public SimplePara getSimplePara() {
        return simplePara;
    }

    public void setSimplePara(SimplePara value) {
        this.simplePara = ((SimpleParaImpl) value);
    }

}
