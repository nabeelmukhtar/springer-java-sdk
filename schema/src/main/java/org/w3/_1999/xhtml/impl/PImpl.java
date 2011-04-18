
package org.w3._1999.xhtml.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.w3._1999.xhtml.P;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ps",
    "subs"
})
@XmlRootElement(name = "p")
public class PImpl
    implements Serializable, P
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "p", namespace = "http://www.w3.org/1999/xhtml")
    protected List<String> ps;
    @XmlElement(name = "sub", namespace = "http://www.w3.org/1999/xhtml")
    protected List<String> subs;

    public List<String> getPS() {
        if (ps == null) {
            ps = new ArrayList<String>();
        }
        return this.ps;
    }

    public List<String> getSubs() {
        if (subs == null) {
            subs = new ArrayList<String>();
        }
        return this.subs;
    }

}
