
package com.springer.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2001.xmlschema.Adapter1;


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
 *         &lt;element ref="{}Caption"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}File"/>
 *           &lt;element ref="{}FullText"/>
 *           &lt;element ref="{}Location"/>
 *         &lt;/choice>
 *         &lt;element ref="{}Table" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}ArticleTitle"/>
 *           &lt;element ref="{}Authors"/>
 *           &lt;element ref="{}DOI"/>
 *           &lt;element ref="{}Institutions"/>
 *           &lt;element ref="{}IssueId"/>
 *           &lt;element ref="{}JournalId"/>
 *           &lt;element ref="{}PubDate"/>
 *           &lt;element ref="{}SourceTitle"/>
 *           &lt;element ref="{}SourceType"/>
 *           &lt;element ref="{}VolumeId"/>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}ChapterId"/>
 *           &lt;element ref="{}BookTitleId"/>
 *           &lt;element ref="{}BookDOI"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}ISXN"/>
 *         &lt;element ref="{}SubjectCollection"/>
 *         &lt;element ref="{}Subjects"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}CopyrightHolder"/>
 *           &lt;element ref="{}Keywords"/>
 *           &lt;element ref="{}OpenAccess"/>
 *         &lt;/choice>
 *         &lt;element ref="{}ImageType"/>
 *         &lt;element ref="{}ArticleURI" minOccurs="0"/>
 *         &lt;element ref="{}Provider"/>
 *         &lt;element ref="{}DateLoaded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caption",
    "fileOrFullTextOrLocation",
    "table",
    "articleTitleOrAuthorsOrDOI",
    "chapterId",
    "bookTitleId",
    "bookDOI",
    "isxn",
    "subjectCollection",
    "subjects",
    "copyrightHolderOrKeywordsOrOpenAccess",
    "imageType",
    "articleURI",
    "provider",
    "dateLoaded"
})
@XmlRootElement(name = "Image")
public class Image
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Caption", required = true)
    protected Caption caption;
    @XmlElements({
        @XmlElement(name = "Location", type = String.class),
        @XmlElement(name = "File", type = File.class),
        @XmlElement(name = "FullText", type = FullText.class)
    })
    protected List<Serializable> fileOrFullTextOrLocation;
    @XmlElement(name = "Table")
    protected Table table;
    @XmlElementRefs({
        @XmlElementRef(name = "JournalId", type = JAXBElement.class),
        @XmlElementRef(name = "DOI", type = JAXBElement.class),
        @XmlElementRef(name = "VolumeId", type = JAXBElement.class),
        @XmlElementRef(name = "PubDate", type = JAXBElement.class),
        @XmlElementRef(name = "Authors", type = Authors.class),
        @XmlElementRef(name = "ArticleTitle", type = ArticleTitle.class),
        @XmlElementRef(name = "Institutions", type = Institutions.class),
        @XmlElementRef(name = "SourceTitle", type = JAXBElement.class),
        @XmlElementRef(name = "SourceType", type = JAXBElement.class),
        @XmlElementRef(name = "IssueId", type = JAXBElement.class)
    })
    protected List<Serializable> articleTitleOrAuthorsOrDOI;
    @XmlElement(name = "ChapterId", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long chapterId;
    @XmlElement(name = "BookTitleId", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long bookTitleId;
    @XmlElement(name = "BookDOI")
    protected String bookDOI;
    @XmlElement(name = "ISXN", required = true)
    protected ISXN isxn;
    @XmlElement(name = "SubjectCollection", required = true)
    protected String subjectCollection;
    @XmlElement(name = "Subjects", required = true)
    protected Subjects subjects;
    @XmlElements({
        @XmlElement(name = "CopyrightHolder", type = String.class),
        @XmlElement(name = "Keywords", type = Keywords.class),
        @XmlElement(name = "OpenAccess", type = Boolean.class)
    })
    protected List<Serializable> copyrightHolderOrKeywordsOrOpenAccess;
    @XmlElement(name = "ImageType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imageType;
    @XmlElement(name = "ArticleURI")
    protected String articleURI;
    @XmlElement(name = "Provider", required = true)
    protected String provider;
    @XmlElement(name = "DateLoaded")
    protected XMLGregorianCalendar dateLoaded;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the fileOrFullTextOrLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileOrFullTextOrLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileOrFullTextOrLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link File }
     * {@link FullText }
     * 
     * 
     */
    public List<Serializable> getFileOrFullTextOrLocation() {
        if (fileOrFullTextOrLocation == null) {
            fileOrFullTextOrLocation = new ArrayList<Serializable>();
        }
        return this.fileOrFullTextOrLocation;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link Table }
     *     
     */
    public Table getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link Table }
     *     
     */
    public void setTable(Table value) {
        this.table = value;
    }

    /**
     * Gets the value of the articleTitleOrAuthorsOrDOI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articleTitleOrAuthorsOrDOI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticleTitleOrAuthorsOrDOI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Authors }
     * {@link ArticleTitle }
     * {@link Institutions }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Serializable> getArticleTitleOrAuthorsOrDOI() {
        if (articleTitleOrAuthorsOrDOI == null) {
            articleTitleOrAuthorsOrDOI = new ArrayList<Serializable>();
        }
        return this.articleTitleOrAuthorsOrDOI;
    }

    /**
     * Gets the value of the chapterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getChapterId() {
        return chapterId;
    }

    /**
     * Sets the value of the chapterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapterId(Long value) {
        this.chapterId = value;
    }

    /**
     * Gets the value of the bookTitleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getBookTitleId() {
        return bookTitleId;
    }

    /**
     * Sets the value of the bookTitleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookTitleId(Long value) {
        this.bookTitleId = value;
    }

    /**
     * Gets the value of the bookDOI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookDOI() {
        return bookDOI;
    }

    /**
     * Sets the value of the bookDOI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookDOI(String value) {
        this.bookDOI = value;
    }

    /**
     * Gets the value of the isxn property.
     * 
     * @return
     *     possible object is
     *     {@link ISXN }
     *     
     */
    public ISXN getISXN() {
        return isxn;
    }

    /**
     * Sets the value of the isxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISXN }
     *     
     */
    public void setISXN(ISXN value) {
        this.isxn = value;
    }

    /**
     * Gets the value of the subjectCollection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectCollection() {
        return subjectCollection;
    }

    /**
     * Sets the value of the subjectCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectCollection(String value) {
        this.subjectCollection = value;
    }

    /**
     * Gets the value of the subjects property.
     * 
     * @return
     *     possible object is
     *     {@link Subjects }
     *     
     */
    public Subjects getSubjects() {
        return subjects;
    }

    /**
     * Sets the value of the subjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subjects }
     *     
     */
    public void setSubjects(Subjects value) {
        this.subjects = value;
    }

    /**
     * Gets the value of the copyrightHolderOrKeywordsOrOpenAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyrightHolderOrKeywordsOrOpenAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyrightHolderOrKeywordsOrOpenAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link Keywords }
     * {@link Boolean }
     * 
     * 
     */
    public List<Serializable> getCopyrightHolderOrKeywordsOrOpenAccess() {
        if (copyrightHolderOrKeywordsOrOpenAccess == null) {
            copyrightHolderOrKeywordsOrOpenAccess = new ArrayList<Serializable>();
        }
        return this.copyrightHolderOrKeywordsOrOpenAccess;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageType(String value) {
        this.imageType = value;
    }

    /**
     * Gets the value of the articleURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleURI() {
        return articleURI;
    }

    /**
     * Sets the value of the articleURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleURI(String value) {
        this.articleURI = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
