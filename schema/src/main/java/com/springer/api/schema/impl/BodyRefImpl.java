
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.BodyRef;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BodyRef")
public class BodyRefImpl
    implements Serializable, BodyRef
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlAttribute(name = "FileRef", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String fileRef;
    @XmlAttribute(name = "OutputMedium")
    protected String outputMedium;
    @XmlAttribute(name = "PDFType")
    protected String pdfType;
    @XmlAttribute(name = "TargetType", required = true)
    protected String targetType;

    public String getFileRef() {
        return fileRef;
    }

    public void setFileRef(String value) {
        this.fileRef = value;
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

    public String getPDFType() {
        return pdfType;
    }

    public void setPDFType(String value) {
        this.pdfType = value;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String value) {
        this.targetType = value;
    }

}
