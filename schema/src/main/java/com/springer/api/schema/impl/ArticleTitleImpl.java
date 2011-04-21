
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.ArticleTitle;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "ArticleTitle")
public class ArticleTitleImpl
    implements Serializable, ArticleTitle
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElementRefs({
        @XmlElementRef(name = "Superscript", type = SuperscriptImpl.class),
        @XmlElementRef(name = "em", type = JAXBElement.class),
        @XmlElementRef(name = "InlineEquation", type = InlineEquationImpl.class),
        @XmlElementRef(name = "Emphasis", type = EmphasisImpl.class)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "Language")
    protected String language;
    @XmlAttribute(name = "OutputMedium")
    protected String outputMedium;

    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getOutputMedium() {
        return outputMedium;
    }

    public void setOutputMedium(String value) {
        this.outputMedium = value;
    }

}
