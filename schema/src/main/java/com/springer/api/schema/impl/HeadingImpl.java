
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Emphasis;
import com.springer.api.schema.Heading;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emphasises"
})
@XmlRootElement(name = "Heading")
public class HeadingImpl
    implements Serializable, Heading
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Emphasis", type = EmphasisImpl.class)
    protected List<Emphasis> emphasises;

    public List<Emphasis> getEmphasises() {
        if (emphasises == null) {
            emphasises = new ArrayList<Emphasis>();
        }
        return this.emphasises;
    }

}
