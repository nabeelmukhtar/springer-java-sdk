
package org.w3._1999.xhtml.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.w3._1999.xhtml.Body;
import org.w3._1999.xhtml.P;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "h1",
    "ps"
})
@XmlRootElement(name = "body")
public class BodyImpl
    implements Serializable, Body
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected String h1;
    @XmlElement(name = "p", type = PImpl.class)
    protected List<P> ps;

    public String getH1() {
        return h1;
    }

    public void setH1(String value) {
        this.h1 = value;
    }

    public List<P> getPS() {
        if (ps == null) {
            ps = new ArrayList<P>();
        }
        return this.ps;
    }

}
