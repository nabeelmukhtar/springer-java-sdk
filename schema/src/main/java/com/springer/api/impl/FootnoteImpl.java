
package com.springer.api.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.Footnote;
import com.springer.api.Para;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "para"
})
@XmlRootElement(name = "Footnote")
public class FootnoteImpl implements Serializable, Footnote
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Para", required = true, type = ParaImpl.class)
    protected ParaImpl para;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    public Para getPara() {
        return para;
    }

    public void setPara(Para value) {
        this.para = ((ParaImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
