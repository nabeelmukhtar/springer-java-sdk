
package com.springer.api.schema;

import java.util.List;


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
 *         &lt;element ref="{}BookSubject" maxOccurs="unbounded"/>
 *         &lt;element ref="{}SubjectCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface BookSubjectGroup {


    /**
     * Gets the value of the bookSubjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookSubjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookSubjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookSubject }
     * 
     * 
     */
    List<BookSubject> getBookSubjects();

    /**
     * Gets the value of the subjectCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectCollection }
     *     
     */
    SubjectCollection getSubjectCollection();

    /**
     * Sets the value of the subjectCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectCollection }
     *     
     */
    void setSubjectCollection(SubjectCollection value);

}