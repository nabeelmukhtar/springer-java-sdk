
package com.springer.api.schema.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3._1999.xhtml.P;
import org.w3._1999.xhtml.impl.PImpl;

import com.springer.api.schema.Caption;
import com.springer.api.schema.CaptionContent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "p",
    "captionNumber",
    "captionContent"
})
@XmlRootElement(name = "Caption")
public class CaptionImpl
    implements Serializable, Caption
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(type = PImpl.class)
    protected PImpl p;
    @XmlElement(name = "CaptionNumber")
    protected String captionNumber;
    @XmlElement(name = "CaptionContent", type = CaptionContentImpl.class)
    protected CaptionContentImpl captionContent;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;

    public P getP() {
        return p;
    }

    public void setP(P value) {
        this.p = ((PImpl) value);
    }

    public String getCaptionNumber() {
        return captionNumber;
    }

    public void setCaptionNumber(String value) {
        this.captionNumber = value;
    }

    public CaptionContent getCaptionContent() {
        return captionContent;
    }

    public void setCaptionContent(CaptionContent value) {
        this.captionContent = ((CaptionContentImpl) value);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

}
