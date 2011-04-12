
package com.springer.api.xpp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.ChapterTitle;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "ChapterTitle")
public class ChapterTitleImpl
    implements Serializable, ChapterTitle
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlValue
    protected String content;
    @XmlAttribute(name = "Language", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;

    public String getContent() {
        return content;
    }

    public void setContent(String value) {
        this.content = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

}
