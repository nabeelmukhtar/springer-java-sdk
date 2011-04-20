
package com.springer.api.schema;



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
 *         &lt;element ref="{}IssueInfo"/>
 *         &lt;element ref="{}IssueHeader" minOccurs="0"/>
 *         &lt;element ref="{}Article"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IssueType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OutputMedium" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Issue {


    /**
     * Gets the value of the issueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IssueInfo }
     *     
     */
    IssueInfo getIssueInfo();

    /**
     * Sets the value of the issueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueInfo }
     *     
     */
    void setIssueInfo(IssueInfo value);

    /**
     * Gets the value of the issueHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EditorGroup }
     *     
     */
    EditorGroup getIssueHeader();

    /**
     * Sets the value of the issueHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditorGroup }
     *     
     */
    void setIssueHeader(EditorGroup value);

    /**
     * Gets the value of the article property.
     * 
     * @return
     *     possible object is
     *     {@link Article }
     *     
     */
    Article getArticle();

    /**
     * Sets the value of the article property.
     * 
     * @param value
     *     allowed object is
     *     {@link Article }
     *     
     */
    void setArticle(Article value);

    /**
     * Gets the value of the issueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIssueType();

    /**
     * Sets the value of the issueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIssueType(String value);

    /**
     * Gets the value of the outputMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getOutputMedium();

    /**
     * Sets the value of the outputMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setOutputMedium(String value);

}
