
package com.springer.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorGroup",
    "_abstract",
    "keywordGroup"
})
@XmlRootElement(name = "ArticleHeader")
public class ArticleHeader
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "AuthorGroup", required = true)
    protected AuthorGroup authorGroup;
    @XmlElement(name = "Abstract", required = true)
    protected Abstract _abstract;
    @XmlElement(name = "KeywordGroup", required = true)
    protected KeywordGroup keywordGroup;

    /**
     * Gets the value of the authorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorGroup }
     *     
     */
    public AuthorGroup getAuthorGroup() {
        return authorGroup;
    }

    /**
     * Sets the value of the authorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorGroup }
     *     
     */
    public void setAuthorGroup(AuthorGroup value) {
        this.authorGroup = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Abstract }
     *     
     */
    public Abstract getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Abstract }
     *     
     */
    public void setAbstract(Abstract value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the keywordGroup property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordGroup }
     *     
     */
    public KeywordGroup getKeywordGroup() {
        return keywordGroup;
    }

    /**
     * Sets the value of the keywordGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordGroup }
     *     
     */
    public void setKeywordGroup(KeywordGroup value) {
        this.keywordGroup = value;
    }

}
