
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
 *         &lt;element ref="{}ArticleInfo"/>
 *         &lt;element ref="{}ArticleHeader"/>
 *         &lt;element ref="{}Body" minOccurs="0"/>
 *         &lt;element ref="{}BodyRef" maxOccurs="unbounded"/>
 *         &lt;element ref="{}ArticleBackmatter"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="OutputMedium" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Article {


    /**
     * Gets the value of the articleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleInfo }
     *     
     */
    ArticleInfo getArticleInfo();

    /**
     * Sets the value of the articleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleInfo }
     *     
     */
    void setArticleInfo(ArticleInfo value);

    /**
     * Gets the value of the articleHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleHeader }
     *     
     */
    ArticleHeader getArticleHeader();

    /**
     * Sets the value of the articleHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleHeader }
     *     
     */
    void setArticleHeader(ArticleHeader value);

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Body }
     *     
     */
    Body getBody();

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Body }
     *     
     */
    void setBody(Body value);

    /**
     * Gets the value of the bodyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BodyRef }
     * 
     * 
     */
    List<BodyRef> getBodyRef();

    /**
     * Gets the value of the articleBackmatter property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleBackmatter }
     *     
     */
    ArticleBackmatter getArticleBackmatter();

    /**
     * Sets the value of the articleBackmatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleBackmatter }
     *     
     */
    void setArticleBackmatter(ArticleBackmatter value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getID();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setID(String value);

    /**
     * Gets the value of the outputMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getOutputMedium();

    /**
     * Sets the value of the outputMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setOutputMedium(String value);

}
