
package com.springer.app.meta.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.app.meta.Subject;
import com.springer.app.meta.SubjectGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subject"
})
@XmlRootElement(name = "SubjectGroup")
public class SubjectGroupImpl
    extends BaseSchemaEntity implements SubjectGroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Subject", required = true, type = SubjectImpl.class)
    protected List<Subject> subject;

    public List<Subject> getSubject() {
        if (subject == null) {
            subject = new ArrayList<Subject>();
        }
        return this.subject;
    }

}
