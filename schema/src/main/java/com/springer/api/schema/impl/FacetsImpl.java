
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Facet;
import com.springer.api.schema.Facets;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "facets"
})
@XmlRootElement(name = "facets")
public class FacetsImpl
    implements Serializable, Facets
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "facet", required = true, type = FacetImpl.class)
    protected List<Facet> facets;

    public List<Facet> getFacets() {
        if (facets == null) {
            facets = new ArrayList<Facet>();
        }
        return this.facets;
    }

}
