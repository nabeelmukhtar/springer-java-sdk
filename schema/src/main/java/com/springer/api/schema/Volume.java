
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
 *         &lt;element ref="{}VolumeInfo"/>
 *         &lt;element ref="{}Issue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="OutputMedium" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Volume {


    /**
     * Gets the value of the volumeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeInfo }
     *     
     */
    VolumeInfo getVolumeInfo();

    /**
     * Sets the value of the volumeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeInfo }
     *     
     */
    void setVolumeInfo(VolumeInfo value);

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link Issue }
     *     
     */
    Issue getIssue();

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Issue }
     *     
     */
    void setIssue(Issue value);

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
