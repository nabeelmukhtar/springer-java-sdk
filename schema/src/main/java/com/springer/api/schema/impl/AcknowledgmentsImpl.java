
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Acknowledgments;
import com.springer.api.schema.FormalPara;
import com.springer.api.schema.Heading;
import com.springer.api.schema.SimplePara;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "simplePara",
    "formalPara"
})
@XmlRootElement(name = "Acknowledgments")
public class AcknowledgmentsImpl
    implements Serializable, Acknowledgments
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", required = true, type = HeadingImpl.class)
    protected HeadingImpl heading;
    @XmlElement(name = "SimplePara", required = true, type = SimpleParaImpl.class)
    protected SimpleParaImpl simplePara;
    @XmlElement(name = "FormalPara", required = true, type = FormalParaImpl.class)
    protected FormalParaImpl formalPara;

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading value) {
        this.heading = ((HeadingImpl) value);
    }

    public SimplePara getSimplePara() {
        return simplePara;
    }

    public void setSimplePara(SimplePara value) {
        this.simplePara = ((SimpleParaImpl) value);
    }

    public FormalPara getFormalPara() {
        return formalPara;
    }

    public void setFormalPara(FormalPara value) {
        this.formalPara = ((FormalParaImpl) value);
    }

}
