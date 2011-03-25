
package com.springer.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}CitationRef"/>
 *         &lt;element ref="{}Emphasis"/>
 *         &lt;element ref="{}ExternalRef"/>
 *         &lt;element ref="{}Figure"/>
 *         &lt;element ref="{}MediaObject"/>
 *         &lt;element ref="{}Superscript"/>
 *         &lt;element ref="{}Table"/>
 *         &lt;element ref="{}DefinitionList"/>
 *         &lt;element ref="{}Equation"/>
 *         &lt;element ref="{}Footnote"/>
 *         &lt;element ref="{}InlineEquation"/>
 *         &lt;element ref="{}InternalRef"/>
 *         &lt;element ref="{}Subscript"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Para")
public class Para implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElementRefs({
        @XmlElementRef(name = "InternalRef", type = InternalRef.class),
        @XmlElementRef(name = "MediaObject", type = MediaObject.class),
        @XmlElementRef(name = "Table", type = Table.class),
        @XmlElementRef(name = "Equation", type = Equation.class),
        @XmlElementRef(name = "ExternalRef", type = ExternalRef.class),
        @XmlElementRef(name = "Emphasis", type = Emphasis.class),
        @XmlElementRef(name = "InlineEquation", type = InlineEquation.class),
        @XmlElementRef(name = "Superscript", type = Superscript.class),
        @XmlElementRef(name = "DefinitionList", type = DefinitionList.class),
        @XmlElementRef(name = "Footnote", type = Footnote.class),
        @XmlElementRef(name = "CitationRef", type = CitationRef.class),
        @XmlElementRef(name = "Figure", type = Figure.class),
        @XmlElementRef(name = "Subscript", type = Subscript.class)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalRef }
     * {@link MediaObject }
     * {@link Table }
     * {@link Equation }
     * {@link ExternalRef }
     * {@link Emphasis }
     * {@link InlineEquation }
     * {@link Superscript }
     * {@link DefinitionList }
     * {@link Footnote }
     * {@link CitationRef }
     * {@link String }
     * {@link Figure }
     * {@link Subscript }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
