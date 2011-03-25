
package com.springer.api;

import java.io.Serializable;
import java.math.BigDecimal;
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
 *         &lt;element ref="{}CitationNumber"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}BibArticle"/>
 *           &lt;element ref="{}BibBook"/>
 *           &lt;element ref="{}BibChapter"/>
 *         &lt;/choice>
 *         &lt;element ref="{}BibUnstructured" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "citationNumber",
    "bibArticle",
    "bibBook",
    "bibChapter",
    "bibUnstructured"
})
@XmlRootElement(name = "Citation")
public class Citation
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CitationNumber", required = true)
    protected BigDecimal citationNumber;
    @XmlElement(name = "BibArticle")
    protected BibArticle bibArticle;
    @XmlElement(name = "BibBook")
    protected BibBook bibBook;
    @XmlElement(name = "BibChapter")
    protected BibChapter bibChapter;
    @XmlElement(name = "BibUnstructured")
    protected BibUnstructured bibUnstructured;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the value of the citationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCitationNumber() {
        return citationNumber;
    }

    /**
     * Sets the value of the citationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCitationNumber(BigDecimal value) {
        this.citationNumber = value;
    }

    /**
     * Gets the value of the bibArticle property.
     * 
     * @return
     *     possible object is
     *     {@link BibArticle }
     *     
     */
    public BibArticle getBibArticle() {
        return bibArticle;
    }

    /**
     * Sets the value of the bibArticle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibArticle }
     *     
     */
    public void setBibArticle(BibArticle value) {
        this.bibArticle = value;
    }

    /**
     * Gets the value of the bibBook property.
     * 
     * @return
     *     possible object is
     *     {@link BibBook }
     *     
     */
    public BibBook getBibBook() {
        return bibBook;
    }

    /**
     * Sets the value of the bibBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibBook }
     *     
     */
    public void setBibBook(BibBook value) {
        this.bibBook = value;
    }

    /**
     * Gets the value of the bibChapter property.
     * 
     * @return
     *     possible object is
     *     {@link BibChapter }
     *     
     */
    public BibChapter getBibChapter() {
        return bibChapter;
    }

    /**
     * Sets the value of the bibChapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibChapter }
     *     
     */
    public void setBibChapter(BibChapter value) {
        this.bibChapter = value;
    }

    /**
     * Gets the value of the bibUnstructured property.
     * 
     * @return
     *     possible object is
     *     {@link BibUnstructured }
     *     
     */
    public BibUnstructured getBibUnstructured() {
        return bibUnstructured;
    }

    /**
     * Sets the value of the bibUnstructured property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibUnstructured }
     *     
     */
    public void setBibUnstructured(BibUnstructured value) {
        this.bibUnstructured = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
