
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
import com.springer.api.schema.Facet;
import com.springer.api.schema.FacetName;
import com.springer.api.schema.FacetValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "facetValues"
})
@XmlRootElement(name = "facet")
public class FacetImpl
    implements Serializable, Facet
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "facet-value", required = true, type = FacetValueImpl.class)
    protected List<FacetValue> facetValues;
    @XmlAttribute(required = true)
    protected FacetName name;

    public List<FacetValue> getFacetValues() {
        if (facetValues == null) {
            facetValues = new ArrayList<FacetValue>();
        }
        return this.facetValues;
    }

    public FacetName getName() {
        return name;
    }

    public void setName(FacetName value) {
        this.name = value;
    }

}
