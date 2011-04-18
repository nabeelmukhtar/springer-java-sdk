
package com.springer.api.schema.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.springer.api.schema.Acknowledgments;
import com.springer.api.schema.ArticleBackmatter;
import com.springer.api.schema.Bibliography;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "acknowledgments",
    "bibliography"
})
@XmlRootElement(name = "ArticleBackmatter")
public class ArticleBackmatterImpl
    implements Serializable, ArticleBackmatter
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Acknowledgments", type = AcknowledgmentsImpl.class)
    protected AcknowledgmentsImpl acknowledgments;
    @XmlElement(name = "Bibliography", required = true, type = BibliographyImpl.class)
    protected BibliographyImpl bibliography;

    public Acknowledgments getAcknowledgments() {
        return acknowledgments;
    }

    public void setAcknowledgments(Acknowledgments value) {
        this.acknowledgments = ((AcknowledgmentsImpl) value);
    }

    public Bibliography getBibliography() {
        return bibliography;
    }

    public void setBibliography(Bibliography value) {
        this.bibliography = ((BibliographyImpl) value);
    }

}
