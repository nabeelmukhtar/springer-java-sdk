
package com.springer.api.xpp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.EquationSource;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "EquationSource")
public class EquationSourceImpl
    implements Serializable, EquationSource
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlValue
    protected String content;
    @XmlAttribute(name = "Format", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String format;

    public String getContent() {
        return content;
    }

    public void setContent(String value) {
        this.content = value;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String value) {
        this.format = value;
    }

}
