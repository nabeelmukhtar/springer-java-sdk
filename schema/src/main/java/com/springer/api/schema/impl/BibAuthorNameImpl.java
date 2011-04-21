
package com.springer.api.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.springer.api.schema.BibAuthorName;
import com.springer.api.schema.NoInitials;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "initials",
    "noInitials",
    "familyName",
    "particle",
    "suffix"
})
@XmlRootElement(name = "BibAuthorName")
public class BibAuthorNameImpl
    implements Serializable, BibAuthorName
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Initials", required = true)
    protected String initials;
    @XmlElement(name = "NoInitials", required = true, type = NoInitialsImpl.class)
    protected NoInitialsImpl noInitials;
    @XmlElement(name = "FamilyName", required = true)
    protected String familyName;
    @XmlElement(name = "Particle")
    protected String particle;
    @XmlElement(name = "Suffix")
    protected String suffix;

    public String getInitials() {
        return initials;
    }

    public void setInitials(String value) {
        this.initials = value;
    }

    public NoInitials getNoInitials() {
        return noInitials;
    }

    public void setNoInitials(NoInitials value) {
        this.noInitials = ((NoInitialsImpl) value);
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
