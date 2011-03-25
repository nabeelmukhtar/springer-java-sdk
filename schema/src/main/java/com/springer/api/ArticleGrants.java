
package com.springer.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}MetadataGrant"/>
 *         &lt;element ref="{}AbstractGrant"/>
 *         &lt;element ref="{}BodyPDFGrant"/>
 *         &lt;element ref="{}BodyHTMLGrant"/>
 *         &lt;element ref="{}BibliographyGrant"/>
 *         &lt;element ref="{}ESMGrant"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metadataGrant",
    "abstractGrant",
    "bodyPDFGrant",
    "bodyHTMLGrant",
    "bibliographyGrant",
    "esmGrant"
})
@XmlRootElement(name = "ArticleGrants")
public class ArticleGrants
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "MetadataGrant", required = true)
    protected MetadataGrant metadataGrant;
    @XmlElement(name = "AbstractGrant", required = true)
    protected AbstractGrant abstractGrant;
    @XmlElement(name = "BodyPDFGrant", required = true)
    protected BodyPDFGrant bodyPDFGrant;
    @XmlElement(name = "BodyHTMLGrant", required = true)
    protected BodyHTMLGrant bodyHTMLGrant;
    @XmlElement(name = "BibliographyGrant", required = true)
    protected BibliographyGrant bibliographyGrant;
    @XmlElement(name = "ESMGrant", required = true)
    protected ESMGrant esmGrant;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Gets the value of the metadataGrant property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataGrant }
     *     
     */
    public MetadataGrant getMetadataGrant() {
        return metadataGrant;
    }

    /**
     * Sets the value of the metadataGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataGrant }
     *     
     */
    public void setMetadataGrant(MetadataGrant value) {
        this.metadataGrant = value;
    }

    /**
     * Gets the value of the abstractGrant property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractGrant }
     *     
     */
    public AbstractGrant getAbstractGrant() {
        return abstractGrant;
    }

    /**
     * Sets the value of the abstractGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractGrant }
     *     
     */
    public void setAbstractGrant(AbstractGrant value) {
        this.abstractGrant = value;
    }

    /**
     * Gets the value of the bodyPDFGrant property.
     * 
     * @return
     *     possible object is
     *     {@link BodyPDFGrant }
     *     
     */
    public BodyPDFGrant getBodyPDFGrant() {
        return bodyPDFGrant;
    }

    /**
     * Sets the value of the bodyPDFGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyPDFGrant }
     *     
     */
    public void setBodyPDFGrant(BodyPDFGrant value) {
        this.bodyPDFGrant = value;
    }

    /**
     * Gets the value of the bodyHTMLGrant property.
     * 
     * @return
     *     possible object is
     *     {@link BodyHTMLGrant }
     *     
     */
    public BodyHTMLGrant getBodyHTMLGrant() {
        return bodyHTMLGrant;
    }

    /**
     * Sets the value of the bodyHTMLGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyHTMLGrant }
     *     
     */
    public void setBodyHTMLGrant(BodyHTMLGrant value) {
        this.bodyHTMLGrant = value;
    }

    /**
     * Gets the value of the bibliographyGrant property.
     * 
     * @return
     *     possible object is
     *     {@link BibliographyGrant }
     *     
     */
    public BibliographyGrant getBibliographyGrant() {
        return bibliographyGrant;
    }

    /**
     * Sets the value of the bibliographyGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibliographyGrant }
     *     
     */
    public void setBibliographyGrant(BibliographyGrant value) {
        this.bibliographyGrant = value;
    }

    /**
     * Gets the value of the esmGrant property.
     * 
     * @return
     *     possible object is
     *     {@link ESMGrant }
     *     
     */
    public ESMGrant getESMGrant() {
        return esmGrant;
    }

    /**
     * Sets the value of the esmGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESMGrant }
     *     
     */
    public void setESMGrant(ESMGrant value) {
        this.esmGrant = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
