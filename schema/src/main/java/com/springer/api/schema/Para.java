
package com.springer.api.schema;

import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}CitationRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Emphasis" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ExternalRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Figure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MediaObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Superscript" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Table" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DefinitionList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Equation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Footnote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}InlineEquation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}InternalRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Subscript" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Para {


    /**
     * Gets the value of the citationReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citationReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitationReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitationRef }
     * 
     * 
     */
    List<CitationRef> getCitationReves();

    /**
     * Gets the value of the emphasises property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emphasises property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmphasises().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Emphasis }
     * 
     * 
     */
    List<Emphasis> getEmphasises();

    /**
     * Gets the value of the externalReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalRef }
     * 
     * 
     */
    List<ExternalRef> getExternalReves();

    /**
     * Gets the value of the figures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the figures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFigures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Figure }
     * 
     * 
     */
    List<Figure> getFigures();

    /**
     * Gets the value of the mediaObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaObject }
     * 
     * 
     */
    List<MediaObject> getMediaObjects();

    /**
     * Gets the value of the superscripts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superscripts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperscripts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Superscript }
     * 
     * 
     */
    List<Superscript> getSuperscripts();

    /**
     * Gets the value of the tables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Table }
     * 
     * 
     */
    List<Table> getTables();

    /**
     * Gets the value of the definitionLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definitionLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinitionLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefinitionList }
     * 
     * 
     */
    List<DefinitionList> getDefinitionLists();

    /**
     * Gets the value of the equations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Equation }
     * 
     * 
     */
    List<Equation> getEquations();

    /**
     * Gets the value of the footnotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the footnotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFootnotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Footnote }
     * 
     * 
     */
    List<Footnote> getFootnotes();

    /**
     * Gets the value of the inlineEquations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inlineEquations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInlineEquations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InlineEquation }
     * 
     * 
     */
    List<InlineEquation> getInlineEquations();

    /**
     * Gets the value of the internalReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalRef }
     * 
     * 
     */
    List<InternalRef> getInternalReves();

    /**
     * Gets the value of the subscripts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscripts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscripts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscript }
     * 
     * 
     */
    List<Subscript> getSubscripts();

}
