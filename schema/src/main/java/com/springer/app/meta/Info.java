
package com.springer.app.meta;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.springer.com/app/meta}DateLoaded" minOccurs="0"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Authors"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Institutions"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Date"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Type"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}DOI"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Title"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}ISXN"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.springer.com/app/meta}Journal"/>
 *           &lt;element ref="{http://www.springer.com/app/meta}PubName"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.springer.com/app/meta}ArticleFirstPage" minOccurs="0"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}Publication"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}PublicationType"/>
 *         &lt;element ref="{http://www.springer.com/app/meta}SubjectGroup"/>
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
    "dateLoaded",
    "authors",
    "institutions",
    "date",
    "type",
    "doi",
    "title",
    "isxn",
    "journalOrPubName",
    "articleFirstPage",
    "publication",
    "publicationType",
    "subjectGroup"
})
@XmlRootElement(name = "Info")
public class Info
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "DateLoaded")
    protected XMLGregorianCalendar dateLoaded;
    @XmlElement(name = "Authors", required = true)
    protected Authors authors;
    @XmlElement(name = "Institutions", required = true)
    protected Institutions institutions;
    @XmlElement(name = "Date", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String date;
    @XmlElement(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlElement(name = "DOI", required = true)
    protected String doi;
    @XmlElement(name = "Title", required = true)
    protected Title title;
    @XmlElement(name = "ISXN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isxn;
    @XmlElementRefs({
        @XmlElementRef(name = "PubName", namespace = "http://www.springer.com/app/meta", type = JAXBElement.class),
        @XmlElementRef(name = "Journal", namespace = "http://www.springer.com/app/meta", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> journalOrPubName;
    @XmlElement(name = "ArticleFirstPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleFirstPage;
    @XmlElement(name = "Publication", required = true)
    protected String publication;
    @XmlElement(name = "PublicationType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String publicationType;
    @XmlElement(name = "SubjectGroup", required = true)
    protected SubjectGroup subjectGroup;

    /**
     * Gets the value of the dateLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLoaded() {
        return dateLoaded;
    }

    /**
     * Sets the value of the dateLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLoaded(XMLGregorianCalendar value) {
        this.dateLoaded = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link Authors }
     *     
     */
    public Authors getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authors }
     *     
     */
    public void setAuthors(Authors value) {
        this.authors = value;
    }

    /**
     * Gets the value of the institutions property.
     * 
     * @return
     *     possible object is
     *     {@link Institutions }
     *     
     */
    public Institutions getInstitutions() {
        return institutions;
    }

    /**
     * Sets the value of the institutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Institutions }
     *     
     */
    public void setInstitutions(Institutions value) {
        this.institutions = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
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

    /**
     * Gets the value of the doi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOI() {
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
    public void setDOI(String value) {
        this.doi = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the isxn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISXN() {
        return isxn;
    }

    /**
     * Sets the value of the isxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISXN(String value) {
        this.isxn = value;
    }

    /**
     * Gets the value of the journalOrPubName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalOrPubName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalOrPubName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getJournalOrPubName() {
        if (journalOrPubName == null) {
            journalOrPubName = new ArrayList<JAXBElement<String>>();
        }
        return this.journalOrPubName;
    }

    /**
     * Gets the value of the articleFirstPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleFirstPage() {
        return articleFirstPage;
    }

    /**
     * Sets the value of the articleFirstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleFirstPage(String value) {
        this.articleFirstPage = value;
    }

    /**
     * Gets the value of the publication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublication() {
        return publication;
    }

    /**
     * Sets the value of the publication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublication(String value) {
        this.publication = value;
    }

    /**
     * Gets the value of the publicationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationType() {
        return publicationType;
    }

    /**
     * Sets the value of the publicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationType(String value) {
        this.publicationType = value;
    }

    /**
     * Gets the value of the subjectGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectGroup }
     *     
     */
    public SubjectGroup getSubjectGroup() {
        return subjectGroup;
    }

    /**
     * Sets the value of the subjectGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectGroup }
     *     
     */
    public void setSubjectGroup(SubjectGroup value) {
        this.subjectGroup = value;
    }

}
