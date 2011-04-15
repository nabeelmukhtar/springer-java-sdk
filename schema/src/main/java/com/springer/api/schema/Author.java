
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}AuthorName"/>
 *         &lt;element ref="{}Biography"/>
 *         &lt;element ref="{}Contact"/>
 *       &lt;/choice>
 *       &lt;attribute name="AffiliationIDS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CorrespondingAffiliationID" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Author {


    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorName }
     * {@link String }
     * {@link Biography }
     * {@link Contact }
     * 
     * 
     */
    List<Object> getContent();

    /**
     * Gets the value of the affiliationIDS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAffiliationIDS();

    /**
     * Sets the value of the affiliationIDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAffiliationIDS(String value);

    /**
     * Gets the value of the correspondingAffiliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCorrespondingAffiliationID();

    /**
     * Sets the value of the correspondingAffiliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCorrespondingAffiliationID(String value);

}
