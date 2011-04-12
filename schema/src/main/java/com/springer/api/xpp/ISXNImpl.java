
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

import com.springer.api.ISXN;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "ISXN")
public class ISXNImpl
    implements Serializable, ISXN
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "EISBN")
    protected String eisbn;
    @XmlAttribute(name = "ISBN")
    protected String isbn;
    @XmlAttribute(name = "ISSN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issn;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getEISBN() {
        return eisbn;
    }

    public void setEISBN(String value) {
        this.eisbn = value;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String value) {
        this.isbn = value;
    }

    public String getISSN() {
        return issn;
    }

    public void setISSN(String value) {
        this.issn = value;
    }

}
