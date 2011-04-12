
package com.springer.api.xpp;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.AbstractGrant;
import com.springer.api.ArticleGrants;
import com.springer.api.BibliographyGrant;
import com.springer.api.BodyHTMLGrant;
import com.springer.api.BodyPDFGrant;
import com.springer.api.ESMGrant;
import com.springer.api.MetadataGrant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metadataGrant",
    "abstractGrant",
    "bodyPDFGrant",
    "bodyHTMLGrant",
    "bibliographyGrant",
    "esmGrant"
})
@XmlRootElement(name = "ArticleGrants")
public class ArticleGrantsImpl
    implements Serializable, ArticleGrants
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "MetadataGrant", required = true, type = MetadataGrantImpl.class)
    protected MetadataGrantImpl metadataGrant;
    @XmlElement(name = "AbstractGrant", required = true, type = AbstractGrantImpl.class)
    protected AbstractGrantImpl abstractGrant;
    @XmlElement(name = "BodyPDFGrant", required = true, type = BodyPDFGrantImpl.class)
    protected BodyPDFGrantImpl bodyPDFGrant;
    @XmlElement(name = "BodyHTMLGrant", required = true, type = BodyHTMLGrantImpl.class)
    protected BodyHTMLGrantImpl bodyHTMLGrant;
    @XmlElement(name = "BibliographyGrant", required = true, type = BibliographyGrantImpl.class)
    protected BibliographyGrantImpl bibliographyGrant;
    @XmlElement(name = "ESMGrant", required = true, type = ESMGrantImpl.class)
    protected ESMGrantImpl esmGrant;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    public MetadataGrant getMetadataGrant() {
        return metadataGrant;
    }

    public void setMetadataGrant(MetadataGrant value) {
        this.metadataGrant = ((MetadataGrantImpl) value);
    }

    public AbstractGrant getAbstractGrant() {
        return abstractGrant;
    }

    public void setAbstractGrant(AbstractGrant value) {
        this.abstractGrant = ((AbstractGrantImpl) value);
    }

    public BodyPDFGrant getBodyPDFGrant() {
        return bodyPDFGrant;
    }

    public void setBodyPDFGrant(BodyPDFGrant value) {
        this.bodyPDFGrant = ((BodyPDFGrantImpl) value);
    }

    public BodyHTMLGrant getBodyHTMLGrant() {
        return bodyHTMLGrant;
    }

    public void setBodyHTMLGrant(BodyHTMLGrant value) {
        this.bodyHTMLGrant = ((BodyHTMLGrantImpl) value);
    }

    public BibliographyGrant getBibliographyGrant() {
        return bibliographyGrant;
    }

    public void setBibliographyGrant(BibliographyGrant value) {
        this.bibliographyGrant = ((BibliographyGrantImpl) value);
    }

    public ESMGrant getESMGrant() {
        return esmGrant;
    }

    public void setESMGrant(ESMGrant value) {
        this.esmGrant = ((ESMGrantImpl) value);
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

}
