
package com.springer.api.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.Facet;
import com.springer.api.Facets;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "facet"
})
@XmlRootElement(name = "facets")
public class FacetsImpl
    implements Serializable, Facets
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = FacetImpl.class)
    protected List<Facet> facet;

    public List<Facet> getFacet() {
        if (facet == null) {
            facet = new ArrayList<Facet>();
        }
        return this.facet;
    }

}
