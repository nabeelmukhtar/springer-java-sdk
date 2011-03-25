
package com.springer.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}BibAuthorName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Year"/>
 *         &lt;element ref="{}ArticleTitle"/>
 *         &lt;element ref="{}JournalTitle"/>
 *         &lt;element ref="{}VolumeID"/>
 *         &lt;element ref="{}IssueID" minOccurs="0"/>
 *         &lt;element ref="{}FirstPage"/>
 *         &lt;element ref="{}LastPage"/>
 *         &lt;element ref="{}Occurrence" maxOccurs="unbounded" minOccurs="0"/>
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
    "bibAuthorName",
    "year",
    "articleTitle",
    "journalTitle",
    "volumeID",
    "issueID",
    "firstPage",
    "lastPage",
    "occurrence"
})
@XmlRootElement(name = "BibArticle")
public class BibArticle
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "BibAuthorName")
    protected List<BibAuthorName> bibAuthorName;
    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "ArticleTitle", required = true)
    protected ArticleTitle articleTitle;
    @XmlElement(name = "JournalTitle", required = true)
    protected String journalTitle;
    @XmlElement(name = "VolumeID", required = true)
    protected String volumeID;
    @XmlElement(name = "IssueID")
    protected String issueID;
    @XmlElement(name = "FirstPage", required = true)
    protected String firstPage;
    @XmlElement(name = "LastPage", required = true)
    protected String lastPage;
    @XmlElement(name = "Occurrence")
    protected List<Occurrence> occurrence;

    /**
     * Gets the value of the bibAuthorName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bibAuthorName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBibAuthorName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BibAuthorName }
     * 
     * 
     */
    public List<BibAuthorName> getBibAuthorName() {
        if (bibAuthorName == null) {
            bibAuthorName = new ArrayList<BibAuthorName>();
        }
        return this.bibAuthorName;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the articleTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleTitle }
     *     
     */
    public ArticleTitle getArticleTitle() {
        return articleTitle;
    }

    /**
     * Sets the value of the articleTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleTitle }
     *     
     */
    public void setArticleTitle(ArticleTitle value) {
        this.articleTitle = value;
    }

    /**
     * Gets the value of the journalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalTitle() {
        return journalTitle;
    }

    /**
     * Sets the value of the journalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalTitle(String value) {
        this.journalTitle = value;
    }

    /**
     * Gets the value of the volumeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeID() {
        return volumeID;
    }

    /**
     * Sets the value of the volumeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeID(String value) {
        this.volumeID = value;
    }

    /**
     * Gets the value of the issueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueID() {
        return issueID;
    }

    /**
     * Sets the value of the issueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueID(String value) {
        this.issueID = value;
    }

    /**
     * Gets the value of the firstPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPage() {
        return firstPage;
    }

    /**
     * Sets the value of the firstPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPage(String value) {
        this.firstPage = value;
    }

    /**
     * Gets the value of the lastPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPage() {
        return lastPage;
    }

    /**
     * Sets the value of the lastPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPage(String value) {
        this.lastPage = value;
    }

    /**
     * Gets the value of the occurrence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occurrence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccurrence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Occurrence }
     * 
     * 
     */
    public List<Occurrence> getOccurrence() {
        if (occurrence == null) {
            occurrence = new ArrayList<Occurrence>();
        }
        return this.occurrence;
    }

}
