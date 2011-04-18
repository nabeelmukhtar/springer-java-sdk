
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3._2001.xmlschema.Adapter1;

import com.springer.api.schema.Entry;
import com.springer.api.schema.SimplePara;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simplePara"
})
@XmlRootElement(name = "entry")
public class EntryImpl
    implements Serializable, Entry
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SimplePara", type = SimpleParaImpl.class)
    protected SimpleParaImpl simplePara;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colname;
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long morerows;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameend;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String namest;

    public SimplePara getSimplePara() {
        return simplePara;
    }

    public void setSimplePara(SimplePara value) {
        this.simplePara = ((SimpleParaImpl) value);
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String value) {
        this.align = value;
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String value) {
        this.colname = value;
    }

    public Long getMorerows() {
        return morerows;
    }

    public void setMorerows(Long value) {
        this.morerows = value;
    }

    public String getNameend() {
        return nameend;
    }

    public void setNameend(String value) {
        this.nameend = value;
    }

    public String getNamest() {
        return namest;
    }

    public void setNamest(String value) {
        this.namest = value;
    }

}
