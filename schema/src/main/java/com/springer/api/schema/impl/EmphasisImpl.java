
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Emphasis;
import com.springer.api.schema.Superscript;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emphasises",
    "superscripts"
})
@XmlRootElement(name = "Emphasis")
public class EmphasisImpl implements Serializable, Emphasis
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Emphasis", type = EmphasisImpl.class)
    protected List<Emphasis> emphasises;
    @XmlElement(name = "Superscript", type = SuperscriptImpl.class)
    protected List<Superscript> superscripts;
    @XmlAttribute(name = "Type", required = true)
    protected String type;

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

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

}
