
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Para;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Para")
public class ParaImpl
    implements Serializable, Para
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElementRefs({
        @XmlElementRef(name = "UnorderedList", type = UnorderedListImpl.class),
        @XmlElementRef(name = "Superscript", type = SuperscriptImpl.class),
        @XmlElementRef(name = "Figure", type = FigureImpl.class),
        @XmlElementRef(name = "DefinitionList", type = DefinitionListImpl.class),
        @XmlElementRef(name = "OrderedList", type = OrderedListImpl.class),
        @XmlElementRef(name = "Table", type = TableImpl.class),
        @XmlElementRef(name = "MediaObject", type = MediaObjectImpl.class),
        @XmlElementRef(name = "CitationRef", type = CitationRefImpl.class),
        @XmlElementRef(name = "Footnote", type = FootnoteImpl.class),
        @XmlElementRef(name = "InlineMediaObject", type = JAXBElement.class),
        @XmlElementRef(name = "ExternalRef", type = ExternalRefImpl.class),
        @XmlElementRef(name = "BlockQuote", type = BlockQuoteImpl.class),
        @XmlElementRef(name = "Equation", type = EquationImpl.class),
        @XmlElementRef(name = "Subscript", type = SubscriptImpl.class),
        @XmlElementRef(name = "InternalRef", type = InternalRefImpl.class),
        @XmlElementRef(name = "Emphasis", type = EmphasisImpl.class),
        @XmlElementRef(name = "InlineEquation", type = InlineEquationImpl.class)
    })
    @XmlMixed
    protected List<Object> content;

    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
