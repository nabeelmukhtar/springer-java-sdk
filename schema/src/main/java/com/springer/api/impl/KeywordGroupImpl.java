
package com.springer.api.impl;

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

import com.springer.api.Heading;
import com.springer.api.KeywordGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "keyword"
})
@XmlRootElement(name = "KeywordGroup")
public class KeywordGroupImpl
    implements Serializable, KeywordGroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", type = HeadingImpl.class)
    protected HeadingImpl heading;
    @XmlElement(name = "Keyword", required = true)
    protected List<String> keyword;
    @XmlAttribute(name = "Language", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading value) {
        this.heading = ((HeadingImpl) value);
    }

    public List<String> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<String>();
        }
        return this.keyword;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

}
