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

package org.prismstandard.namespaces.pam._2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._1999.xhtml.Body;
import org.w3._1999.xhtml.Head;


/**
 * The Class Message.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "head",
    "body"
})
@XmlRootElement(name = "message")
public class Message
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The head. */
    @XmlElement(namespace = "http://www.w3.org/1999/xhtml", required = true)
    protected Head head;
    
    /** The body. */
    @XmlElement(namespace = "http://www.w3.org/1999/xhtml", required = true)
    protected Body body;

    /**
     * Gets the head.
     * 
     * @return the head
     */
    public Head getHead() {
        return head;
    }

    /**
     * Sets the head.
     * 
     * @param value the new head
     */
    public void setHead(Head value) {
        this.head = value;
    }

    /**
     * Gets the body.
     * 
     * @return the body
     */
    public Body getBody() {
        return body;
    }

    /**
     * Sets the body.
     * 
     * @param value the new body
     */
    public void setBody(Body value) {
        this.body = value;
    }

}
