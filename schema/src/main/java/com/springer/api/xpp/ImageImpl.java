
package com.springer.api.xpp;

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

import com.springer.api.Caption;
import com.springer.api.ISXN;
import com.springer.api.Image;
import com.springer.api.Subjects;
import com.springer.api.Table;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caption",
    "fileOrFullTextOrLocation",
    "table",
    "articleTitleOrAuthorsOrDOI",
    "chapterId",
    "bookTitleId",
    "bookDOI",
    "isxn",
    "subjectCollection",
    "subjects",
    "copyrightHolderOrKeywordsOrOpenAccess",
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
        @XmlElement(name = "File", type = FileImpl.class),
        @XmlElement(name = "FullText", type = FullTextImpl.class),
        @XmlElement(name = "Location", type = String.class)
    })
    protected List<Object> fileOrFullTextOrLocation;
    @XmlElement(name = "Table", type = TableImpl.class)
    protected TableImpl table;
    @XmlElementRefs({
        @XmlElementRef(name = "JournalId", type = JAXBElement.class),
        @XmlElementRef(name = "DOI", type = JAXBElement.class),
        @XmlElementRef(name = "VolumeId", type = JAXBElement.class),
        @XmlElementRef(name = "PubDate", type = JAXBElement.class),
        @XmlElementRef(name = "Authors", type = AuthorsImpl.class),
        @XmlElementRef(name = "ArticleTitle", type = ArticleTitleImpl.class),
        @XmlElementRef(name = "Institutions", type = InstitutionsImpl.class),
        @XmlElementRef(name = "SourceTitle", type = JAXBElement.class),
        @XmlElementRef(name = "SourceType", type = JAXBElement.class),
        @XmlElementRef(name = "IssueId", type = JAXBElement.class)
    })
    protected List<Object> articleTitleOrAuthorsOrDOI;
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
        @XmlElement(name = "CopyrightHolder", type = String.class),
        @XmlElement(name = "Keywords", type = KeywordsImpl.class),
        @XmlElement(name = "OpenAccess", type = Boolean.class)
    })
    protected List<Object> copyrightHolderOrKeywordsOrOpenAccess;
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

    public List<Object> getFileOrFullTextOrLocation() {
        if (fileOrFullTextOrLocation == null) {
            fileOrFullTextOrLocation = new ArrayList<Object>();
        }
        return this.fileOrFullTextOrLocation;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table value) {
        this.table = ((TableImpl) value);
    }

    public List<Object> getArticleTitleOrAuthorsOrDOI() {
        if (articleTitleOrAuthorsOrDOI == null) {
            articleTitleOrAuthorsOrDOI = new ArrayList<Object>();
        }
        return this.articleTitleOrAuthorsOrDOI;
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

    public List<Object> getCopyrightHolderOrKeywordsOrOpenAccess() {
        if (copyrightHolderOrKeywordsOrOpenAccess == null) {
            copyrightHolderOrKeywordsOrOpenAccess = new ArrayList<Object>();
        }
        return this.copyrightHolderOrKeywordsOrOpenAccess;
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
