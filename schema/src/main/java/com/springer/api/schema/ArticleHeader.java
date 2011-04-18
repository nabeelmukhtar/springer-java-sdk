
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
 *         &lt;element ref="{}AuthorGroup"/>
 *         &lt;element ref="{}Abstract"/>
 *         &lt;element ref="{}KeywordGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ArticleHeader {


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

}
