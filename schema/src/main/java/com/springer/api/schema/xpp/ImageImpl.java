package com.springer.api.schema.xpp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import com.springer.api.schema.SubjectCollection;
import com.springer.api.schema.Subjects;
import com.springer.api.schema.Table;
public class ImageImpl extends BaseSchemaEntity implements Image {
    private final static long serialVersionUID = 2461660169443089969L;
    protected CaptionImpl caption;
    protected List<File> files;
    protected List<FullText> fullTexts;
    protected List<String> locations;
    protected List<ArticleTitle> articleTitles;
    protected Authors authors;
    protected List<String> dois;
    protected Institutions institutions;
    protected List<String> issueIds;
    protected List<String> journalIds;
    protected List<String> pubDates;
    protected List<String> sourceTitles;
    protected List<String> sourceTypes;
    protected List<Long> volumeIds;
    protected Long chapterId;
    protected Long bookTitleId;
    protected String bookDOI;
    protected ISXNImpl isxn;
    protected SubjectCollectionImpl subjectCollection;
    protected SubjectsImpl subjects;
    protected List<String> copyrightHolders;
    protected List<Keywords> keywords;
    protected List<Boolean> openAccesses;
    protected String imageType;
    protected String articleURI;
    protected String provider;
    protected Date dateLoaded;
    protected String id;
    protected String language;
    protected String lang;
    protected List<String> appIds;
    protected List<Table> tables;
    
    public List<String> getAPPIds() {
        if (appIds == null) {
        	appIds = new ArrayList<String>();
        }
        return this.appIds;
    }
    public Caption getCaption() {
        return caption;
    }
    public void setCaption(Caption value) {
        caption = ((CaptionImpl) value);
    }
    public List<File> getFiles() {
        if (files == null) {
            files = new ArrayList<File>();
        }
        return this.files;
    }
    public void setFiles(List<File> value) {
        this.files = value;
    }
    public List<FullText> getFullTexts() {
        if (fullTexts == null) {
            fullTexts = new ArrayList<FullText>();
        }
        return this.fullTexts;
    }
    public void setFullTexts(List<FullText> value) {
        this.fullTexts = value;
    }
    public List<String> getLocations() {
        if (locations == null) {
            locations = new ArrayList<String>();
        }
        return this.locations;
    }
    public void setLocations(List<String> value) {
        this.locations = value;
    }
    public List<Table> getTables() {
        if (tables == null) {
            tables = new ArrayList<Table>();
        }
        return this.tables;
    }
    public List<ArticleTitle> getArticleTitles() {
        if (articleTitles == null) {
            articleTitles = new ArrayList<ArticleTitle>();
        }
        return this.articleTitles;
    }
    public void setArticleTitles(List<ArticleTitle> value) {
        this.articleTitles = value;
    }
    public Authors getAuthors() {
        return authors;
    }
    public void setAuthors(Authors value) {
        this.authors = value;
    }
    public List<String> getDOIS() {
        if (dois == null) {
            dois = new ArrayList<String>();
        }
        return this.dois;
    }
    public void setDOIS(List<String> value) {
        this.dois = value;
    }
    public Institutions getInstitutions() {
        return this.institutions;
    }
    public void setInstitutions(Institutions value) {
        this.institutions = value;
    }
    public List<String> getIssueIds() {
        if (issueIds == null) {
            issueIds = new ArrayList<String>();
        }
        return this.issueIds;
    }
    public void setIssueIds(List<String> value) {
        this.issueIds = value;
    }
    public List<String> getJournalIds() {
        if (journalIds == null) {
            journalIds = new ArrayList<String>();
        }
        return this.journalIds;
    }
    public void setJournalIds(List<String> value) {
        this.journalIds = value;
    }
    public List<String> getPubDates() {
        if (pubDates == null) {
            pubDates = new ArrayList<String>();
        }
        return this.pubDates;
    }
    public void setPubDates(List<String> value) {
        this.pubDates = value;
    }
    public List<String> getSourceTitles() {
        if (sourceTitles == null) {
            sourceTitles = new ArrayList<String>();
        }
        return this.sourceTitles;
    }
    public void setSourceTitles(List<String> value) {
        this.sourceTitles = value;
    }
    public List<String> getSourceTypes() {
        if (sourceTypes == null) {
            sourceTypes = new ArrayList<String>();
        }
        return this.sourceTypes;
    }
    public void setSourceTypes(List<String> value) {
        this.sourceTypes = value;
    }
    public List<Long> getVolumeIds() {
        if (volumeIds == null) {
            volumeIds = new ArrayList<Long>();
        }
        return this.volumeIds;
    }
    public void setVolumeIds(List<Long> value) {
        this.volumeIds = value;
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
    public ISXN getISXN() {
        return isxn;
    }
    public void setISXN(ISXN value) {
        isxn = ((ISXNImpl) value);
    }
    public SubjectCollection getSubjectCollection() {
        return subjectCollection;
    }

    public void setSubjectCollection(SubjectCollection value) {
        this.subjectCollection = ((SubjectCollectionImpl) value);
    }
    public Subjects getSubjects() {
        return subjects;
    }
    public void setSubjects(Subjects value) {
        subjects = ((SubjectsImpl) value);
    }
    public List<String> getCopyrightHolders() {
        if (copyrightHolders == null) {
            copyrightHolders = new ArrayList<String>();
        }
        return this.copyrightHolders;
    }
    public void setCopyrightHolders(List<String> value) {
        this.copyrightHolders = value;
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
    public List<Boolean> getOpenAccesses() {
        if (openAccesses == null) {
            openAccesses = new ArrayList<Boolean>();
        }
        return this.openAccesses;
    }
    public void setOpenAccesses(List<Boolean> value) {
        this.openAccesses = value;
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
    public Date getDateLoaded() {
        return dateLoaded;
    }
    public void setDateLoaded(Date value) {
        dateLoaded = ((Date) value);
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
                getFiles().add(node);
            } else if (name.equals("FullText")) {
                FullTextImpl node = new FullTextImpl();
                node.init(parser);
                getFullTexts().add(node);
            } else if (name.equals("Location")) {
                getLocations().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Table")) {
                TableImpl node = new TableImpl();
                node.init(parser);
                getTables().add(node);
            } else if (name.equals("ArticleTitle")) {
                ArticleTitleImpl node = new ArticleTitleImpl();
                node.init(parser);
                getArticleTitles().add(node);
            } else if (name.equals("Authors")) {
                AuthorsImpl node = new AuthorsImpl();
                node.init(parser);
                setAuthors(node);
            } else if (name.equals("DOI")) {
                getDOIS().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Institutions")) {
                InstitutionsImpl node = new InstitutionsImpl();
                node.init(parser);
                setInstitutions(node);
            } else if (name.equals("IssueId")) {
                getIssueIds().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("APPId")) {
                getAPPIds().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("JournalId")) {
                getJournalIds().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("PubDate")) {
                getPubDates().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("SourceTitle")) {
                getSourceTitles().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("SourceType")) {
                getSourceTypes().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("VolumeId")) {
                getVolumeIds().add(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("ChapterId")) {
                setChapterId(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookTitleId")) {
                setBookTitleId(XppUtils.getElementValueAsLongFromNode(parser));
            } else if (name.equals("BookDOI")) {
                setBookDOI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ISXN")) {
                ISXNImpl node = new ISXNImpl();
                node.init(parser);
                setISXN(node);
            } else if (name.equals("SubjectCollection")) {
            	SubjectCollectionImpl node = new SubjectCollectionImpl();
            	node.init(parser);
                setSubjectCollection(node);
            } else if (name.equals("Subjects")) {
                SubjectsImpl node = new SubjectsImpl();
                node.init(parser);
                setSubjects(node);
            } else if (name.equals("CopyrightHolder")) {
                getCopyrightHolders().add(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Keywords")) {
                KeywordsImpl node = new KeywordsImpl();
                node.init(parser);
                getKeywords().add(node);
            } else if (name.equals("OpenAccess")) {
                getOpenAccesses().add(Boolean.valueOf(XppUtils.getElementValueFromNode(parser)));
            } else if (name.equals("ImageType")) {
                setImageType(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("ArticleURI")) {
                setArticleURI(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("Provider")) {
                setProvider(XppUtils.getElementValueFromNode(parser));
            } else if (name.equals("DateLoaded")) {
                setDateLoaded(XppUtils.getElementValueAsDateFromNode(parser));
            } else {                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
        setId(XppUtils.getAttributeValueFromNode(parser, "Id"));
        setLanguage(XppUtils.getAttributeValueFromNode(parser, "language"));
        setLang(XppUtils.getAttributeValueFromNode(parser, "lang"));
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
    }
}
