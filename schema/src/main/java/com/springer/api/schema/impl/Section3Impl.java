
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Figure;
import com.springer.api.schema.Heading;
import com.springer.api.schema.Para;
import com.springer.api.schema.Section3;
import com.springer.api.schema.Section4;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "para",
    "figure",
    "section4S"
})
@XmlRootElement(name = "Section3")
public class Section3Impl
    implements Serializable, Section3
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", required = true, type = HeadingImpl.class)
    protected HeadingImpl heading;
    @XmlElement(name = "Para", type = ParaImpl.class)
    protected ParaImpl para;
    @XmlElement(name = "Figure", required = true, type = FigureImpl.class)
    protected FigureImpl figure;
    @XmlElement(name = "Section4", type = Section4Impl.class)
    protected List<Section4> section4S;
    @XmlAttribute(name = "ID", required = true)
    protected String id;

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading value) {
        this.heading = ((HeadingImpl) value);
    }

    public Para getPara() {
        return para;
    }

    public void setPara(Para value) {
        this.para = ((ParaImpl) value);
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure value) {
        this.figure = ((FigureImpl) value);
    }

    public List<Section4> getSection4s() {
        if (section4S == null) {
            section4S = new ArrayList<Section4>();
        }
        return this.section4S;
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
