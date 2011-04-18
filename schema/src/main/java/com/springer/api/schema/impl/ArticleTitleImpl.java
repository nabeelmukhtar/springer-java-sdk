
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.schema.ArticleTitle;
import com.springer.api.schema.Emphasis;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "emphasis"
})
@XmlRootElement(name = "ArticleTitle")
public class ArticleTitleImpl
    implements Serializable, ArticleTitle
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Emphasis", type = EmphasisImpl.class)
    protected List<Emphasis> emphasis;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;

    public List<Emphasis> getEmphasis() {
        if (emphasis == null) {
            emphasis = new ArrayList<Emphasis>();
        }
        return this.emphasis;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

}
