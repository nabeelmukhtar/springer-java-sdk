
package com.springer.api.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;

import com.springer.api.Colspec;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "colspec")
public class ColspecImpl
    implements Serializable, Colspec
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colname;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long colnum;

    public String getColname() {
        return colname;
    }

    public void setColname(String value) {
        this.colname = value;
    }

    public Long getColnum() {
        return colnum;
    }

    public void setColnum(Long value) {
        this.colnum = value;
    }

}
