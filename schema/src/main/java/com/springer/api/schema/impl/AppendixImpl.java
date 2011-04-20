
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Appendix;
import com.springer.api.schema.Section1;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "section1"
})
@XmlRootElement(name = "Appendix")
public class AppendixImpl
    implements Serializable, Appendix
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Section1", required = true, type = Section1Impl.class)
    protected Section1Impl section1;
    @XmlAttribute(name = "ID", required = true)
    protected String id;

    public Section1 getSection1() {
        return section1;
    }

    public void setSection1(Section1 value) {
        this.section1 = ((Section1Impl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
