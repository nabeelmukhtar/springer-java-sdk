
package com.springer.api.schema.impl;

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
    "journalSubjects"
})
@XmlRootElement(name = "JournalSubjectGroup")
public class JournalSubjectGroupImpl
    implements Serializable, JournalSubjectGroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "JournalSubject", required = true, type = JournalSubjectImpl.class)
    protected List<JournalSubject> journalSubjects;

    public List<JournalSubject> getJournalSubjects() {
        if (journalSubjects == null) {
            journalSubjects = new ArrayList<JournalSubject>();
        }
        return this.journalSubjects;
    }

}
