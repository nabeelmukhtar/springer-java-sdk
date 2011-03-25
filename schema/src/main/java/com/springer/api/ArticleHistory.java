
package com.springer.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}RegistrationDate" minOccurs="0"/>
 *         &lt;element ref="{}Received" minOccurs="0"/>
 *         &lt;element ref="{}Revised" minOccurs="0"/>
 *         &lt;element ref="{}Accepted" minOccurs="0"/>
 *         &lt;element ref="{}OnlineDate" minOccurs="0"/>
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
    "registrationDate",
    "received",
    "revised",
    "accepted",
    "onlineDate"
})
@XmlRootElement(name = "ArticleHistory")
public class ArticleHistory
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "RegistrationDate")
    protected RegistrationDate registrationDate;
    @XmlElement(name = "Received")
    protected Received received;
    @XmlElement(name = "Revised")
    protected Revised revised;
    @XmlElement(name = "Accepted")
    protected Accepted accepted;
    @XmlElement(name = "OnlineDate")
    protected OnlineDate onlineDate;

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationDate }
     *     
     */
    public RegistrationDate getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationDate }
     *     
     */
    public void setRegistrationDate(RegistrationDate value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the received property.
     * 
     * @return
     *     possible object is
     *     {@link Received }
     *     
     */
    public Received getReceived() {
        return received;
    }

    /**
     * Sets the value of the received property.
     * 
     * @param value
     *     allowed object is
     *     {@link Received }
     *     
     */
    public void setReceived(Received value) {
        this.received = value;
    }

    /**
     * Gets the value of the revised property.
     * 
     * @return
     *     possible object is
     *     {@link Revised }
     *     
     */
    public Revised getRevised() {
        return revised;
    }

    /**
     * Sets the value of the revised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revised }
     *     
     */
    public void setRevised(Revised value) {
        this.revised = value;
    }

    /**
     * Gets the value of the accepted property.
     * 
     * @return
     *     possible object is
     *     {@link Accepted }
     *     
     */
    public Accepted getAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accepted }
     *     
     */
    public void setAccepted(Accepted value) {
        this.accepted = value;
    }

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

}
