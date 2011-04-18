
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
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import org.w3._2001.xmlschema.Adapter1;

import com.springer.api.schema.Caption;
import com.springer.api.schema.ISXN;
import com.springer.api.schema.Image;
import com.springer.api.schema.Subjects;
import com.springer.api.schema.Table;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caption",
    "fileAndFullTextAndLocation",
    "table",
    "articleTitleAndAuthorsAndDOI",
    "chapterId",
    "bookTitleId",
    "bookDOI",
    "isxn",
    "subjectCollection",
    "subjects",
    "copyrightHolderAndKeywordsAndOpenAccess",
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
    @XmlElements({
        @XmlElement(name = "Location", required = true, type = String.class),
        @XmlElement(name = "File", required = true, type = FileImpl.class),
        @XmlElement(name = "FullText", required = true, type = FullTextImpl.class)
    })
    protected List<Object> fileAndFullTextAndLocation;
    @XmlElement(name = "Table", type = TableImpl.class)
    protected TableImpl table;
    @XmlElementRefs({
        @XmlElementRef(name = "PubDate", type = JAXBElement.class),
        @XmlElementRef(name = "Institutions", type = InstitutionsImpl.class),
        @XmlElementRef(name = "VolumeId", type = JAXBElement.class),
        @XmlElementRef(name = "IssueId", type = JAXBElement.class),
        @XmlElementRef(name = "SourceTitle", type = JAXBElement.class),
        @XmlElementRef(name = "Authors", type = AuthorsImpl.class),
        @XmlElementRef(name = "ArticleTitle", type = ArticleTitleImpl.class),
        @XmlElementRef(name = "SourceType", type = JAXBElement.class),
        @XmlElementRef(name = "DOI", type = JAXBElement.class),
        @XmlElementRef(name = "JournalId", type = JAXBElement.class)
    })
    protected List<Object> articleTitleAndAuthorsAndDOI;
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
    @XmlElements({
        @XmlElement(name = "OpenAccess", required = true, type = Boolean.class),
        @XmlElement(name = "Keywords", required = true, type = KeywordsImpl.class),
        @XmlElement(name = "CopyrightHolder", required = true, type = String.class)
    })
    protected List<Object> copyrightHolderAndKeywordsAndOpenAccess;
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

    public List<Object> getFileAndFullTextAndLocation() {
        if (fileAndFullTextAndLocation == null) {
            fileAndFullTextAndLocation = new ArrayList<Object>();
        }
        return this.fileAndFullTextAndLocation;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table value) {
        this.table = ((TableImpl) value);
    }

    public List<Object> getArticleTitleAndAuthorsAndDOI() {
        if (articleTitleAndAuthorsAndDOI == null) {
            articleTitleAndAuthorsAndDOI = new ArrayList<Object>();
        }
        return this.articleTitleAndAuthorsAndDOI;
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

    public List<Object> getCopyrightHolderAndKeywordsAndOpenAccess() {
        if (copyrightHolderAndKeywordsAndOpenAccess == null) {
            copyrightHolderAndKeywordsAndOpenAccess = new ArrayList<Object>();
        }
        return this.copyrightHolderAndKeywordsAndOpenAccess;
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
