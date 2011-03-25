
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
 *         &lt;element ref="{}ArticleID"/>
 *         &lt;element ref="{}ArticleDOI"/>
 *         &lt;element ref="{}ArticleSequenceNumber"/>
 *         &lt;element ref="{}ArticleTitle"/>
 *         &lt;element ref="{}ArticleSubTitle" minOccurs="0"/>
 *         &lt;element ref="{}ArticleCategory" minOccurs="0"/>
 *         &lt;element ref="{}ArticleFirstPage"/>
 *         &lt;element ref="{}ArticleLastPage"/>
 *         &lt;element ref="{}ArticleHistory"/>
 *         &lt;element ref="{}ArticleEditorialResponsibility" minOccurs="0"/>
 *         &lt;element ref="{}ArticleCopyright"/>
 *         &lt;element ref="{}ArticleGrants"/>
 *         &lt;element ref="{}ArticleContext" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ArticleCitation" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ArticleType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ContainsESM" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="NumberingStyle" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="TocLevels" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "articleID",
    "articleDOI",
    "articleSequenceNumber",
    "articleTitle",
    "articleSubTitle",
    "articleCategory",
    "articleFirstPage",
    "articleLastPage",
    "articleHistory",
    "articleEditorialResponsibility",
    "articleCopyright",
    "articleGrants",
    "articleContext"
})
@XmlRootElement(name = "ArticleInfo")
public class ArticleInfo
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ArticleID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleID;
    @XmlElement(name = "ArticleDOI", required = true)
    protected String articleDOI;
    @XmlElement(name = "ArticleSequenceNumber", required = true)
    protected String articleSequenceNumber;
    @XmlElement(name = "ArticleTitle", required = true)
    protected ArticleTitle articleTitle;
    @XmlElement(name = "ArticleSubTitle")
    protected ArticleSubTitle articleSubTitle;
    @XmlElement(name = "ArticleCategory")
    protected String articleCategory;
    @XmlElement(name = "ArticleFirstPage", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleFirstPage;
    @XmlElement(name = "ArticleLastPage", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleLastPage;
    @XmlElement(name = "ArticleHistory", required = true)
    protected ArticleHistory articleHistory;
    @XmlElement(name = "ArticleEditorialResponsibility")
    protected ArticleEditorialResponsibility articleEditorialResponsibility;
    @XmlElement(name = "ArticleCopyright", required = true)
    protected ArticleCopyright articleCopyright;
    @XmlElement(name = "ArticleGrants", required = true)
    protected ArticleGrants articleGrants;
    @XmlElement(name = "ArticleContext")
    protected ArticleContext articleContext;
    @XmlAttribute(name = "ArticleCitation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleCitation;
    @XmlAttribute(name = "ArticleType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleType;
    @XmlAttribute(name = "ContainsESM", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String containsESM;
    @XmlAttribute(name = "Language", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "NumberingStyle", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberingStyle;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long tocLevels;

    /**
     * Gets the value of the articleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleID() {
        return articleID;
    }

    /**
     * Sets the value of the articleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleID(String value) {
        this.articleID = value;
    }

    /**
     * Gets the value of the articleDOI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleDOI() {
        return articleDOI;
    }

    /**
     * Sets the value of the articleDOI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleDOI(String value) {
        this.articleDOI = value;
    }

    /**
     * Gets the value of the articleSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleSequenceNumber() {
        return articleSequenceNumber;
    }

    /**
     * Sets the value of the articleSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleSequenceNumber(String value) {
        this.articleSequenceNumber = value;
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
     * Gets the value of the articleSubTitle property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleSubTitle }
     *     
     */
    public ArticleSubTitle getArticleSubTitle() {
        return articleSubTitle;
    }

    /**
     * Sets the value of the articleSubTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleSubTitle }
     *     
     */
    public void setArticleSubTitle(ArticleSubTitle value) {
        this.articleSubTitle = value;
    }

    /**
     * Gets the value of the articleCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleCategory() {
        return articleCategory;
    }

    /**
     * Sets the value of the articleCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleCategory(String value) {
        this.articleCategory = value;
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
     * Gets the value of the articleLastPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleLastPage() {
        return articleLastPage;
    }

    /**
     * Sets the value of the articleLastPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleLastPage(String value) {
        this.articleLastPage = value;
    }

    /**
     * Gets the value of the articleHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleHistory }
     *     
     */
    public ArticleHistory getArticleHistory() {
        return articleHistory;
    }

    /**
     * Sets the value of the articleHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleHistory }
     *     
     */
    public void setArticleHistory(ArticleHistory value) {
        this.articleHistory = value;
    }

    /**
     * Gets the value of the articleEditorialResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleEditorialResponsibility }
     *     
     */
    public ArticleEditorialResponsibility getArticleEditorialResponsibility() {
        return articleEditorialResponsibility;
    }

    /**
     * Sets the value of the articleEditorialResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleEditorialResponsibility }
     *     
     */
    public void setArticleEditorialResponsibility(ArticleEditorialResponsibility value) {
        this.articleEditorialResponsibility = value;
    }

    /**
     * Gets the value of the articleCopyright property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleCopyright }
     *     
     */
    public ArticleCopyright getArticleCopyright() {
        return articleCopyright;
    }

    /**
     * Sets the value of the articleCopyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleCopyright }
     *     
     */
    public void setArticleCopyright(ArticleCopyright value) {
        this.articleCopyright = value;
    }

    /**
     * Gets the value of the articleGrants property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleGrants }
     *     
     */
    public ArticleGrants getArticleGrants() {
        return articleGrants;
    }

    /**
     * Sets the value of the articleGrants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleGrants }
     *     
     */
    public void setArticleGrants(ArticleGrants value) {
        this.articleGrants = value;
    }

    /**
     * Gets the value of the articleContext property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleContext }
     *     
     */
    public ArticleContext getArticleContext() {
        return articleContext;
    }

    /**
     * Sets the value of the articleContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleContext }
     *     
     */
    public void setArticleContext(ArticleContext value) {
        this.articleContext = value;
    }

    /**
     * Gets the value of the articleCitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleCitation() {
        return articleCitation;
    }

    /**
     * Sets the value of the articleCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleCitation(String value) {
        this.articleCitation = value;
    }

    /**
     * Gets the value of the articleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleType() {
        return articleType;
    }

    /**
     * Sets the value of the articleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleType(String value) {
        this.articleType = value;
    }

    /**
     * Gets the value of the containsESM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainsESM() {
        return containsESM;
    }

    /**
     * Sets the value of the containsESM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainsESM(String value) {
        this.containsESM = value;
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
     * Gets the value of the numberingStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberingStyle() {
        return numberingStyle;
    }

    /**
     * Sets the value of the numberingStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberingStyle(String value) {
        this.numberingStyle = value;
    }

    /**
     * Gets the value of the tocLevels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getTocLevels() {
        return tocLevels;
    }

    /**
     * Sets the value of the tocLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

}
