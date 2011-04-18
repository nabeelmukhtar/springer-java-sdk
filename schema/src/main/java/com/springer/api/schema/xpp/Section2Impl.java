
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

import com.springer.api.schema.Figure;
import com.springer.api.schema.Heading;
import com.springer.api.schema.Para;
import com.springer.api.schema.Section2;
import com.springer.api.schema.Section3;
import com.springer.api.schema.Table;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "figure",
    "para",
    "table",
    "section3"
})
@XmlRootElement(name = "Section2")
public class Section2Impl
    implements Serializable, Section2
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", required = true, type = HeadingImpl.class)
    protected HeadingImpl heading;
    @XmlElement(name = "Figure", required = true, type = FigureImpl.class)
    protected List<Figure> figure;
    @XmlElement(name = "Para", required = true, type = ParaImpl.class)
    protected List<Para> para;
    @XmlElement(name = "Table", required = true, type = TableImpl.class)
    protected List<Table> table;
    @XmlElement(name = "Section3", type = Section3Impl.class)
    protected List<Section3> section3;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading value) {
        this.heading = ((HeadingImpl) value);
    }

    public List<Figure> getFigure() {
        if (figure == null) {
            figure = new ArrayList<Figure>();
        }
        return this.figure;
    }

    public List<Para> getPara() {
        if (para == null) {
            para = new ArrayList<Para>();
        }
        return this.para;
    }

    public List<Table> getTable() {
        if (table == null) {
            table = new ArrayList<Table>();
        }
        return this.table;
    }

    public List<Section3> getSection3() {
        if (section3 == null) {
            section3 = new ArrayList<Section3>();
        }
        return this.section3;
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
