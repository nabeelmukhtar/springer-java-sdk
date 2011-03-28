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
 * The Class IssueHistory.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "onlineDate",
    "printDate",
    "coverDate",
    "pricelistYear"
})
@XmlRootElement(name = "IssueHistory")
public class IssueHistory
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The online date. */
    @XmlElement(name = "OnlineDate")
    protected OnlineDate onlineDate;
    
    /** The print date. */
    @XmlElement(name = "PrintDate", required = true)
    protected PrintDate printDate;
    
    /** The cover date. */
    @XmlElement(name = "CoverDate")
    protected CoverDate coverDate;
    
    /** The pricelist year. */
    @XmlElement(name = "PricelistYear", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long pricelistYear;

    /**
     * Gets the online date.
     * 
     * @return the online date
     */
    public OnlineDate getOnlineDate() {
        return onlineDate;
    }

    /**
     * Sets the online date.
     * 
     * @param value the new online date
     */
    public void setOnlineDate(OnlineDate value) {
        this.onlineDate = value;
    }

    /**
     * Gets the prints the date.
     * 
     * @return the prints the date
     */
    public PrintDate getPrintDate() {
        return printDate;
    }

    /**
     * Sets the prints the date.
     * 
     * @param value the new prints the date
     */
    public void setPrintDate(PrintDate value) {
        this.printDate = value;
    }

    /**
     * Gets the cover date.
     * 
     * @return the cover date
     */
    public CoverDate getCoverDate() {
        return coverDate;
    }

    /**
     * Sets the cover date.
     * 
     * @param value the new cover date
     */
    public void setCoverDate(CoverDate value) {
        this.coverDate = value;
    }

    /**
     * Gets the pricelist year.
     * 
     * @return the pricelist year
     */
    public Long getPricelistYear() {
        return pricelistYear;
    }

    /**
     * Sets the pricelist year.
     * 
     * @param value the new pricelist year
     */
    public void setPricelistYear(Long value) {
        this.pricelistYear = value;
    }

}
