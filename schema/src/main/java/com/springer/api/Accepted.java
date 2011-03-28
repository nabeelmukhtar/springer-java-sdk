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


/**
 * The Class Accepted.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "year",
    "month",
    "day"
})
@XmlRootElement(name = "Accepted")
public class Accepted
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The year. */
    @XmlElement(name = "Year", required = true)
    protected String year;
    
    /** The month. */
    @XmlElement(name = "Month", required = true)
    protected String month;
    
    /** The day. */
    @XmlElement(name = "Day", required = true)
    protected String day;

    /**
     * Gets the year.
     * 
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the year.
     * 
     * @param value the new year
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the month.
     * 
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the month.
     * 
     * @param value the new month
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the day.
     * 
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets the day.
     * 
     * @param value the new day
     */
    public void setDay(String value) {
        this.day = value;
    }

}
