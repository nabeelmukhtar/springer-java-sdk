
package com.springer.app.meta.xpp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.springer.app.meta.Authors;
import com.springer.app.meta.Info;
import com.springer.app.meta.Institutions;
import com.springer.app.meta.SubjectGroup;
import com.springer.app.meta.Title;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dateLoaded",
    "authors",
    "institutions",
    "date",
    "type",
    "doi",
    "title",
    "isxn",
    "journalOrPubName",
    "articleFirstPage",
    "publication",
    "publicationType",
    "subjectGroup"
})
@XmlRootElement(name = "Info")
public class InfoImpl
    extends BaseSchemaEntity implements Info
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "DateLoaded")
    protected XMLGregorianCalendar dateLoaded;
    @XmlElement(name = "Authors", required = true, type = AuthorsImpl.class)
    protected AuthorsImpl authors;
    @XmlElement(name = "Institutions", required = true, type = InstitutionsImpl.class)
    protected InstitutionsImpl institutions;
    @XmlElement(name = "Date", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String date;
    @XmlElement(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlElement(name = "DOI", required = true)
    protected String doi;
    @XmlElement(name = "Title", required = true, type = TitleImpl.class)
    protected TitleImpl title;
    @XmlElement(name = "ISXN", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isxn;
    @XmlElementRefs({
        @XmlElementRef(name = "PubName", namespace = "http://www.springer.com/app/meta", type = JAXBElement.class),
        @XmlElementRef(name = "Journal", namespace = "http://www.springer.com/app/meta", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> journalOrPubName;
    @XmlElement(name = "ArticleFirstPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String articleFirstPage;
    @XmlElement(name = "Publication", required = true)
    protected String publication;
    @XmlElement(name = "PublicationType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String publicationType;
    @XmlElement(name = "SubjectGroup", required = true, type = SubjectGroupImpl.class)
    protected SubjectGroupImpl subjectGroup;

    public XMLGregorianCalendar getDateLoaded() {
        return dateLoaded;
    }

    public void setDateLoaded(XMLGregorianCalendar value) {
        this.dateLoaded = value;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors value) {
        this.authors = ((AuthorsImpl) value);
    }

    public Institutions getInstitutions() {
        return institutions;
    }

    public void setInstitutions(Institutions value) {
        this.institutions = ((InstitutionsImpl) value);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String value) {
        this.date = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getDOI() {
        return doi;
    }

    public void setDOI(String value) {
        this.doi = value;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title value) {
        this.title = ((TitleImpl) value);
    }

    public String getISXN() {
        return isxn;
    }

    public void setISXN(String value) {
        this.isxn = value;
    }

    public List<JAXBElement<String>> getJournalOrPubName() {
        if (journalOrPubName == null) {
            journalOrPubName = new ArrayList<JAXBElement<String>>();
        }
        return this.journalOrPubName;
    }

    public String getArticleFirstPage() {
        return articleFirstPage;
    }

    public void setArticleFirstPage(String value) {
        this.articleFirstPage = value;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String value) {
        this.publication = value;
    }

    public String getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(String value) {
        this.publicationType = value;
    }

    public SubjectGroup getSubjectGroup() {
        return subjectGroup;
    }

    public void setSubjectGroup(SubjectGroup value) {
        this.subjectGroup = ((SubjectGroupImpl) value);
    }

}
