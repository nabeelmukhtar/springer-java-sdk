
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
 *         &lt;element ref="{}MetadataGrant"/>
 *         &lt;element ref="{}AbstractGrant"/>
 *         &lt;element ref="{}BodyPDFGrant"/>
 *         &lt;element ref="{}BodyHTMLGrant"/>
 *         &lt;element ref="{}BibliographyGrant"/>
 *         &lt;element ref="{}ESMGrant"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ArticleGrants {


    /**
     * Gets the value of the metadataGrant property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataGrant }
     *     
     */
    MetadataGrant getMetadataGrant();

    /**
     * Sets the value of the metadataGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataGrant }
     *     
     */
    void setMetadataGrant(MetadataGrant value);

    /**
     * Gets the value of the abstractGrant property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractGrant }
     *     
     */
    AbstractGrant getAbstractGrant();

    /**
     * Sets the value of the abstractGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractGrant }
     *     
     */
    void setAbstractGrant(AbstractGrant value);

    /**
     * Gets the value of the bodyPDFGrant property.
     * 
     * @return
     *     possible object is
     *     {@link BodyPDFGrant }
     *     
     */
    BodyPDFGrant getBodyPDFGrant();

    /**
     * Sets the value of the bodyPDFGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyPDFGrant }
     *     
     */
    void setBodyPDFGrant(BodyPDFGrant value);

    /**
     * Gets the value of the bodyHTMLGrant property.
     * 
     * @return
     *     possible object is
     *     {@link BodyHTMLGrant }
     *     
     */
    BodyHTMLGrant getBodyHTMLGrant();

    /**
     * Sets the value of the bodyHTMLGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyHTMLGrant }
     *     
     */
    void setBodyHTMLGrant(BodyHTMLGrant value);

    /**
     * Gets the value of the bibliographyGrant property.
     * 
     * @return
     *     possible object is
     *     {@link BibliographyGrant }
     *     
     */
    BibliographyGrant getBibliographyGrant();

    /**
     * Sets the value of the bibliographyGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibliographyGrant }
     *     
     */
    void setBibliographyGrant(BibliographyGrant value);

    /**
     * Gets the value of the esmGrant property.
     * 
     * @return
     *     possible object is
     *     {@link ESMGrant }
     *     
     */
    ESMGrant getESMGrant();

    /**
     * Sets the value of the esmGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESMGrant }
     *     
     */
    void setESMGrant(ESMGrant value);

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setType(String value);

}
