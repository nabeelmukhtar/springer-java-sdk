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
 * The Class ArticleHistory.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registrationDate",
    "received",
    "revised",
    "accepted",
    "onlineDate"
})
@XmlRootElement(name = "ArticleHistory")
public class ArticleHistory
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The registration date. */
    @XmlElement(name = "RegistrationDate")
    protected RegistrationDate registrationDate;
    
    /** The received. */
    @XmlElement(name = "Received")
    protected Received received;
    
    /** The revised. */
    @XmlElement(name = "Revised")
    protected Revised revised;
    
    /** The accepted. */
    @XmlElement(name = "Accepted")
    protected Accepted accepted;
    
    /** The online date. */
    @XmlElement(name = "OnlineDate")
    protected OnlineDate onlineDate;

    /**
     * Gets the registration date.
     * 
     * @return the registration date
     */
    public RegistrationDate getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the registration date.
     * 
     * @param value the new registration date
     */
    public void setRegistrationDate(RegistrationDate value) {
        this.registrationDate = value;
    }

    /**
     * Gets the received.
     * 
     * @return the received
     */
    public Received getReceived() {
        return received;
    }

    /**
     * Sets the received.
     * 
     * @param value the new received
     */
    public void setReceived(Received value) {
        this.received = value;
    }

    /**
     * Gets the revised.
     * 
     * @return the revised
     */
    public Revised getRevised() {
        return revised;
    }

    /**
     * Sets the revised.
     * 
     * @param value the new revised
     */
    public void setRevised(Revised value) {
        this.revised = value;
    }

    /**
     * Gets the accepted.
     * 
     * @return the accepted
     */
    public Accepted getAccepted() {
        return accepted;
    }

    /**
     * Sets the accepted.
     * 
     * @param value the new accepted
     */
    public void setAccepted(Accepted value) {
        this.accepted = value;
    }

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

}
