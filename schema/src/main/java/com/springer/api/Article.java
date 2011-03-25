
package com.springer.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}ArticleInfo"/>
 *         &lt;element ref="{}ArticleHeader"/>
 *         &lt;element ref="{}Body" minOccurs="0"/>
 *         &lt;element ref="{}BodyRef" maxOccurs="unbounded"/>
 *         &lt;element ref="{}ArticleBackmatter"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="OutputMedium" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "articleInfo",
    "articleHeader",
    "body",
    "bodyRef",
    "articleBackmatter"
})
@XmlRootElement(name = "Article")
public class Article
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ArticleInfo", required = true)
    protected ArticleInfo articleInfo;
    @XmlElement(name = "ArticleHeader", required = true)
    protected ArticleHeader articleHeader;
    @XmlElement(name = "Body")
    protected Body body;
    @XmlElement(name = "BodyRef", required = true)
    protected List<BodyRef> bodyRef;
    @XmlElement(name = "ArticleBackmatter", required = true)
    protected ArticleBackmatter articleBackmatter;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    /**
     * Gets the value of the articleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleInfo }
     *     
     */
    public ArticleInfo getArticleInfo() {
        return articleInfo;
    }

    /**
     * Sets the value of the articleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleInfo }
     *     
     */
    public void setArticleInfo(ArticleInfo value) {
        this.articleInfo = value;
    }

    /**
     * Gets the value of the articleHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleHeader }
     *     
     */
    public ArticleHeader getArticleHeader() {
        return articleHeader;
    }

    /**
     * Sets the value of the articleHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleHeader }
     *     
     */
    public void setArticleHeader(ArticleHeader value) {
        this.articleHeader = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Body }
     *     
     */
    public Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Body }
     *     
     */
    public void setBody(Body value) {
        this.body = value;
    }

    /**
     * Gets the value of the bodyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BodyRef }
     * 
     * 
     */
    public List<BodyRef> getBodyRef() {
        if (bodyRef == null) {
            bodyRef = new ArrayList<BodyRef>();
        }
        return this.bodyRef;
    }

    /**
     * Gets the value of the articleBackmatter property.
     * 
     * @return
     *     possible object is
     *     {@link ArticleBackmatter }
     *     
     */
    public ArticleBackmatter getArticleBackmatter() {
        return articleBackmatter;
    }

    /**
     * Sets the value of the articleBackmatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticleBackmatter }
     *     
     */
    public void setArticleBackmatter(ArticleBackmatter value) {
        this.articleBackmatter = value;
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

    /**
     * Gets the value of the outputMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputMedium() {
        return outputMedium;
    }

    /**
     * Sets the value of the outputMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

}
