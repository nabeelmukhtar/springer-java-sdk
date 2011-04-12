
package com.springer.api.impl;

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

import com.springer.api.Facet;
import com.springer.api.FacetValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "facetValue"
})
@XmlRootElement(name = "facet")
public class FacetImpl
    implements Serializable, Facet
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "facet-value", required = true, type = FacetValueImpl.class)
    protected List<FacetValue> facetValue;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;

    public List<FacetValue> getFacetValue() {
        if (facetValue == null) {
            facetValue = new ArrayList<FacetValue>();
        }
        return this.facetValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
