
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
 *         &lt;element ref="{}AuthorName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Biography" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
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
     * Gets the value of the authorName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorName }
     * 
     * 
     */
    List<AuthorName> getAuthorName();

    /**
     * Gets the value of the biography property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biography property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiography().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Biography }
     * 
     * 
     */
    List<Biography> getBiography();

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    List<Contact> getContact();

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
