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
 * The Class ArticleHeader.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authorGroup",
    "_abstract",
    "keywordGroup"
})
@XmlRootElement(name = "ArticleHeader")
public class ArticleHeader
    implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The author group. */
    @XmlElement(name = "AuthorGroup", required = true)
    protected AuthorGroup authorGroup;
    
    /** The _abstract. */
    @XmlElement(name = "Abstract", required = true)
    protected Abstract _abstract;
    
    /** The keyword group. */
    @XmlElement(name = "KeywordGroup", required = true)
    protected KeywordGroup keywordGroup;

    /**
     * Gets the author group.
     * 
     * @return the author group
     */
    public AuthorGroup getAuthorGroup() {
        return authorGroup;
    }

    /**
     * Sets the author group.
     * 
     * @param value the new author group
     */
    public void setAuthorGroup(AuthorGroup value) {
        this.authorGroup = value;
    }

    /**
     * Gets the abstract.
     * 
     * @return the abstract
     */
    public Abstract getAbstract() {
        return _abstract;
    }

    /**
     * Sets the abstract.
     * 
     * @param value the new abstract
     */
    public void setAbstract(Abstract value) {
        this._abstract = value;
    }

    /**
     * Gets the keyword group.
     * 
     * @return the keyword group
     */
    public KeywordGroup getKeywordGroup() {
        return keywordGroup;
    }

    /**
     * Sets the keyword group.
     * 
     * @param value the new keyword group
     */
    public void setKeywordGroup(KeywordGroup value) {
        this.keywordGroup = value;
    }

}
