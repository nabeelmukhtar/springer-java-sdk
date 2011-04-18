
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
import com.springer.api.schema.DefinitionList;
import com.springer.api.schema.Emphasis;
import com.springer.api.schema.Equation;
import com.springer.api.schema.ExternalRef;
import com.springer.api.schema.Figure;
import com.springer.api.schema.Footnote;
import com.springer.api.schema.InlineEquation;
import com.springer.api.schema.InternalRef;
import com.springer.api.schema.MediaObject;
import com.springer.api.schema.Para;
import com.springer.api.schema.Subscript;
import com.springer.api.schema.Superscript;
import com.springer.api.schema.Table;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "citationReves",
    "emphasises",
    "externalReves",
    "figures",
    "mediaObjects",
    "superscripts",
    "tables",
    "definitionLists",
    "equations",
    "footnotes",
    "inlineEquations",
    "internalReves",
    "subscripts"
})
@XmlRootElement(name = "Para")
public class ParaImpl
    implements Serializable, Para
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CitationRef", type = CitationRefImpl.class)
    protected List<CitationRef> citationReves;
    @XmlElement(name = "Emphasis", type = EmphasisImpl.class)
    protected List<Emphasis> emphasises;
    @XmlElement(name = "ExternalRef", type = ExternalRefImpl.class)
    protected List<ExternalRef> externalReves;
    @XmlElement(name = "Figure", type = FigureImpl.class)
    protected List<Figure> figures;
    @XmlElement(name = "MediaObject", type = MediaObjectImpl.class)
    protected List<MediaObject> mediaObjects;
    @XmlElement(name = "Superscript", type = SuperscriptImpl.class)
    protected List<Superscript> superscripts;
    @XmlElement(name = "Table", type = TableImpl.class)
    protected List<Table> tables;
    @XmlElement(name = "DefinitionList", type = DefinitionListImpl.class)
    protected List<DefinitionList> definitionLists;
    @XmlElement(name = "Equation", type = EquationImpl.class)
    protected List<Equation> equations;
    @XmlElement(name = "Footnote", type = FootnoteImpl.class)
    protected List<Footnote> footnotes;
    @XmlElement(name = "InlineEquation", type = InlineEquationImpl.class)
    protected List<InlineEquation> inlineEquations;
    @XmlElement(name = "InternalRef", type = InternalRefImpl.class)
    protected List<InternalRef> internalReves;
    @XmlElement(name = "Subscript", type = SubscriptImpl.class)
    protected List<Subscript> subscripts;

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

    public List<ExternalRef> getExternalReves() {
        if (externalReves == null) {
            externalReves = new ArrayList<ExternalRef>();
        }
        return this.externalReves;
    }

    public List<Figure> getFigures() {
        if (figures == null) {
            figures = new ArrayList<Figure>();
        }
        return this.figures;
    }

    public List<MediaObject> getMediaObjects() {
        if (mediaObjects == null) {
            mediaObjects = new ArrayList<MediaObject>();
        }
        return this.mediaObjects;
    }

    public List<Superscript> getSuperscripts() {
        if (superscripts == null) {
            superscripts = new ArrayList<Superscript>();
        }
        return this.superscripts;
    }

    public List<Table> getTables() {
        if (tables == null) {
            tables = new ArrayList<Table>();
        }
        return this.tables;
    }

    public List<DefinitionList> getDefinitionLists() {
        if (definitionLists == null) {
            definitionLists = new ArrayList<DefinitionList>();
        }
        return this.definitionLists;
    }

    public List<Equation> getEquations() {
        if (equations == null) {
            equations = new ArrayList<Equation>();
        }
        return this.equations;
    }

    public List<Footnote> getFootnotes() {
        if (footnotes == null) {
            footnotes = new ArrayList<Footnote>();
        }
        return this.footnotes;
    }

    public List<InlineEquation> getInlineEquations() {
        if (inlineEquations == null) {
            inlineEquations = new ArrayList<InlineEquation>();
        }
        return this.inlineEquations;
    }

    public List<InternalRef> getInternalReves() {
        if (internalReves == null) {
            internalReves = new ArrayList<InternalRef>();
        }
        return this.internalReves;
    }

    public List<Subscript> getSubscripts() {
        if (subscripts == null) {
            subscripts = new ArrayList<Subscript>();
        }
        return this.subscripts;
    }

}
