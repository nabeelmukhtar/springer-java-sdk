
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3._2001.xmlschema.Adapter2;

import com.springer.api.schema.SeriesInfo;
import com.springer.api.schema.SeriesTitle;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "seriesTitle",
    "seriesAbbreviatedTitle"
})
@XmlRootElement(name = "SeriesInfo")
public class SeriesInfoImpl
    extends SeriesIDImpl
    implements Serializable, SeriesInfo
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "SeriesTitle", required = true, type = SeriesTitleImpl.class)
    protected SeriesTitleImpl seriesTitle;
    @XmlElement(name = "SeriesAbbreviatedTitle", required = true)
    protected String seriesAbbreviatedTitle;
    @XmlAttribute(name = "SeriesType", required = true)
    protected String seriesType;
    @XmlAttribute(name = "TocLevels", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long tocLevels;

    public SeriesTitle getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(SeriesTitle value) {
        this.seriesTitle = ((SeriesTitleImpl) value);
    }

    public String getSeriesAbbreviatedTitle() {
        return seriesAbbreviatedTitle;
    }

    public void setSeriesAbbreviatedTitle(String value) {
        this.seriesAbbreviatedTitle = value;
    }

    public String getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(String value) {
        this.seriesType = value;
    }

    public Long getTocLevels() {
        return tocLevels;
    }

    public void setTocLevels(Long value) {
        this.tocLevels = value;
    }

}