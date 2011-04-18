
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Author;
import com.springer.api.schema.AuthorName;
import com.springer.api.schema.Biography;
import com.springer.api.schema.Contact;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorNames",
    "biographies",
    "contacts"
})
@XmlRootElement(name = "Author")
public class AuthorImpl
    implements Serializable, Author
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "AuthorName", type = AuthorNameImpl.class)
    protected List<AuthorName> authorNames;
    @XmlElement(name = "Biography", type = BiographyImpl.class)
    protected List<Biography> biographies;
    @XmlElement(name = "Contact", type = ContactImpl.class)
    protected List<Contact> contacts;
    @XmlAttribute(name = "AffiliationIDS")
    @XmlSchemaType(name = "anySimpleType")
    protected String affiliationIDS;
    @XmlAttribute(name = "CorrespondingAffiliationID")
    protected String correspondingAffiliationID;

    public List<AuthorName> getAuthorNames() {
        if (authorNames == null) {
            authorNames = new ArrayList<AuthorName>();
        }
        return this.authorNames;
    }

    public List<Biography> getBiographies() {
        if (biographies == null) {
            biographies = new ArrayList<Biography>();
        }
        return this.biographies;
    }

    public List<Contact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<Contact>();
        }
        return this.contacts;
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
