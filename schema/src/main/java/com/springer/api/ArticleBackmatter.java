
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
 *         &lt;element ref="{}Acknowledgments" minOccurs="0"/>
 *         &lt;element ref="{}Bibliography"/>
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
    "acknowledgments",
    "bibliography"
})
@XmlRootElement(name = "ArticleBackmatter")
public class ArticleBackmatter
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Acknowledgments")
    protected Acknowledgments acknowledgments;
    @XmlElement(name = "Bibliography", required = true)
    protected Bibliography bibliography;

    /**
     * Gets the value of the acknowledgments property.
     * 
     * @return
     *     possible object is
     *     {@link Acknowledgments }
     *     
     */
    public Acknowledgments getAcknowledgments() {
        return acknowledgments;
    }

    /**
     * Sets the value of the acknowledgments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acknowledgments }
     *     
     */
    public void setAcknowledgments(Acknowledgments value) {
        this.acknowledgments = value;
    }

    /**
     * Gets the value of the bibliography property.
     * 
     * @return
     *     possible object is
     *     {@link Bibliography }
     *     
     */
    public Bibliography getBibliography() {
        return bibliography;
    }

    /**
     * Sets the value of the bibliography property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bibliography }
     *     
     */
    public void setBibliography(Bibliography value) {
        this.bibliography = value;
    }

}
