
package com.springer.api.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.Description;
import com.springer.api.Para;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "para"
})
@XmlRootElement(name = "Description")
public class DescriptionImpl
    implements Serializable, Description
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Para", required = true, type = ParaImpl.class)
    protected ParaImpl para;

    public Para getPara() {
        return para;
    }

    public void setPara(Para value) {
        this.para = ((ParaImpl) value);
    }

}
