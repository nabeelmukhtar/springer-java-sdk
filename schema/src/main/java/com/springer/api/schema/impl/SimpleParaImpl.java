
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.CitationRef;
import com.springer.api.schema.Emphasis;
import com.springer.api.schema.SimplePara;
import com.springer.api.schema.Superscript;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "citationReves",
    "emphasises",
    "superscripts"
})
@XmlRootElement(name = "SimplePara")
public class SimpleParaImpl
    implements Serializable, SimplePara
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CitationRef", type = CitationRefImpl.class)
    protected List<CitationRef> citationReves;
    @XmlElement(name = "Emphasis", type = EmphasisImpl.class)
    protected List<Emphasis> emphasises;
    @XmlElement(name = "Superscript", type = SuperscriptImpl.class)
    protected List<Superscript> superscripts;

    public List<CitationRef> getCitationReves() {
        if (citationReves == null) {
            citationReves = new ArrayList<CitationRef>();
        }
        return this.citationReves;
    }

    public List<Emphasis> getEmphasises() {
        if (emphasises == null) {
            emphasises = new ArrayList<Emphasis>();
        }
        return this.emphasises;
    }

    public List<Superscript> getSuperscripts() {
        if (superscripts == null) {
            superscripts = new ArrayList<Superscript>();
        }
        return this.superscripts;
    }

}
