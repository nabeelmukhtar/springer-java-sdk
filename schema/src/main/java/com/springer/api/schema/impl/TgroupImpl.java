
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3._2001.xmlschema.Adapter2;

import com.springer.api.schema.Colspec;
import com.springer.api.schema.Tbody;
import com.springer.api.schema.Tgroup;
import com.springer.api.schema.Thead;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "colspecs",
    "thead",
    "tbody"
})
@XmlRootElement(name = "tgroup")
public class TgroupImpl
    implements Serializable, Tgroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "colspec", required = true, type = ColspecImpl.class)
    protected List<Colspec> colspecs;
    @XmlElement(required = true, type = TheadImpl.class)
    protected TheadImpl thead;
    @XmlElement(required = true, type = TbodyImpl.class)
    protected TbodyImpl tbody;
    @XmlAttribute
    protected String align;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long cols;

    public List<Colspec> getColspecs() {
        if (colspecs == null) {
            colspecs = new ArrayList<Colspec>();
        }
        return this.colspecs;
    }

    public Thead getThead() {
        return thead;
    }

    public void setThead(Thead value) {
        this.thead = ((TheadImpl) value);
    }

    public Tbody getTbody() {
        return tbody;
    }

    public void setTbody(Tbody value) {
        this.tbody = ((TbodyImpl) value);
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String value) {
        this.align = value;
    }

    public Long getCols() {
        return cols;
    }

    public void setCols(Long value) {
        this.cols = value;
    }

}
