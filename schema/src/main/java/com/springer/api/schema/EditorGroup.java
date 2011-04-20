
package com.springer.api.schema;



/**
 * <p>Java class for EditorGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditorGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}EditorGroupElement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface EditorGroup {


    /**
     * Gets the value of the editorGroupElement property.
     * 
     * @return
     *     possible object is
     *     {@link EditorGroupElement }
     *     
     */
    EditorGroupElement getEditorGroupElement();

    /**
     * Sets the value of the editorGroupElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditorGroupElement }
     *     
     */
    void setEditorGroupElement(EditorGroupElement value);

}
