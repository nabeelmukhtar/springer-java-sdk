
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
 *         &lt;element ref="{}ChapterInfo"/>
 *         &lt;element ref="{}ChapterHeader"/>
 *         &lt;element ref="{}BodyRef"/>
 *         &lt;element ref="{}ChapterBackmatter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Language" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Chapter {


    /**
     * Gets the value of the chapterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterInfo }
     *     
     */
    ChapterInfo getChapterInfo();

    /**
     * Sets the value of the chapterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterInfo }
     *     
     */
    void setChapterInfo(ChapterInfo value);

    /**
     * Gets the value of the chapterHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterHeader }
     *     
     */
    ChapterHeader getChapterHeader();

    /**
     * Sets the value of the chapterHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterHeader }
     *     
     */
    void setChapterHeader(ChapterHeader value);

    /**
     * Gets the value of the bodyRef property.
     * 
     * @return
     *     possible object is
     *     {@link BodyRef }
     *     
     */
    BodyRef getBodyRef();

    /**
     * Sets the value of the bodyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyRef }
     *     
     */
    void setBodyRef(BodyRef value);

    /**
     * Gets the value of the chapterBackmatter property.
     * 
     * @return
     *     possible object is
     *     {@link ChapterBackmatter }
     *     
     */
    ChapterBackmatter getChapterBackmatter();

    /**
     * Sets the value of the chapterBackmatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChapterBackmatter }
     *     
     */
    void setChapterBackmatter(ChapterBackmatter value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getID();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setID(String value);

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLanguage();

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLanguage(String value);

}