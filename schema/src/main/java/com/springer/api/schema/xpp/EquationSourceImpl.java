
package com.springer.api.schema.xpp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.schema.EquationSource;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "EquationSource")
public class EquationSourceImpl
    implements Serializable, EquationSource
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlAttribute(name = "Format", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String value) {
        this.format = value;
    }

}
