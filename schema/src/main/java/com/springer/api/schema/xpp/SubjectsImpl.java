
package com.springer.api.schema.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Subject;
import com.springer.api.schema.Subjects;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subject"
})
@XmlRootElement(name = "Subjects")
public class SubjectsImpl
    extends BaseSchemaEntity implements Subjects
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
