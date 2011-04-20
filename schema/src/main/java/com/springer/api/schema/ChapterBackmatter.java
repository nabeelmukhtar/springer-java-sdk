
package com.springer.api.schema;



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
 *         &lt;element ref="{}ArticleNote" minOccurs="0"/>
 *         &lt;element ref="{}Bibliography"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ChapterBackmatter {


    /**
     * Gets the value of the articleNote property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleNote }
     *     
     */
    ArticleNote getArticleNote();

    /**
     * Sets the value of the articleNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleNote }
     *     
     */
    void setArticleNote(ArticleNote value);

    /**
     * Gets the value of the bibliography property.
     * 
     * @return
     *     possible object is
     *     {@link Bibliography }
     *     
     */
    Bibliography getBibliography();

    /**
     * Sets the value of the bibliography property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bibliography }
     *     
     */
    void setBibliography(Bibliography value);

}
