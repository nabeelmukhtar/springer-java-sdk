
package com.springer.api.schema.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.w3._1999.xhtml.P;
import org.w3._1999.xhtml.impl.PImpl;

import com.springer.api.schema.FullText;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "p"
})
@XmlRootElement(name = "FullText")
public class FullTextImpl extends BaseSchemaEntity implements FullText
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = PImpl.class)
    protected List<P> p;

    public List<P> getP() {
        if (p == null) {
            p = new ArrayList<P>();
        }
        return this.p;
    }

}
