
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.BookSubject;
import com.springer.api.schema.BookSubjectGroup;
import com.springer.api.schema.SubjectCollection;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookSubjects",
    "subjectCollection"
})
@XmlRootElement(name = "BookSubjectGroup")
public class BookSubjectGroupImpl
    implements Serializable, BookSubjectGroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BookSubject", required = true, type = BookSubjectImpl.class)
    protected List<BookSubject> bookSubjects;
    @XmlElement(name = "SubjectCollection", required = true, type = SubjectCollectionImpl.class)
    protected SubjectCollectionImpl subjectCollection;

    public List<BookSubject> getBookSubjects() {
        if (bookSubjects == null) {
            bookSubjects = new ArrayList<BookSubject>();
        }
        return this.bookSubjects;
    }

    public SubjectCollection getSubjectCollection() {
        return subjectCollection;
    }

    public void setSubjectCollection(SubjectCollection value) {
        this.subjectCollection = ((SubjectCollectionImpl) value);
    }

}
