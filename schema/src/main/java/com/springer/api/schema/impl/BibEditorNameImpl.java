
package com.springer.api.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.BibEditorName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "initials",
    "familyName",
    "particle",
    "suffix"
})
@XmlRootElement(name = "BibEditorName")
public class BibEditorNameImpl
    implements Serializable, BibEditorName
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Initials", required = true)
    protected String initials;
    @XmlElement(name = "FamilyName", required = true)
    protected String familyName;
    @XmlElement(name = "Particle", required = true)
    protected String particle;
    @XmlElement(name = "Suffix", required = true)
    protected String suffix;

    public String getInitials() {
        return initials;
    }

    public void setInitials(String value) {
        this.initials = value;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String value) {
        this.familyName = value;
    }

    public String getParticle() {
        return particle;
    }

    public void setParticle(String value) {
        this.particle = value;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String value) {
        this.suffix = value;
    }

}
