
package com.springer.api.schema.xpp;

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
    "citationRef",
    "emphasis",
    "superscript"
})
@XmlRootElement(name = "SimplePara")
public class SimpleParaImpl
    implements Serializable, SimplePara
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CitationRef", type = CitationRefImpl.class)
    protected List<CitationRef> citationRef;
    @XmlElement(name = "Emphasis", type = EmphasisImpl.class)
    protected List<Emphasis> emphasis;
    @XmlElement(name = "Superscript", type = SuperscriptImpl.class)
    protected List<Superscript> superscript;

    public List<CitationRef> getCitationRef() {
        if (citationRef == null) {
            citationRef = new ArrayList<CitationRef>();
        }
        return this.citationRef;
    }

    public List<Emphasis> getEmphasis() {
        if (emphasis == null) {
            emphasis = new ArrayList<Emphasis>();
        }
        return this.emphasis;
    }

    public List<Superscript> getSuperscript() {
        if (superscript == null) {
            superscript = new ArrayList<Superscript>();
        }
        return this.superscript;
    }

}
