
package org.prismstandard.namespaces.pam._2.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.prismstandard.namespaces.basic._2.Number;
import org.prismstandard.namespaces.basic._2.Volume;
import org.prismstandard.namespaces.basic._2.impl.NumberImpl;
import org.prismstandard.namespaces.basic._2.impl.VolumeImpl;
import org.prismstandard.namespaces.pam._2.Article;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identifier",
    "title",
    "creators",
    "publicationName",
    "isbn",
    "issn",
    "doi",
    "publisher",
    "publicationDate",
    "volume",
    "number",
    "startingPage",
    "url",
    "copyright"
})
@XmlRootElement(name = "article")
public class ArticleImpl
    implements Serializable, Article
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String identifier;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String title;
    @XmlElement(name = "creator", namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected List<String> creators;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    protected String publicationName;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String isbn;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String issn;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    protected String doi;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String publisher;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String publicationDate;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", type = VolumeImpl.class)
    protected VolumeImpl volume;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", type = NumberImpl.class)
    protected NumberImpl number;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String startingPage;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(namespace = "http://prismstandard.org/namespaces/basic/2.0/", required = true)
    protected String copyright;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String value) {
        this.identifier = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public List<String> getCreators() {
        if (creators == null) {
            creators = new ArrayList<String>();
        }
        return this.creators;
    }

    public String getPublicationName() {
        return publicationName;
    }

    public void setPublicationName(String value) {
        this.publicationName = value;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String value) {
        this.isbn = value;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String value) {
        this.issn = value;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String value) {
        this.doi = value;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String value) {
        this.publisher = value;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String value) {
        this.publicationDate = value;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume value) {
        this.volume = ((VolumeImpl) value);
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number value) {
        this.number = ((NumberImpl) value);
    }

    public String getStartingPage() {
        return startingPage;
    }

    public void setStartingPage(String value) {
        this.startingPage = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String value) {
        this.copyright = value;
    }

}
