
package com.springer.api.schema.xpp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;

import com.springer.api.schema.JournalSubject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "JournalSubject")
public class JournalSubjectImpl
    implements Serializable, JournalSubject
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlAttribute(name = "Priority")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long priority;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long value) {
        this.priority = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

}
