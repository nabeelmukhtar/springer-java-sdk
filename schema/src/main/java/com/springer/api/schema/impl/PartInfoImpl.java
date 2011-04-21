
package com.springer.api.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.PartContext;
import com.springer.api.schema.PartInfo;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partID",
    "partNumber",
    "partSequenceNumber",
    "partTitle",
    "partChapterCount",
    "partContext"
})
@XmlRootElement(name = "PartInfo")
public class PartInfoImpl
    implements Serializable, PartInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "PartID", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long partID;
    @XmlElement(name = "PartNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String partNumber;
    @XmlElement(name = "PartSequenceNumber", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long partSequenceNumber;
    @XmlElement(name = "PartTitle", required = true)
    protected String partTitle;
    @XmlElement(name = "PartChapterCount", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long partChapterCount;
    @XmlElement(name = "PartContext", required = true, type = PartContextImpl.class)
    protected PartContextImpl partContext;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long tocLevels;

    public Long getPartID() {
        return partID;
    }

    public void setPartID(Long value) {
        this.partID = value;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    public Long getPartSequenceNumber() {
        return partSequenceNumber;
    }

    public void setPartSequenceNumber(Long value) {
        this.partSequenceNumber = value;
    }

    public String getPartTitle() {
        return partTitle;
    }

    public void setPartTitle(String value) {
        this.partTitle = value;
    }

    public Long getPartChapterCount() {
        return partChapterCount;
    }

    public void setPartChapterCount(Long value) {
        this.partChapterCount = value;
    }

    public PartContext getPartContext() {
        return partContext;
    }

    public void setPartContext(PartContext value) {
        this.partContext = ((PartContextImpl) value);
    }

    public Long getTocLevels() {
        return tocLevels;
    }

    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

}
