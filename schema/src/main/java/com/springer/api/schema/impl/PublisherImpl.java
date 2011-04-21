
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
import com.springer.app.meta.Info;
import com.springer.app.meta.impl.InfoImpl;
import com.springer.api.schema.Journal;
import com.springer.api.schema.Publisher;
import com.springer.api.schema.PublisherInfo;
import com.springer.api.schema.Series;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "publisherInfo",
    "journal",
    "series",
    "info"
})
@XmlRootElement(name = "Publisher")
public class PublisherImpl
    implements Serializable, Publisher
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "PublisherInfo", required = true, type = PublisherInfoImpl.class)
    protected PublisherInfoImpl publisherInfo;
    @XmlElement(name = "Journal", required = true, type = JournalImpl.class)
    protected JournalImpl journal;
    @XmlElement(name = "Series", required = true, type = SeriesImpl.class)
    protected SeriesImpl series;
    @XmlElement(name = "Info", namespace = "http://www.springer.com/app/meta", required = true, type = InfoImpl.class)
    protected InfoImpl info;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String lang;

    public PublisherInfo getPublisherInfo() {
        return publisherInfo;
    }

    public void setPublisherInfo(PublisherInfo value) {
        this.publisherInfo = ((PublisherInfoImpl) value);
    }

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal value) {
        this.journal = ((JournalImpl) value);
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series value) {
        this.series = ((SeriesImpl) value);
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info value) {
        this.info = ((InfoImpl) value);
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }

}
