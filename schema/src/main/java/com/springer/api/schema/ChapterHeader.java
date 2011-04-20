
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
 *         &lt;element ref="{}AuthorGroup"/>
 *         &lt;element ref="{}Abstract" minOccurs="0"/>
 *         &lt;element ref="{}KeywordGroup" minOccurs="0"/>
 *         &lt;element ref="{}ArticleNote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ChapterHeader {


    /**
     * Gets the value of the authorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorGroup }
     *     
     */
    AuthorGroup getAuthorGroup();

    /**
     * Sets the value of the authorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorGroup }
     *     
     */
    void setAuthorGroup(AuthorGroup value);

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Abstract }
     *     
     */
    Abstract getAbstract();

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Abstract }
     *     
     */
    void setAbstract(Abstract value);

    /**
     * Gets the value of the keywordGroup property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordGroup }
     *     
     */
    KeywordGroup getKeywordGroup();

    /**
     * Sets the value of the keywordGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordGroup }
     *     
     */
    void setKeywordGroup(KeywordGroup value);

    /**
     * Gets the value of the articleNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articleNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticleNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticleNote }
     * 
     * 
     */
    List<ArticleNote> getArticleNotes();

}
