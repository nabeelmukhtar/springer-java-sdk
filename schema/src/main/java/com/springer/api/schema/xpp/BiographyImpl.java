
package com.springer.api.schema.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Biography;
import com.springer.api.schema.FormalPara;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formalPara"
})
@XmlRootElement(name = "Biography")
public class BiographyImpl implements Serializable, Biography
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "FormalPara", required = true, type = FormalParaImpl.class)
    protected FormalParaImpl formalPara;

    public FormalPara getFormalPara() {
        return formalPara;
    }

    public void setFormalPara(FormalPara value) {
        this.formalPara = ((FormalParaImpl) value);
    }

}
