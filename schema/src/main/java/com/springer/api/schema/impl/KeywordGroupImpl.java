
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
import com.springer.api.schema.Heading;
import com.springer.api.schema.KeywordGroup;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "heading",
    "keywords"
})
@XmlRootElement(name = "KeywordGroup")
public class KeywordGroupImpl
    implements Serializable, KeywordGroup
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Heading", type = HeadingImpl.class)
    protected HeadingImpl heading;
    @XmlElement(name = "Keyword", required = true)
    protected List<String> keywords;
    @XmlAttribute(name = "Language", required = true)
    protected String language;
    @XmlAttribute(name = "OutputMedium")
    protected String outputMedium;

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading value) {
        this.heading = ((HeadingImpl) value);
    }

    public List<String> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<String>();
        }
        return this.keywords;
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
