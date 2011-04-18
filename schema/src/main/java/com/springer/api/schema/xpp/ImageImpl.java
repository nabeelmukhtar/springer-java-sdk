package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

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
public class ImageImpl extends BaseSchemaEntity implements Image {
    private final static long serialVersionUID = 2461660169443089969L;
    protected CaptionImpl caption;
    protected List<File> file;
    protected List<FullText> fullText;
    protected List<String> location;
    protected TableImpl table;
    protected List<ArticleTitle> articleTitle;
    protected List<Authors> authors;
    protected List<String> doi;
    protected List<Institutions> institutions;
    protected List<String> issueId;
    protected List<Object> journalId;
    protected List<Object> pubDate;
    protected List<String> sourceTitle;
    protected List<Object> sourceType;
    protected List<Object> volumeId;
    protected Long chapterId;
    protected Long bookTitleId;
    protected String bookDOI;
    protected ISXNImpl isxn;
    protected String subjectCollection;
    protected SubjectsImpl subjects;
    protected List<String> copyrightHolder;
    protected List<Keywords> keywords;
    protected List<Boolean> openAccess;
    protected String imageType;
    protected String articleURI;
    protected String provider;
    protected XMLGregorianCalendar dateLoaded;
    protected String id;
    protected String language;
    protected String lang;
    public Caption getCaption() {
        return caption;
    }
    public void setCaption(Caption value) {
        caption = ((CaptionImpl) value);
    }
    public List<File> getFile() {
        if (file == null) {
            file = new ArrayList<File>();
        }
        return this.file;
    }
    public void setFile(List<File> value) {
        this.file = value;
    }
    public List<FullText> getFullText() {
        if (fullText == null) {
            fullText = new ArrayList<FullText>();
        }
        return this.fullText;
    }
    public void setFullText(List<FullText> value) {
        this.fullText = value;
    }
    public List<String> getLocation() {
        if (location == null) {
            location = new ArrayList<String>();
        }
        return this.location;
    }
    public void setLocation(List<String> value) {
        this.location = value;
    }
    public Table getTable() {
        return table;
    }
    public void setTable(Table value) {
        table = ((TableImpl) value);
    }
    public List<ArticleTitle> getArticleTitle() {
        if (articleTitle == null) {
            articleTitle = new ArrayList<ArticleTitle>();
        }
        return this.articleTitle;
    }
    public void setArticleTitle(List<ArticleTitle> value) {
        this.articleTitle = value;
    }
    public List<Authors> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<Authors>();
        }
        return this.authors;
    }
    public void setAuthors(List<Authors> value) {
        this.authors = value;
    }
    public List<String> getDoi() {
        if (doi == null) {
            doi = new ArrayList<String>();
        }
        return this.doi;
    }
    public void setDoi(List<String> value) {
        this.doi = value;
    }
    public List<Institutions> getInstitutions() {
        if (institutions == null) {
            institutions = new ArrayList<Institutions>();
        }
        return this.institutions;
    }
    public void setInstitutions(List<Institutions> value) {
        this.institutions = value;
    }
    public List<String> getIssueId() {
        if (issueId == null) {
            issueId = new ArrayList<String>();
        }
        return this.issueId;
    }
    public void setIssueId(List<String> value) {
        this.issueId = value;
    }
    public List<Object> getJournalId() {
        if (journalId == null) {
            journalId = new ArrayList<Object>();
        }
        return this.journalId;
    }
    public void setJournalId(List<Object> value) {
        this.journalId = value;
    }
    public List<Object> getPubDate() {
        if (pubDate == null) {
            pubDate = new ArrayList<Object>();
        }
        return this.pubDate;
    }
    public void setPubDate(List<Object> value) {
        this.pubDate = value;
    }
    public List<String> getSourceTitle() {
        if (sourceTitle == null) {
            sourceTitle = new ArrayList<String>();
        }
        return this.sourceTitle;
    }
    public void setSourceTitle(List<String> value) {
        this.sourceTitle = value;
    }
    public List<Object> getSourceType() {
        if (sourceType == null) {
            sourceType = new ArrayList<Object>();
        }
        return this.sourceType;
    }
    public void setSourceType(List<Object> value) {
        this.sourceType = value;
    }
    public List<Object> getVolumeId() {
        if (volumeId == null) {
            volumeId = new ArrayList<Object>();
        }
        return this.volumeId;
    }
    public void setVolumeId(List<Object> value) {
        this.volumeId = value;
    }
    public Long getChapterId() {
        return chapterId;
    }
    public void setChapterId(Long value) {
        chapterId = ((Long) value);
    }
    public Long getBookTitleId() {
        return bookTitleId;
    }
    public void setBookTitleId(Long value) {
        bookTitleId = ((Long) value);
    }
    public String getBookDOI() {
        return bookDOI;
    }
    public void setBookDOI(String value) {
        bookDOI = ((String) value);
    }
    public ISXN getIsxn() {
        return isxn;
    }
    public void setIsxn(ISXN value) {
        isxn = ((ISXNImpl) value);
    }
    public String getSubjectCollection() {
        return subjectCollection;
    }
    public void setSubjectCollection(String value) {
        subjectCollection = ((String) value);
    }
    public Subjects getSubjects() {
        return subjects;
    }
    public void setSubjects(Subjects value) {
        subjects = ((SubjectsImpl) value);
    }
    public List<String> getCopyrightHolder() {
        if (copyrightHolder == null) {
            copyrightHolder = new ArrayList<String>();
        }
        return this.copyrightHolder;
    }
    public void setCopyrightHolder(List<String> value) {
        this.copyrightHolder = value;
    }
    public List<Keywords> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<Keywords>();
        }
        return this.keywords;
    }
    public void setKeywords(List<Keywords> value) {
        this.keywords = value;
    }
    public List<Boolean> getOpenAccess() {
        if (openAccess == null) {
            openAccess = new ArrayList<Boolean>();
        }
        return this.openAccess;
    }
    public void setOpenAccess(List<Boolean> value) {
        this.openAccess = value;
    }
    public String getImageType() {
        return imageType;
    }
    public void setImageType(String value) {
        imageType = ((String) value);
    }
    public String getArticleURI() {
        return articleURI;
    }
    public void setArticleURI(String value) {
        articleURI = ((String) value);
    }
    public String getProvider() {
        return provider;
    }
    public void setProvider(String value) {
        provider = ((String) value);
    }
    public XMLGregorianCalendar getDateLoaded() {
        return dateLoaded;
    }
    public void setDateLoaded(XMLGregorianCalendar value) {
        dateLoaded = ((XMLGregorianCalendar) value);
    }
    public String getId() {
        return id;
    }
    public void setId(String value) {
        id = ((String) value);
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String value) {
        language = ((String) value);
    }
    public String getLang() {
        return lang;
    }
    public void setLang(String value) {
        lang = ((String) value);
    }
    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("Caption")) {
                CaptionImpl node = new CaptionImpl();
                node.init(parser);
                setCaption(node);
            } else if (name.equals("File")) {
                FileImpl node = new FileImpl();
                node.init(parser);
                getFile().add(node);
            } else if (name.equals("FullText")) {
                FullTextImpl node = new FullTextImpl();
                node.init(parser);
                getFullText().add(node);
            } else if (name.equals("Location")) {
                getLocation().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                setTable(node);
            } else if (name.equals("ArticleTitle")) {
                ArticleTitleImpl node = new ArticleTitleImpl();
                node.init(parser);
                getArticleTitle().add(node);
            } else if (name.equals("Authors")) {
                AuthorsImpl node = new AuthorsImpl();
                node.init(parser);
                getAuthors().add(node);
            } else if (name.equals("DOI")) {
                getDoi().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Institutions")) {
                InstitutionsImpl node = new InstitutionsImpl();
                node.init(parser);
                getInstitutions().add(node);
            } else if (name.equals("IssueId")) {
                getIssueId().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("SourceTitle")) {
                getSourceTitle().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ChapterId")) {
                setChapterId(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookTitleId")) {
                setBookTitleId(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookDOI")) {
                setBookDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ISXN")) {
                ISXNImpl node = new ISXNImpl();
                node.init(parser);
                setIsxn(node);
            } else if (name.equals("SubjectCollection")) {
                setSubjectCollection(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Subjects")) {
                SubjectsImpl node = new SubjectsImpl();
                node.init(parser);
                setSubjects(node);
            } else if (name.equals("CopyrightHolder")) {
                getCopyrightHolder().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Keywords")) {
                KeywordsImpl node = new KeywordsImpl();
                node.init(parser);
                getKeywords().add(node);
            } else if (name.equals("OpenAccess")) {
                getOpenAccess().add(Boolean.valueOf(XppUtils.getElementValueFromNode(parser)));
            } else if (name.equals("ImageType")) {
                setImageType(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleURI")) {
                setArticleURI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Provider")) {
                setProvider(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("DateLoaded")) {
                setDateLoaded(XppUtils.getElementValueFromNode(parser));
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setId(XppUtils.getAttributeValueFromNode(parser, "Id"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "##default"));
        setLang(XppUtils.getAttributeValueFromNode(parser, "##default"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
