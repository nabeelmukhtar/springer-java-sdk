
package com.springer.api.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.Affiliation;
import com.springer.api.Author;
import com.springer.api.AuthorGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "author",
    "affiliation"
})
@XmlRootElement(name = "AuthorGroup")
public class AuthorGroupImpl
    implements Serializable, AuthorGroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Author", required = true, type = AuthorImpl.class)
    protected List<Author> author;
    @XmlElement(name = "Affiliation", required = true, type = AffiliationImpl.class)
    protected List<Affiliation> affiliation;

    public List<Author> getAuthor() {
        if (author == null) {
            author = new ArrayList<Author>();
        }
        return this.author;
    }

    public List<Affiliation> getAffiliation() {
        if (affiliation == null) {
            affiliation = new ArrayList<Affiliation>();
        }
        return this.affiliation;
    }

}
