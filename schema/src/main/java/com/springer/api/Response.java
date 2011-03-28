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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Class Response.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "query",
    "apiKey",
    "result",
    "records",
    "facets"
})
@XmlRootElement(name = "response")
public class Response
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The query. */
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String query;
    
    /** The api key. */
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String apiKey;
    
    /** The result. */
    @XmlElement(required = true)
    protected Result result;
    
    /** The records. */
    @XmlElement(required = true)
    protected Records records;
    
    /** The facets. */
    @XmlElement(required = true)
    protected Facets facets;

    /**
     * Gets the query.
     * 
     * @return the query
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the query.
     * 
     * @param value the new query
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the api key.
     * 
     * @return the api key
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the api key.
     * 
     * @param value the new api key
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the result.
     * 
     * @return the result
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the result.
     * 
     * @param value the new result
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the records.
     * 
     * @return the records
     */
    public Records getRecords() {
        return records;
    }

    /**
     * Sets the records.
     * 
     * @param value the new records
     */
    public void setRecords(Records value) {
        this.records = value;
    }

    /**
     * Gets the facets.
     * 
     * @return the facets
     */
    public Facets getFacets() {
        return facets;
    }

    /**
     * Sets the facets.
     * 
     * @param value the new facets
     */
    public void setFacets(Facets value) {
        this.facets = value;
    }

}
