
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
 *         &lt;element ref="{}Table" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}Caption"/>
 *           &lt;element ref="{}tgroup"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}tfooter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Float" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "table",
    "caption",
    "tgroup",
    "tfooter"
})
@XmlRootElement(name = "Table")
public class Table implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Table")
    protected Table table;
    @XmlElement(name = "Caption")
    protected Caption caption;
    protected Tgroup tgroup;
    protected Tfooter tfooter;
    @XmlAttribute(name = "Float")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String _float;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link Table }
     *     
     */
    public Table getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link Table }
     *     
     */
    public void setTable(Table value) {
        this.table = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the tgroup property.
     * 
     * @return
     *     possible object is
     *     {@link Tgroup }
     *     
     */
    public Tgroup getTgroup() {
        return tgroup;
    }

    /**
     * Sets the value of the tgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tgroup }
     *     
     */
    public void setTgroup(Tgroup value) {
        this.tgroup = value;
    }

    /**
     * Gets the value of the tfooter property.
     * 
     * @return
     *     possible object is
     *     {@link Tfooter }
     *     
     */
    public Tfooter getTfooter() {
        return tfooter;
    }

    /**
     * Sets the value of the tfooter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tfooter }
     *     
     */
    public void setTfooter(Tfooter value) {
        this.tfooter = value;
    }

    /**
     * Gets the value of the float property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloat() {
        return _float;
    }

    /**
     * Sets the value of the float property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloat(String value) {
        this._float = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
