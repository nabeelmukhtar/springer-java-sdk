
package org.prismstandard.namespaces.pam._2;

import org.w3._1999.xhtml.Body;
import org.w3._1999.xhtml.Head;


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
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}head"/>
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}body"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Message {


    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link Head }
     *     
     */
    Head getHead();

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link Head }
     *     
     */
    void setHead(Head value);

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

}
