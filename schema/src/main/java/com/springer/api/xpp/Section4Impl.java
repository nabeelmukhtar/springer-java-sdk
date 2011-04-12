
package com.springer.api.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.Heading;
import com.springer.api.Section4;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "figureOrPara"
})
@XmlRootElement(name = "Section4")
public class Section4Impl
    implements Serializable, Section4
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", required = true, type = HeadingImpl.class)
    protected HeadingImpl heading;
    @XmlElements({
        @XmlElement(name = "Para", type = ParaImpl.class),
        @XmlElement(name = "Figure", type = FigureImpl.class)
    })
    protected List<Object> figureOrPara;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading value) {
        this.heading = ((HeadingImpl) value);
    }

    public List<Object> getFigureOrPara() {
        if (figureOrPara == null) {
            figureOrPara = new ArrayList<Object>();
        }
        return this.figureOrPara;
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
