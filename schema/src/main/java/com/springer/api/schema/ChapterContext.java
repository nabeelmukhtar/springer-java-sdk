
package com.springer.api.schema;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}SeriesID">
 *       &lt;sequence>
 *         &lt;element ref="{}BookID"/>
 *         &lt;element ref="{}BookTitle"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ChapterContext
    extends SeriesID
{


    /**
     * Gets the value of the bookID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBookID();

    /**
     * Sets the value of the bookID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBookID(String value);

    /**
     * Gets the value of the bookTitle property.
     * 
     * @return
     *     possible object is
     *     {@link BookTitle }
     *     
     */
    BookTitle getBookTitle();

    /**
     * Sets the value of the bookTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTitle }
     *     
     */
    void setBookTitle(BookTitle value);

}
