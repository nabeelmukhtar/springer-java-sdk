
package com.springer.api.schema.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import org.w3._2001.xmlschema.Adapter1;

import com.springer.api.schema.ArticleTitle;
import com.springer.api.schema.Authors;
import com.springer.api.schema.Caption;
import com.springer.api.schema.File;
import com.springer.api.schema.FullText;
import com.springer.api.schema.ISXN;
import com.springer.api.schema.Image;
import com.springer.api.schema.Institutions;
import com.springer.api.schema.Keywords;
import com.springer.api.schema.Subjects;
import com.springer.api.schema.Table;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caption",
    "file",
    "fullText",
    "location",
    "table",
    "articleTitle",
    "authors",
    "doi",
    "institutions",
    "issueId",
    "journalId",
    "pubDate",
    "sourceTitle",
    "sourceType",
    "volumeId",
    "chapterId",
    "bookTitleId",
    "bookDOI",
    "isxn",
    "subjectCollection",
    "subjects",
    "copyrightHolder",
    "keywords",
    "openAccess",
    "imageType",
    "articleURI",
    "provider",
    "dateLoaded"
})
@XmlRootElement(name = "Image")
public class ImageImpl
    implements Serializable, Image
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Caption", required = true, type = CaptionImpl.class)
    protected CaptionImpl caption;
    @XmlElement(name = "File", required = true, type = FileImpl.class)
    protected List<File> file;
    @XmlElement(name = "FullText", required = true, type = FullTextImpl.class)
    protected List<FullText> fullText;
    @XmlElement(name = "Location", required = true)
    protected List<String> location;
    @XmlElement(name = "Table", type = TableImpl.class)
    protected TableImpl table;
    @XmlElement(name = "ArticleTitle", required = true, type = ArticleTitleImpl.class)
    protected List<ArticleTitle> articleTitle;
    @XmlElement(name = "Authors", required = true, type = AuthorsImpl.class)
    protected List<Authors> authors;
    @XmlElement(name = "DOI", required = true)
    protected List<String> doi;
    @XmlElement(name = "Institutions", required = true, type = InstitutionsImpl.class)
    protected List<Institutions> institutions;
    @XmlElement(name = "IssueId", required = true)
    protected List<String> issueId;
    @XmlElementRef(name = "JournalId", type = JAXBElement.class)
    protected List<JAXBElement<String>> journalId;
    @XmlElementRef(name = "PubDate", type = JAXBElement.class)
    protected List<JAXBElement<String>> pubDate;
    @XmlElement(name = "SourceTitle", required = true)
    protected List<String> sourceTitle;
    @XmlElementRef(name = "SourceType", type = JAXBElement.class)
    protected List<JAXBElement<String>> sourceType;
    @XmlElementRef(name = "VolumeId", type = JAXBElement.class)
    protected List<JAXBElement<Long>> volumeId;
    @XmlElement(name = "ChapterId", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long chapterId;
    @XmlElement(name = "BookTitleId", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long bookTitleId;
    @XmlElement(name = "BookDOI")
    protected String bookDOI;
    @XmlElement(name = "ISXN", required = true, type = ISXNImpl.class)
    protected ISXNImpl isxn;
    @XmlElement(name = "SubjectCollection", required = true)
    protected String subjectCollection;
    @XmlElement(name = "Subjects", required = true, type = SubjectsImpl.class)
    protected SubjectsImpl subjects;
    @XmlElement(name = "CopyrightHolder", required = true)
    protected List<String> copyrightHolder;
    @XmlElement(name = "Keywords", required = true, type = KeywordsImpl.class)
    protected List<Keywords> keywords;
    @XmlElement(name = "OpenAccess", type = Boolean.class)
    protected List<Boolean> openAccess;
    @XmlElement(name = "ImageType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String imageType;
    @XmlElement(name = "ArticleURI")
    protected String articleURI;
    @XmlElement(name = "Provider", required = true)
    protected String provider;
    @XmlElement(name = "DateLoaded")
    protected XMLGregorianCalendar dateLoaded;
    @XmlAttribute(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    public Caption getCaption() {
        return caption;
    }

    public void setCaption(Caption value) {
        this.caption = ((CaptionImpl) value);
    }

    public List<File> getFile() {
        if (file == null) {
            file = new ArrayList<File>();
        }
        return this.file;
    }

    public List<FullText> getFullText() {
        if (fullText == null) {
            fullText = new ArrayList<FullText>();
        }
        return this.fullText;
    }

    public List<String> getLocation() {
        if (location == null) {
            location = new ArrayList<String>();
        }
        return this.location;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table value) {
        this.table = ((TableImpl) value);
    }

    public List<ArticleTitle> getArticleTitle() {
        if (articleTitle == null) {
            articleTitle = new ArrayList<ArticleTitle>();
        }
        return this.articleTitle;
    }

    public List<Authors> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<Authors>();
        }
        return this.authors;
    }

    public List<String> getDOI() {
        if (doi == null) {
            doi = new ArrayList<String>();
        }
        return this.doi;
    }

    public List<Institutions> getInstitutions() {
        if (institutions == null) {
            institutions = new ArrayList<Institutions>();
        }
        return this.institutions;
    }

    public List<String> getIssueId() {
        if (issueId == null) {
            issueId = new ArrayList<String>();
        }
        return this.issueId;
    }

    public List<JAXBElement<String>> getJournalId() {
        if (journalId == null) {
            journalId = new ArrayList<JAXBElement<String>>();
        }
        return this.journalId;
    }

    public List<JAXBElement<String>> getPubDate() {
        if (pubDate == null) {
            pubDate = new ArrayList<JAXBElement<String>>();
        }
        return this.pubDate;
    }

    public List<String> getSourceTitle() {
        if (sourceTitle == null) {
            sourceTitle = new ArrayList<String>();
        }
        return this.sourceTitle;
    }

    public List<JAXBElement<String>> getSourceType() {
        if (sourceType == null) {
            sourceType = new ArrayList<JAXBElement<String>>();
        }
        return this.sourceType;
    }

    public List<JAXBElement<Long>> getVolumeId() {
        if (volumeId == null) {
            volumeId = new ArrayList<JAXBElement<Long>>();
        }
        return this.volumeId;
    }

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long value) {
        this.chapterId = value;
    }

    public Long getBookTitleId() {
        return bookTitleId;
    }

    public void setBookTitleId(Long value) {
        this.bookTitleId = value;
    }

    public String getBookDOI() {
        return bookDOI;
    }

    public void setBookDOI(String value) {
        this.bookDOI = value;
    }

    public ISXN getISXN() {
        return isxn;
    }

    public void setISXN(ISXN value) {
        this.isxn = ((ISXNImpl) value);
    }

    public String getSubjectCollection() {
        return subjectCollection;
    }

    public void setSubjectCollection(String value) {
        this.subjectCollection = value;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects value) {
        this.subjects = ((SubjectsImpl) value);
    }

    public List<String> getCopyrightHolder() {
        if (copyrightHolder == null) {
            copyrightHolder = new ArrayList<String>();
        }
        return this.copyrightHolder;
    }

    public List<Keywords> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<Keywords>();
        }
        return this.keywords;
    }

    public List<Boolean> getOpenAccess() {
        if (openAccess == null) {
            openAccess = new ArrayList<Boolean>();
        }
        return this.openAccess;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String value) {
        this.imageType = value;
    }

    public String getArticleURI() {
        return articleURI;
    }

    public void setArticleURI(String value) {
        this.articleURI = value;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String value) {
        this.provider = value;
    }

    public XMLGregorianCalendar getDateLoaded() {
        return dateLoaded;
    }

    public void setDateLoaded(XMLGregorianCalendar value) {
        this.dateLoaded = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String value) {
        this.language = value;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }

}
