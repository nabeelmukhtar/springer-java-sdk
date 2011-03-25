
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
 *         &lt;element ref="{}SimplePara" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="align" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="colname" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="morerows" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="nameend" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="namest" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "simplePara"
})
@XmlRootElement(name = "entry")
public class Entry
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SimplePara")
    protected SimplePara simplePara;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String align;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colname;
    @XmlAttribute
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long morerows;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameend;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String namest;

    /**
     * Gets the value of the simplePara property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePara }
     *     
     */
    public SimplePara getSimplePara() {
        return simplePara;
    }

    /**
     * Sets the value of the simplePara property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePara }
     *     
     */
    public void setSimplePara(SimplePara value) {
        this.simplePara = value;
    }

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlign(String value) {
        this.align = value;
    }

    /**
     * Gets the value of the colname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColname() {
        return colname;
    }

    /**
     * Sets the value of the colname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColname(String value) {
        this.colname = value;
    }

    /**
     * Gets the value of the morerows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getMorerows() {
        return morerows;
    }

    /**
     * Sets the value of the morerows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorerows(Long value) {
        this.morerows = value;
    }

    /**
     * Gets the value of the nameend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameend() {
        return nameend;
    }

    /**
     * Sets the value of the nameend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameend(String value) {
        this.nameend = value;
    }

    /**
     * Gets the value of the namest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamest() {
        return namest;
    }

    /**
     * Sets the value of the namest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamest(String value) {
        this.namest = value;
    }

}
