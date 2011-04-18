
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.BibUnstructured;
import com.springer.api.schema.Emphasis;
import com.springer.api.schema.ExternalRef;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emphasises",
    "externalReves"
})
@XmlRootElement(name = "BibUnstructured")
public class BibUnstructuredImpl
    implements Serializable, BibUnstructured
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Emphasis", type = EmphasisImpl.class)
    protected List<Emphasis> emphasises;
    @XmlElement(name = "ExternalRef", type = ExternalRefImpl.class)
    protected List<ExternalRef> externalReves;

    public List<Emphasis> getEmphasises() {
        if (emphasises == null) {
            emphasises = new ArrayList<Emphasis>();
        }
        return this.emphasises;
    }

    public List<ExternalRef> getExternalReves() {
        if (externalReves == null) {
            externalReves = new ArrayList<ExternalRef>();
        }
        return this.externalReves;
    }

}
