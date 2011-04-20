
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3._2001.xmlschema.Adapter2;

import com.springer.api.schema.SeriesID;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeriesID", propOrder = {
    "seriesID"
})
@XmlSeeAlso({
    SeriesInfoImpl.class,
    ChapterContextImpl.class
})
public class SeriesIDImpl
    implements Serializable, SeriesID
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SeriesID", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long seriesID;

    public Long getSeriesID() {
        return seriesID;
    }

    public void setSeriesID(Long value) {
        this.seriesID = value;
    }

}
