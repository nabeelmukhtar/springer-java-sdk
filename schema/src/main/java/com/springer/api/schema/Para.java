
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
     * Gets the value of the citationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitationRef }
     * 
     * 
     */
    List<CitationRef> getCitationRef();

    /**
     * Gets the value of the emphasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emphasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmphasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Emphasis }
     * 
     * 
     */
    List<Emphasis> getEmphasis();

    /**
     * Gets the value of the externalRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalRef }
     * 
     * 
     */
    List<ExternalRef> getExternalRef();

    /**
     * Gets the value of the figure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the figure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFigure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Figure }
     * 
     * 
     */
    List<Figure> getFigure();

    /**
     * Gets the value of the mediaObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaObject }
     * 
     * 
     */
    List<MediaObject> getMediaObject();

    /**
     * Gets the value of the superscript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superscript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperscript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Superscript }
     * 
     * 
     */
    List<Superscript> getSuperscript();

    /**
     * Gets the value of the table property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the table property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Table }
     * 
     * 
     */
    List<Table> getTable();

    /**
     * Gets the value of the definitionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definitionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinitionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefinitionList }
     * 
     * 
     */
    List<DefinitionList> getDefinitionList();

    /**
     * Gets the value of the equation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Equation }
     * 
     * 
     */
    List<Equation> getEquation();

    /**
     * Gets the value of the footnote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the footnote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFootnote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Footnote }
     * 
     * 
     */
    List<Footnote> getFootnote();

    /**
     * Gets the value of the inlineEquation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inlineEquation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInlineEquation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InlineEquation }
     * 
     * 
     */
    List<InlineEquation> getInlineEquation();

    /**
     * Gets the value of the internalRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalRef }
     * 
     * 
     */
    List<InternalRef> getInternalRef();

    /**
     * Gets the value of the subscript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscript }
     * 
     * 
     */
    List<Subscript> getSubscript();

}
