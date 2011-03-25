
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
 *         &lt;element ref="{}JournalInfo"/>
 *         &lt;choice>
 *           &lt;element ref="{}JournalOnlineFirst"/>
 *           &lt;element ref="{}Volume"/>
 *         &lt;/choice>
 *       &lt;/sequence>
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
    "journalInfo",
    "journalOnlineFirst",
    "volume"
})
@XmlRootElement(name = "Journal")
public class Journal
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "JournalInfo", required = true)
    protected JournalInfo journalInfo;
    @XmlElement(name = "JournalOnlineFirst")
    protected JournalOnlineFirst journalOnlineFirst;
    @XmlElement(name = "Volume")
    protected Volume volume;
    @XmlAttribute(name = "OutputMedium")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outputMedium;

    /**
     * Gets the value of the journalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JournalInfo }
     *     
     */
    public JournalInfo getJournalInfo() {
        return journalInfo;
    }

    /**
     * Sets the value of the journalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalInfo }
     *     
     */
    public void setJournalInfo(JournalInfo value) {
        this.journalInfo = value;
    }

    /**
     * Gets the value of the journalOnlineFirst property.
     * 
     * @return
     *     possible object is
     *     {@link JournalOnlineFirst }
     *     
     */
    public JournalOnlineFirst getJournalOnlineFirst() {
        return journalOnlineFirst;
    }

    /**
     * Sets the value of the journalOnlineFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalOnlineFirst }
     *     
     */
    public void setJournalOnlineFirst(JournalOnlineFirst value) {
        this.journalOnlineFirst = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Volume }
     *     
     */
    public Volume getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volume }
     *     
     */
    public void setVolume(Volume value) {
        this.volume = value;
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
