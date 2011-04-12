
package com.springer.api.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3._2001.xmlschema.Adapter1;

import com.springer.api.Images;
import com.springer.api.Publisher;
import com.springer.api.Result;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "publisher",
    "images",
    "total",
    "start",
    "pageLength"
})
@XmlRootElement(name = "result")
public class ResultImpl
    implements Serializable, Result
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Publisher", type = PublisherImpl.class)
    protected PublisherImpl publisher;
    @XmlElement(name = "Images", type = ImagesImpl.class)
    protected ImagesImpl images;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long total;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long start;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long pageLength;

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher value) {
        this.publisher = ((PublisherImpl) value);
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images value) {
        this.images = ((ImagesImpl) value);
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long value) {
        this.start = value;
    }

    public Long getPageLength() {
        return pageLength;
    }

    public void setPageLength(Long value) {
        this.pageLength = value;
    }

}
