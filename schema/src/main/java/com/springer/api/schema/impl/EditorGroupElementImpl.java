
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Affiliation;
import com.springer.api.schema.Editor;
import com.springer.api.schema.EditorGroupElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "editors",
    "affiliations"
})
@XmlRootElement(name = "EditorGroupElement")
public class EditorGroupElementImpl
    implements Serializable, EditorGroupElement
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Editor", required = true, type = EditorImpl.class)
    protected List<Editor> editors;
    @XmlElement(name = "Affiliation", type = AffiliationImpl.class)
    protected List<Affiliation> affiliations;

    public List<Editor> getEditors() {
        if (editors == null) {
            editors = new ArrayList<Editor>();
        }
        return this.editors;
    }

    public List<Affiliation> getAffiliations() {
        if (affiliations == null) {
            affiliations = new ArrayList<Affiliation>();
        }
        return this.affiliations;
    }

}
