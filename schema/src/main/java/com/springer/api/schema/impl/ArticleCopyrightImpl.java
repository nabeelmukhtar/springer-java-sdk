
package com.springer.api.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.springer.api.schema.ArticleCopyright;
import org.w3._2001.xmlschema.Adapter2;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "copyrightHolderName",
    "copyrightYear"
})
@XmlRootElement(name = "ArticleCopyright")
public class ArticleCopyrightImpl
    implements Serializable, ArticleCopyright
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CopyrightHolderName", required = true)
    protected String copyrightHolderName;
    @XmlElement(name = "CopyrightYear", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "integer")
    protected Long copyrightYear;

    public String getCopyrightHolderName() {
        return copyrightHolderName;
    }

    public void setCopyrightHolderName(String value) {
        this.copyrightHolderName = value;
    }

    public Long getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(Long value) {
        this.copyrightYear = value;
    }

}
