
package com.springer.api.schema.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.schema.Author;
import com.springer.api.schema.AuthorName;
import com.springer.api.schema.Biography;
import com.springer.api.schema.Contact;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorName",
    "biography",
    "contact"
})
@XmlRootElement(name = "Author")
public class AuthorImpl
    implements Serializable, Author
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "AuthorName", type = AuthorNameImpl.class)
    protected List<AuthorName> authorName;
    @XmlElement(name = "Biography", type = BiographyImpl.class)
    protected List<Biography> biography;
    @XmlElement(name = "Contact", type = ContactImpl.class)
    protected List<Contact> contact;
    @XmlAttribute(name = "AffiliationIDS")
    protected String affiliationIDS;
    @XmlAttribute(name = "CorrespondingAffiliationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String correspondingAffiliationID;

    public List<AuthorName> getAuthorName() {
        if (authorName == null) {
            authorName = new ArrayList<AuthorName>();
        }
        return this.authorName;
    }

    public List<Biography> getBiography() {
        if (biography == null) {
            biography = new ArrayList<Biography>();
        }
        return this.biography;
    }

    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }

    public String getAffiliationIDS() {
        return affiliationIDS;
    }

    public void setAffiliationIDS(String value) {
        this.affiliationIDS = value;
    }

    public String getCorrespondingAffiliationID() {
        return correspondingAffiliationID;
    }

    public void setCorrespondingAffiliationID(String value) {
        this.correspondingAffiliationID = value;
    }

}
