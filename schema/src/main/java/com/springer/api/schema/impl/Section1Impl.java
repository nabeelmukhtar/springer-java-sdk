
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
import com.springer.api.schema.FormalPara;
import com.springer.api.schema.Heading;
import com.springer.api.schema.Para;
import com.springer.api.schema.Section1;
import com.springer.api.schema.Section2;
import com.springer.api.schema.Table;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "tables",
    "figures",
    "paras",
    "formalParas",
    "section2S"
})
@XmlRootElement(name = "Section1")
public class Section1Impl
    implements Serializable, Section1
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", required = true, type = HeadingImpl.class)
    protected HeadingImpl heading;
    @XmlElement(name = "Table", type = TableImpl.class)
    protected List<Table> tables;
    @XmlElement(name = "Figure", type = FigureImpl.class)
    protected List<Figure> figures;
    @XmlElement(name = "Para", type = ParaImpl.class)
    protected List<Para> paras;
    @XmlElement(name = "FormalPara", type = FormalParaImpl.class)
    protected List<FormalPara> formalParas;
    @XmlElement(name = "Section2", type = Section2Impl.class)
    protected List<Section2> section2S;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Type")
    protected String type;

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading value) {
        this.heading = ((HeadingImpl) value);
    }

    public List<Table> getTables() {
        if (tables == null) {
            tables = new ArrayList<Table>();
        }
        return this.tables;
    }

    public List<Figure> getFigures() {
        if (figures == null) {
            figures = new ArrayList<Figure>();
        }
        return this.figures;
    }

    public List<Para> getParas() {
        if (paras == null) {
            paras = new ArrayList<Para>();
        }
        return this.paras;
    }

    public List<FormalPara> getFormalParas() {
        if (formalParas == null) {
            formalParas = new ArrayList<FormalPara>();
        }
        return this.formalParas;
    }

    public List<Section2> getSection2s() {
        if (section2S == null) {
            section2S = new ArrayList<Section2>();
        }
        return this.section2S;
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

}
