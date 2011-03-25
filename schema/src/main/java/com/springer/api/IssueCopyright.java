
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
 *         &lt;element ref="{}CopyrightHolderName"/>
 *         &lt;element ref="{}CopyrightYear"/>
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
    "copyrightHolderName",
    "copyrightYear"
})
@XmlRootElement(name = "IssueCopyright")
public class IssueCopyright
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CopyrightHolderName", required = true)
    protected String copyrightHolderName;
    @XmlElement(name = "CopyrightYear", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long copyrightYear;

    /**
     * Gets the value of the copyrightHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightHolderName() {
        return copyrightHolderName;
    }

    /**
     * Sets the value of the copyrightHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightHolderName(String value) {
        this.copyrightHolderName = value;
    }

    /**
     * Gets the value of the copyrightYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCopyrightYear() {
        return copyrightYear;
    }

    /**
     * Sets the value of the copyrightYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightYear(Long value) {
        this.copyrightYear = value;
    }

}
