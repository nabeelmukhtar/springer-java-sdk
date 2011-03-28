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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class Para.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Para")
public class Para implements Serializable
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The content. */
    @XmlElementRefs({
        @XmlElementRef(name = "InternalRef", type = InternalRef.class),
        @XmlElementRef(name = "MediaObject", type = MediaObject.class),
        @XmlElementRef(name = "Table", type = Table.class),
        @XmlElementRef(name = "Equation", type = Equation.class),
        @XmlElementRef(name = "ExternalRef", type = ExternalRef.class),
        @XmlElementRef(name = "Emphasis", type = Emphasis.class),
        @XmlElementRef(name = "InlineEquation", type = InlineEquation.class),
        @XmlElementRef(name = "Superscript", type = Superscript.class),
        @XmlElementRef(name = "DefinitionList", type = DefinitionList.class),
        @XmlElementRef(name = "Footnote", type = Footnote.class),
        @XmlElementRef(name = "CitationRef", type = CitationRef.class),
        @XmlElementRef(name = "Figure", type = Figure.class),
        @XmlElementRef(name = "Subscript", type = Subscript.class)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * Gets the content.
     * 
     * @return the content
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
