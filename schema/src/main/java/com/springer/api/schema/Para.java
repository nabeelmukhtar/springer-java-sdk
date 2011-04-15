
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
public interface Para {


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
     * {@link Superscript }
     * {@link MediaObject }
     * {@link Table }
     * {@link Equation }
     * {@link ExternalRef }
     * {@link Emphasis }
     * {@link String }
     * {@link InlineEquation }
     * {@link DefinitionList }
     * {@link Footnote }
     * {@link CitationRef }
     * {@link Figure }
     * {@link Subscript }
     * 
     * 
     */
    List<Object> getContent();

}
