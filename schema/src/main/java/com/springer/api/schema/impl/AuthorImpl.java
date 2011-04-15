
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.schema.Author;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Author")
public class AuthorImpl
    implements Serializable, Author
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElementRefs({
        @XmlElementRef(name = "AuthorName", type = AuthorNameImpl.class),
        @XmlElementRef(name = "Biography", type = BiographyImpl.class),
        @XmlElementRef(name = "Contact", type = ContactImpl.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "AffiliationIDS")
    protected String affiliationIDS;
    @XmlAttribute(name = "CorrespondingAffiliationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String correspondingAffiliationID;

    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
