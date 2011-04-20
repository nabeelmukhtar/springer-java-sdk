
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Contact;
import com.springer.api.schema.Editor;
import com.springer.api.schema.EditorName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "editorName",
    "contact"
})
@XmlRootElement(name = "Editor")
public class EditorImpl
    implements Serializable, Editor
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "EditorName", required = true, type = EditorNameImpl.class)
    protected EditorNameImpl editorName;
    @XmlElement(name = "Contact", type = ContactImpl.class)
    protected ContactImpl contact;
    @XmlAttribute(name = "AffiliationIDS")
    protected String affiliationIDS;

    public EditorName getEditorName() {
        return editorName;
    }

    public void setEditorName(EditorName value) {
        this.editorName = ((EditorNameImpl) value);
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact value) {
        this.contact = ((ContactImpl) value);
    }

    public String getAffiliationIDS() {
        return affiliationIDS;
    }

    public void setAffiliationIDS(String value) {
        this.affiliationIDS = value;
    }

}
