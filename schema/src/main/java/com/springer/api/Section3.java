
package com.springer.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}Heading"/>
 *         &lt;element ref="{}Para" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}Figure"/>
 *           &lt;element ref="{}Section4" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "para",
    "figure",
    "section4"
})
@XmlRootElement(name = "Section3")
public class Section3
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", required = true)
    protected Heading heading;
    @XmlElement(name = "Para")
    protected Para para;
    @XmlElement(name = "Figure")
    protected Figure figure;
    @XmlElement(name = "Section4")
    protected List<Section4> section4;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Heading }
     *     
     */
    public Heading getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Heading }
     *     
     */
    public void setHeading(Heading value) {
        this.heading = value;
    }

    /**
     * Gets the value of the para property.
     * 
     * @return
     *     possible object is
     *     {@link Para }
     *     
     */
    public Para getPara() {
        return para;
    }

    /**
     * Sets the value of the para property.
     * 
     * @param value
     *     allowed object is
     *     {@link Para }
     *     
     */
    public void setPara(Para value) {
        this.para = value;
    }

    /**
     * Gets the value of the figure property.
     * 
     * @return
     *     possible object is
     *     {@link Figure }
     *     
     */
    public Figure getFigure() {
        return figure;
    }

    /**
     * Sets the value of the figure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Figure }
     *     
     */
    public void setFigure(Figure value) {
        this.figure = value;
    }

    /**
     * Gets the value of the section4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the section4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSection4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Section4 }
     * 
     * 
     */
    public List<Section4> getSection4() {
        if (section4 == null) {
            section4 = new ArrayList<Section4>();
        }
        return this.section4;
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
