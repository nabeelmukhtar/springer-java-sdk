
package com.springer.api.schema.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.JournalSubject;
import com.springer.api.schema.JournalSubjectGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "journalSubject"
})
@XmlRootElement(name = "JournalSubjectGroup")
public class JournalSubjectGroupImpl
    extends BaseSchemaEntity implements JournalSubjectGroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "JournalSubject", required = true, type = JournalSubjectImpl.class)
    protected List<JournalSubject> journalSubject;

    public List<JournalSubject> getJournalSubject() {
        if (journalSubject == null) {
            journalSubject = new ArrayList<JournalSubject>();
        }
        return this.journalSubject;
    }

}
