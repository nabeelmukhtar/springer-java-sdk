
package com.springer.api.xpp;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.springer.api.BibArticle;
import com.springer.api.BibBook;
import com.springer.api.BibChapter;
import com.springer.api.BibUnstructured;
import com.springer.api.Citation;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "citationNumber",
    "bibArticle",
    "bibBook",
    "bibChapter",
    "bibUnstructured"
})
@XmlRootElement(name = "Citation")
public class CitationImpl
    implements Serializable, Citation
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "CitationNumber", required = true)
    protected BigDecimal citationNumber;
    @XmlElement(name = "BibArticle", type = BibArticleImpl.class)
    protected BibArticleImpl bibArticle;
    @XmlElement(name = "BibBook", type = BibBookImpl.class)
    protected BibBookImpl bibBook;
    @XmlElement(name = "BibChapter", type = BibChapterImpl.class)
    protected BibChapterImpl bibChapter;
    @XmlElement(name = "BibUnstructured", type = BibUnstructuredImpl.class)
    protected BibUnstructuredImpl bibUnstructured;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;

    public BigDecimal getCitationNumber() {
        return citationNumber;
    }

    public void setCitationNumber(BigDecimal value) {
        this.citationNumber = value;
    }

    public BibArticle getBibArticle() {
        return bibArticle;
    }

    public void setBibArticle(BibArticle value) {
        this.bibArticle = ((BibArticleImpl) value);
    }

    public BibBook getBibBook() {
        return bibBook;
    }

    public void setBibBook(BibBook value) {
        this.bibBook = ((BibBookImpl) value);
    }

    public BibChapter getBibChapter() {
        return bibChapter;
    }

    public void setBibChapter(BibChapter value) {
        this.bibChapter = ((BibChapterImpl) value);
    }

    public BibUnstructured getBibUnstructured() {
        return bibUnstructured;
    }

    public void setBibUnstructured(BibUnstructured value) {
        this.bibUnstructured = ((BibUnstructuredImpl) value);
    }

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

}
