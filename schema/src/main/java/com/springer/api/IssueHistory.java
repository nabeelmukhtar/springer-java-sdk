
package com.springer.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element ref="{}OnlineDate" minOccurs="0"/>
 *         &lt;element ref="{}PrintDate"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}CoverDate"/>
 *           &lt;element ref="{}PricelistYear"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "onlineDate",
    "printDate",
    "coverDate",
    "pricelistYear"
})
@XmlRootElement(name = "IssueHistory")
public class IssueHistory
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "OnlineDate")
    protected OnlineDate onlineDate;
    @XmlElement(name = "PrintDate", required = true)
    protected PrintDate printDate;
    @XmlElement(name = "CoverDate")
    protected CoverDate coverDate;
    @XmlElement(name = "PricelistYear", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long pricelistYear;

    /**
     * Gets the value of the onlineDate property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineDate }
     *     
     */
    public OnlineDate getOnlineDate() {
        return onlineDate;
    }

    /**
     * Sets the value of the onlineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineDate }
     *     
     */
    public void setOnlineDate(OnlineDate value) {
        this.onlineDate = value;
    }

    /**
     * Gets the value of the printDate property.
     * 
     * @return
     *     possible object is
     *     {@link PrintDate }
     *     
     */
    public PrintDate getPrintDate() {
        return printDate;
    }

    /**
     * Sets the value of the printDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintDate }
     *     
     */
    public void setPrintDate(PrintDate value) {
        this.printDate = value;
    }

    /**
     * Gets the value of the coverDate property.
     * 
     * @return
     *     possible object is
     *     {@link CoverDate }
     *     
     */
    public CoverDate getCoverDate() {
        return coverDate;
    }

    /**
     * Sets the value of the coverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverDate }
     *     
     */
    public void setCoverDate(CoverDate value) {
        this.coverDate = value;
    }

    /**
     * Gets the value of the pricelistYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPricelistYear() {
        return pricelistYear;
    }

    /**
     * Sets the value of the pricelistYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricelistYear(Long value) {
        this.pricelistYear = value;
    }

}
