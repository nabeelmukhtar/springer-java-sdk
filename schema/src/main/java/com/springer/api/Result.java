/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

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
 * The Class Result.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "publisher",
    "images",
    "total",
    "start",
    "pageLength"
})
@XmlRootElement(name = "result")
public class Result
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The publisher. */
    @XmlElement(name = "Publisher")
    protected Publisher publisher;
    
    /** The images. */
    @XmlElement(name = "Images")
    protected Images images;
    
    /** The total. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long total;
    
    /** The start. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long start;
    
    /** The page length. */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long pageLength;

    /**
     * Gets the publisher.
     * 
     * @return the publisher
     */
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * Sets the publisher.
     * 
     * @param value the new publisher
     */
    public void setPublisher(Publisher value) {
        this.publisher = value;
    }

    /**
     * Gets the images.
     * 
     * @return the images
     */
    public Images getImages() {
        return images;
    }

    /**
     * Sets the images.
     * 
     * @param value the new images
     */
    public void setImages(Images value) {
        this.images = value;
    }

    /**
     * Gets the total.
     * 
     * @return the total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * Sets the total.
     * 
     * @param value the new total
     */
    public void setTotal(Long value) {
        this.total = value;
    }

    /**
     * Gets the start.
     * 
     * @return the start
     */
    public Long getStart() {
        return start;
    }

    /**
     * Sets the start.
     * 
     * @param value the new start
     */
    public void setStart(Long value) {
        this.start = value;
    }

    /**
     * Gets the page length.
     * 
     * @return the page length
     */
    public Long getPageLength() {
        return pageLength;
    }

    /**
     * Sets the page length.
     * 
     * @param value the new page length
     */
    public void setPageLength(Long value) {
        this.pageLength = value;
    }

}
