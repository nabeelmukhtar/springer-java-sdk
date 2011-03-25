
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
 *         &lt;element ref="{}VolumeIDStart"/>
 *         &lt;element ref="{}VolumeIDEnd"/>
 *         &lt;element ref="{}VolumeIssueCount"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TocLevels" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="VolumeType" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "volumeIDStart",
    "volumeIDEnd",
    "volumeIssueCount"
})
@XmlRootElement(name = "VolumeInfo")
public class VolumeInfo
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "VolumeIDStart", required = true)
    protected String volumeIDStart;
    @XmlElement(name = "VolumeIDEnd", required = true)
    protected String volumeIDEnd;
    @XmlElement(name = "VolumeIssueCount", required = true)
    protected String volumeIssueCount;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long tocLevels;
    @XmlAttribute(name = "VolumeType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String volumeType;

    /**
     * Gets the value of the volumeIDStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeIDStart() {
        return volumeIDStart;
    }

    /**
     * Sets the value of the volumeIDStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeIDStart(String value) {
        this.volumeIDStart = value;
    }

    /**
     * Gets the value of the volumeIDEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeIDEnd() {
        return volumeIDEnd;
    }

    /**
     * Sets the value of the volumeIDEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeIDEnd(String value) {
        this.volumeIDEnd = value;
    }

    /**
     * Gets the value of the volumeIssueCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeIssueCount() {
        return volumeIssueCount;
    }

    /**
     * Sets the value of the volumeIssueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeIssueCount(String value) {
        this.volumeIssueCount = value;
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

    /**
     * Gets the value of the volumeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeType() {
        return volumeType;
    }

    /**
     * Sets the value of the volumeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeType(String value) {
        this.volumeType = value;
    }

}
