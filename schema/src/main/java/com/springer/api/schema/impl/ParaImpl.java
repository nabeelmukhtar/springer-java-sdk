
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
    "citationRef",
    "emphasis",
    "externalRef",
    "figure",
    "mediaObject",
    "superscript",
    "table",
    "definitionList",
    "equation",
    "footnote",
    "inlineEquation",
    "internalRef",
    "subscript"
})
@XmlRootElement(name = "Para")
public class ParaImpl
    implements Serializable, Para
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CitationRef", type = CitationRefImpl.class)
    protected List<CitationRef> citationRef;
    @XmlElement(name = "Emphasis", type = EmphasisImpl.class)
    protected List<Emphasis> emphasis;
    @XmlElement(name = "ExternalRef", type = ExternalRefImpl.class)
    protected List<ExternalRef> externalRef;
    @XmlElement(name = "Figure", type = FigureImpl.class)
    protected List<Figure> figure;
    @XmlElement(name = "MediaObject", type = MediaObjectImpl.class)
    protected List<MediaObject> mediaObject;
    @XmlElement(name = "Superscript", type = SuperscriptImpl.class)
    protected List<Superscript> superscript;
    @XmlElement(name = "Table", type = TableImpl.class)
    protected List<Table> table;
    @XmlElement(name = "DefinitionList", type = DefinitionListImpl.class)
    protected List<DefinitionList> definitionList;
    @XmlElement(name = "Equation", type = EquationImpl.class)
    protected List<Equation> equation;
    @XmlElement(name = "Footnote", type = FootnoteImpl.class)
    protected List<Footnote> footnote;
    @XmlElement(name = "InlineEquation", type = InlineEquationImpl.class)
    protected List<InlineEquation> inlineEquation;
    @XmlElement(name = "InternalRef", type = InternalRefImpl.class)
    protected List<InternalRef> internalRef;
    @XmlElement(name = "Subscript", type = SubscriptImpl.class)
    protected List<Subscript> subscript;

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

    public List<ExternalRef> getExternalRef() {
        if (externalRef == null) {
            externalRef = new ArrayList<ExternalRef>();
        }
        return this.externalRef;
    }

    public List<Figure> getFigure() {
        if (figure == null) {
            figure = new ArrayList<Figure>();
        }
        return this.figure;
    }

    public List<MediaObject> getMediaObject() {
        if (mediaObject == null) {
            mediaObject = new ArrayList<MediaObject>();
        }
        return this.mediaObject;
    }

    public List<Superscript> getSuperscript() {
        if (superscript == null) {
            superscript = new ArrayList<Superscript>();
        }
        return this.superscript;
    }

    public List<Table> getTable() {
        if (table == null) {
            table = new ArrayList<Table>();
        }
        return this.table;
    }

    public List<DefinitionList> getDefinitionList() {
        if (definitionList == null) {
            definitionList = new ArrayList<DefinitionList>();
        }
        return this.definitionList;
    }

    public List<Equation> getEquation() {
        if (equation == null) {
            equation = new ArrayList<Equation>();
        }
        return this.equation;
    }

    public List<Footnote> getFootnote() {
        if (footnote == null) {
            footnote = new ArrayList<Footnote>();
        }
        return this.footnote;
    }

    public List<InlineEquation> getInlineEquation() {
        if (inlineEquation == null) {
            inlineEquation = new ArrayList<InlineEquation>();
        }
        return this.inlineEquation;
    }

    public List<InternalRef> getInternalRef() {
        if (internalRef == null) {
            internalRef = new ArrayList<InternalRef>();
        }
        return this.internalRef;
    }

    public List<Subscript> getSubscript() {
        if (subscript == null) {
            subscript = new ArrayList<Subscript>();
        }
        return this.subscript;
    }

}
