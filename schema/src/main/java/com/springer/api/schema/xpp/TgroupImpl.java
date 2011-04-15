
package com.springer.api.schema.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3._2001.xmlschema.Adapter1;

import com.springer.api.schema.Colspec;
import com.springer.api.schema.Tbody;
import com.springer.api.schema.Tgroup;
import com.springer.api.schema.Thead;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "colspec",
    "thead",
    "tbody"
})
@XmlRootElement(name = "tgroup")
public class TgroupImpl
    extends BaseSchemaEntity implements Tgroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = ColspecImpl.class)
    protected List<Colspec> colspec;
    @XmlElement(required = true, type = TheadImpl.class)
    protected TheadImpl thead;
    @XmlElement(required = true, type = TbodyImpl.class)
    protected TbodyImpl tbody;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long cols;

    public List<Colspec> getColspec() {
        if (colspec == null) {
            colspec = new ArrayList<Colspec>();
        }
        return this.colspec;
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
