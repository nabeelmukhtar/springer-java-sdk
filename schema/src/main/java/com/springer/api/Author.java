
package com.springer.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Author")
public class Author
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElementRefs({
        @XmlElementRef(name = "AuthorName", type = AuthorName.class),
        @XmlElementRef(name = "Biography", type = Biography.class),
        @XmlElementRef(name = "Contact", type = Contact.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "AffiliationIDS")
    protected String affiliationIDS;
    @XmlAttribute(name = "CorrespondingAffiliationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String correspondingAffiliationID;

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
     * {@link String }
     * {@link AuthorName }
     * {@link Biography }
     * {@link Contact }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the affiliationIDS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliationIDS() {
        return affiliationIDS;
    }

    /**
     * Sets the value of the affiliationIDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliationIDS(String value) {
        this.affiliationIDS = value;
    }

    /**
     * Gets the value of the correspondingAffiliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondingAffiliationID() {
        return correspondingAffiliationID;
    }

    /**
     * Sets the value of the correspondingAffiliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondingAffiliationID(String value) {
        this.correspondingAffiliationID = value;
    }

}
