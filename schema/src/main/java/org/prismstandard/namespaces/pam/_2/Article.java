
package org.prismstandard.namespaces.pam._2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.prismstandard.namespaces.basic._2.Number;
import org.prismstandard.namespaces.basic._2.Volume;


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
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}identifier"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}creator" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}publicationName"/>
 *         &lt;choice>
 *           &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}isbn"/>
 *           &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}issn"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}doi"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}publisher"/>
 *         &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}publicationDate"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}volume"/>
 *           &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}number"/>
 *           &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}startingPage"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}url"/>
 *         &lt;element ref="{http://prismstandard.org/namespaces/basic/2.0/}copyright"/>
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
    "identifier",
    "title",
    "creator",
    "publicationName",
    "isbn",
    "issn",
    "doi",
    "publisher",
    "publicationDate",
    "volume",
    "number",
    "startingPage",
    "url",
    "copyright"
})
@XmlRootElement(name = "article")
public class Article
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String identifier;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String title;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected List<String> creator;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    protected String publicationName;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isbn;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issn;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    protected String doi;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String publisher;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String publicationDate;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/")
    protected Volume volume;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/")
    protected Number number;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String startingPage;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    protected String url;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    protected String copyright;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCreator() {
        if (creator == null) {
            creator = new ArrayList<String>();
        }
        return this.creator;
    }

    /**
     * Gets the value of the publicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationName() {
        return publicationName;
    }

    /**
     * Sets the value of the publicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationName(String value) {
        this.publicationName = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the issn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssn() {
        return issn;
    }

    /**
     * Sets the value of the issn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssn(String value) {
        this.issn = value;
    }

    /**
     * Gets the value of the doi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoi() {
        return doi;
    }

    /**
     * Sets the value of the doi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoi(String value) {
        this.doi = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationDate(String value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Volume }
     *     
     */
    public Volume getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volume }
     *     
     */
    public void setVolume(Volume value) {
        this.volume = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Number }
     *     
     */
    public Number getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number }
     *     
     */
    public void setNumber(Number value) {
        this.number = value;
    }

    /**
     * Gets the value of the startingPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingPage() {
        return startingPage;
    }

    /**
     * Sets the value of the startingPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingPage(String value) {
        this.startingPage = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

}
