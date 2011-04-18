
package com.springer.api.schema.xpp;

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
    "emphasis",
    "externalRef"
})
@XmlRootElement(name = "BibUnstructured")
public class BibUnstructuredImpl
    implements Serializable, BibUnstructured
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Emphasis", type = EmphasisImpl.class)
    protected List<Emphasis> emphasis;
    @XmlElement(name = "ExternalRef", type = ExternalRefImpl.class)
    protected List<ExternalRef> externalRef;

    public List<Emphasis> getEmphasis() {
        if (emphasis == null) {
            emphasis = new ArrayList<Emphasis>();
        }
        return this.emphasis;
    }

    public List<ExternalRef> getExternalRef() {
        if (externalRef == null) {
            externalRef = new ArrayList<ExternalRef>();
        }
        return this.externalRef;
    }

}
