
package org.w3._1999.xhtml;

import org.prismstandard.namespaces.pam._2.Article;


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
 *         &lt;element ref="{http://prismstandard.org/namespaces/pam/2.0/}article"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Head {


    /**
     * Gets the value of the article property.
     * 
     * @return
     *     possible object is
     *     {@link Article }
     *     
     */
    Article getArticle();

    /**
     * Sets the value of the article property.
     * 
     * @param value
     *     allowed object is
     *     {@link Article }
     *     
     */
    void setArticle(Article value);

}
