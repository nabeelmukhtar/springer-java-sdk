
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
 *         &lt;element ref="{}IssueIDStart"/>
 *         &lt;element ref="{}IssueIDEnd"/>
 *         &lt;element ref="{}IssueArticleCount"/>
 *         &lt;element ref="{}IssueHistory"/>
 *         &lt;element ref="{}IssueCopyright"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IssueType" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
    "issueIDStart",
    "issueIDEnd",
    "issueArticleCount",
    "issueHistory",
    "issueCopyright"
})
@XmlRootElement(name = "IssueInfo")
public class IssueInfo
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "IssueIDStart", required = true)
    protected String issueIDStart;
    @XmlElement(name = "IssueIDEnd", required = true)
    protected String issueIDEnd;
    @XmlElement(name = "IssueArticleCount", required = true)
    protected String issueArticleCount;
    @XmlElement(name = "IssueHistory", required = true)
    protected IssueHistory issueHistory;
    @XmlElement(name = "IssueCopyright", required = true)
    protected IssueCopyright issueCopyright;
    @XmlAttribute(name = "IssueType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String issueType;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long tocLevels;

    /**
     * Gets the value of the issueIDStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueIDStart() {
        return issueIDStart;
    }

    /**
     * Sets the value of the issueIDStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueIDStart(String value) {
        this.issueIDStart = value;
    }

    /**
     * Gets the value of the issueIDEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueIDEnd() {
        return issueIDEnd;
    }

    /**
     * Sets the value of the issueIDEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueIDEnd(String value) {
        this.issueIDEnd = value;
    }

    /**
     * Gets the value of the issueArticleCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueArticleCount() {
        return issueArticleCount;
    }

    /**
     * Sets the value of the issueArticleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueArticleCount(String value) {
        this.issueArticleCount = value;
    }

    /**
     * Gets the value of the issueHistory property.
     * 
     * @return
     *     possible object is
     *     {@link IssueHistory }
     *     
     */
    public IssueHistory getIssueHistory() {
        return issueHistory;
    }

    /**
     * Sets the value of the issueHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueHistory }
     *     
     */
    public void setIssueHistory(IssueHistory value) {
        this.issueHistory = value;
    }

    /**
     * Gets the value of the issueCopyright property.
     * 
     * @return
     *     possible object is
     *     {@link IssueCopyright }
     *     
     */
    public IssueCopyright getIssueCopyright() {
        return issueCopyright;
    }

    /**
     * Sets the value of the issueCopyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueCopyright }
     *     
     */
    public void setIssueCopyright(IssueCopyright value) {
        this.issueCopyright = value;
    }

    /**
     * Gets the value of the issueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueType() {
        return issueType;
    }

    /**
     * Sets the value of the issueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueType(String value) {
        this.issueType = value;
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
