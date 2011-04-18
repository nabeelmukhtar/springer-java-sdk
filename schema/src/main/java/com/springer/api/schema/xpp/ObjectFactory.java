
package com.springer.api.schema.xpp;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.w3._1999.xhtml.P;
import org.w3._1999.xhtml.impl.PImpl;
import org.w3._2001.xmlschema.Adapter1;

import com.springer.api.schema.*;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NumberInSeries_QNAME = new QName("", "NumberInSeries");
    private final static QName _Total_QNAME = new QName("", "total");
    private final static QName _CopyrightHolderName_QNAME = new QName("", "CopyrightHolderName");
    private final static QName _Format_QNAME = new QName("", "Format");
    private final static QName _EquationNumber_QNAME = new QName("", "EquationNumber");
    private final static QName _SubjectCollection_QNAME = new QName("", "SubjectCollection");
    private final static QName _JournalTitle_QNAME = new QName("", "JournalTitle");
    private final static QName _VolumeId_QNAME = new QName("", "VolumeId");
    private final static QName _BibComments_QNAME = new QName("", "BibComments");
    private final static QName _FamilyName_QNAME = new QName("", "FamilyName");
    private final static QName _H1_QNAME = new QName("", "h1");
    private final static QName _FirstPage_QNAME = new QName("", "FirstPage");
    private final static QName _PubDate_QNAME = new QName("", "PubDate");
    private final static QName _PublisherName_QNAME = new QName("", "PublisherName");
    private final static QName _Country_QNAME = new QName("", "Country");
    private final static QName _Color_QNAME = new QName("", "Color");
    private final static QName _ConfEventDate_QNAME = new QName("", "ConfEventDate");
    private final static QName _DateLoaded_QNAME = new QName("", "DateLoaded");
    private final static QName _JournalAbbreviatedTitle_QNAME = new QName("", "JournalAbbreviatedTitle");
    private final static QName _Email_QNAME = new QName("", "Email");
    private final static QName _Start_QNAME = new QName("", "start");
    private final static QName _VolumeID_QNAME = new QName("", "VolumeID");
    private final static QName _ArticleID_QNAME = new QName("", "ArticleID");
    private final static QName _Provider_QNAME = new QName("", "Provider");
    private final static QName _ChapterId_QNAME = new QName("", "ChapterId");
    private final static QName _Street_QNAME = new QName("", "Street");
    private final static QName _OrgDivision_QNAME = new QName("", "OrgDivision");
    private final static QName _Query_QNAME = new QName("", "query");
    private final static QName _Particle_QNAME = new QName("", "Particle");
    private final static QName _JournalID_QNAME = new QName("", "JournalID");
    private final static QName _ConfEventLocation_QNAME = new QName("", "ConfEventLocation");
    private final static QName _IssueId_QNAME = new QName("", "IssueId");
    private final static QName _IssueArticleCount_QNAME = new QName("", "IssueArticleCount");
    private final static QName _VolumeIDStart_QNAME = new QName("", "VolumeIDStart");
    private final static QName _GivenName_QNAME = new QName("", "GivenName");
    private final static QName _CopyrightHolder_QNAME = new QName("", "CopyrightHolder");
    private final static QName _OpenAccess_QNAME = new QName("", "OpenAccess");
    private final static QName _ArticleFirstPage_QNAME = new QName("", "ArticleFirstPage");
    private final static QName _ArticleURI_QNAME = new QName("", "ArticleURI");
    private final static QName _CopyrightYear_QNAME = new QName("", "CopyrightYear");
    private final static QName _Institution_QNAME = new QName("", "Institution");
    private final static QName _IssueID_QNAME = new QName("", "IssueID");
    private final static QName _City_QNAME = new QName("", "City");
    private final static QName _RefSource_QNAME = new QName("", "RefSource");
    private final static QName _PublisherURL_QNAME = new QName("", "PublisherURL");
    private final static QName _BookTitleId_QNAME = new QName("", "BookTitleId");
    private final static QName _ImageType_QNAME = new QName("", "ImageType");
    private final static QName _SourceTitle_QNAME = new QName("", "SourceTitle");
    private final static QName _PricelistYear_QNAME = new QName("", "PricelistYear");
    private final static QName _DOI_QNAME = new QName("", "DOI");
    private final static QName _JournalSPIN_QNAME = new QName("", "JournalSPIN");
    private final static QName _Month_QNAME = new QName("", "Month");
    private final static QName _BookTitle_QNAME = new QName("", "BookTitle");
    private final static QName _JournalPrintISSN_QNAME = new QName("", "JournalPrintISSN");
    private final static QName _BookDOI_QNAME = new QName("", "BookDOI");
    private final static QName _VolumeIDEnd_QNAME = new QName("", "VolumeIDEnd");
    private final static QName _JournalId_QNAME = new QName("", "JournalId");
    private final static QName _InlineMediaObject_QNAME = new QName("", "InlineMediaObject");
    private final static QName _Postcode_QNAME = new QName("", "Postcode");
    private final static QName _JournalElectronicISSN_QNAME = new QName("", "JournalElectronicISSN");
    private final static QName _PublisherLocation_QNAME = new QName("", "PublisherLocation");
    private final static QName _JournalSubTitle_QNAME = new QName("", "JournalSubTitle");
    private final static QName _Phone_QNAME = new QName("", "Phone");
    private final static QName _Keyword_QNAME = new QName("", "Keyword");
    private final static QName _Type_QNAME = new QName("", "Type");
    private final static QName _Day_QNAME = new QName("", "Day");
    private final static QName _ApiKey_QNAME = new QName("", "apiKey");
    private final static QName _Handle_QNAME = new QName("", "Handle");
    private final static QName _Year_QNAME = new QName("", "Year");
    private final static QName _ArticleDOI_QNAME = new QName("", "ArticleDOI");
    private final static QName _IssueIDEnd_QNAME = new QName("", "IssueIDEnd");
    private final static QName _Fax_QNAME = new QName("", "Fax");
    private final static QName _SourceType_QNAME = new QName("", "SourceType");
    private final static QName _Location_QNAME = new QName("", "Location");
    private final static QName _ArticleLastPage_QNAME = new QName("", "ArticleLastPage");
    private final static QName _IssueIDStart_QNAME = new QName("", "IssueIDStart");
    private final static QName _OrgName_QNAME = new QName("", "OrgName");
    private final static QName _LastPage_QNAME = new QName("", "LastPage");
    private final static QName _PageLength_QNAME = new QName("", "pageLength");
    private final static QName _ArticleSequenceNumber_QNAME = new QName("", "ArticleSequenceNumber");
    private final static QName _ArticleCategory_QNAME = new QName("", "ArticleCategory");
    private final static QName _CitationNumber_QNAME = new QName("", "CitationNumber");
    private final static QName _State_QNAME = new QName("", "State");
    private final static QName _Initials_QNAME = new QName("", "Initials");
    private final static QName _CaptionNumber_QNAME = new QName("", "CaptionNumber");
    private final static QName _VolumeIssueCount_QNAME = new QName("", "VolumeIssueCount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Colspec }
     * 
     */
    public ColspecImpl createColspec() {
        return new ColspecImpl();
    }

    /**
     * Create an instance of {@link AbstractGrant }
     * 
     */
    public AbstractGrantImpl createAbstractGrant() {
        return new AbstractGrantImpl();
    }

    /**
     * Create an instance of {@link JournalSubjectGroup }
     * 
     */
    public JournalSubjectGroupImpl createJournalSubjectGroup() {
        return new JournalSubjectGroupImpl();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public ImageImpl createImage() {
        return new ImageImpl();
    }

    /**
     * Create an instance of {@link ISXN }
     * 
     */
    public ISXNImpl createISXN() {
        return new ISXNImpl();
    }

    /**
     * Create an instance of {@link MetadataGrant }
     * 
     */
    public MetadataGrantImpl createMetadataGrant() {
        return new MetadataGrantImpl();
    }

    /**
     * Create an instance of {@link Issue }
     * 
     */
    public IssueImpl createIssue() {
        return new IssueImpl();
    }

    /**
     * Create an instance of {@link Record }
     * 
     */
    public RecordImpl createRecord() {
        return new RecordImpl();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public ResultImpl createResult() {
        return new ResultImpl();
    }

    /**
     * Create an instance of {@link BibChapter }
     * 
     */
    public BibChapterImpl createBibChapter() {
        return new BibChapterImpl();
    }

    /**
     * Create an instance of {@link Section3 }
     * 
     */
    public Section3Impl createSection3() {
        return new Section3Impl();
    }

    /**
     * Create an instance of {@link Superscript }
     * 
     */
    public SuperscriptImpl createSuperscript() {
        return new SuperscriptImpl();
    }

    /**
     * Create an instance of {@link ImageObject }
     * 
     */
    public ImageObjectImpl createImageObject() {
        return new ImageObjectImpl();
    }

    /**
     * Create an instance of {@link RefTarget }
     * 
     */
    public RefTargetImpl createRefTarget() {
        return new RefTargetImpl();
    }

    /**
     * Create an instance of {@link ArticleHistory }
     * 
     */
    public ArticleHistoryImpl createArticleHistory() {
        return new ArticleHistoryImpl();
    }

    /**
     * Create an instance of {@link Subscript }
     * 
     */
    public SubscriptImpl createSubscript() {
        return new SubscriptImpl();
    }

    /**
     * Create an instance of {@link ArticleCopyright }
     * 
     */
    public ArticleCopyrightImpl createArticleCopyright() {
        return new ArticleCopyrightImpl();
    }

    /**
     * Create an instance of {@link Section4 }
     * 
     */
    public Section4Impl createSection4() {
        return new Section4Impl();
    }

    /**
     * Create an instance of {@link BodyHTMLGrant }
     * 
     */
    public BodyHTMLGrantImpl createBodyHTMLGrant() {
        return new BodyHTMLGrantImpl();
    }

    /**
     * Create an instance of {@link Records }
     * 
     */
    public RecordsImpl createRecords() {
        return new RecordsImpl();
    }

    /**
     * Create an instance of {@link BibBook }
     * 
     */
    public BibBookImpl createBibBook() {
        return new BibBookImpl();
    }

    /**
     * Create an instance of {@link Bibliography }
     * 
     */
    public BibliographyImpl createBibliography() {
        return new BibliographyImpl();
    }

    /**
     * Create an instance of {@link ArticleTitle }
     * 
     */
    public ArticleTitleImpl createArticleTitle() {
        return new ArticleTitleImpl();
    }

    /**
     * Create an instance of {@link BibUnstructured }
     * 
     */
    public BibUnstructuredImpl createBibUnstructured() {
        return new BibUnstructuredImpl();
    }

    /**
     * Create an instance of {@link CoverDate }
     * 
     */
    public CoverDateImpl createCoverDate() {
        return new CoverDateImpl();
    }

    /**
     * Create an instance of {@link Row }
     * 
     */
    public RowImpl createRow() {
        return new RowImpl();
    }

    /**
     * Create an instance of {@link FullText }
     * 
     */
    public FullTextImpl createFullText() {
        return new FullTextImpl();
    }

    /**
     * Create an instance of {@link ArticleInfo }
     * 
     */
    public ArticleInfoImpl createArticleInfo() {
        return new ArticleInfoImpl();
    }

    /**
     * Create an instance of {@link BodyPDFGrant }
     * 
     */
    public BodyPDFGrantImpl createBodyPDFGrant() {
        return new BodyPDFGrantImpl();
    }

    /**
     * Create an instance of {@link OrgAddress }
     * 
     */
    public OrgAddressImpl createOrgAddress() {
        return new OrgAddressImpl();
    }

    /**
     * Create an instance of {@link FormalPara }
     * 
     */
    public FormalParaImpl createFormalPara() {
        return new FormalParaImpl();
    }

    /**
     * Create an instance of {@link Para }
     * 
     */
    public ParaImpl createPara() {
        return new ParaImpl();
    }

    /**
     * Create an instance of {@link Institutions }
     * 
     */
    public InstitutionsImpl createInstitutions() {
        return new InstitutionsImpl();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public ContactImpl createContact() {
        return new ContactImpl();
    }

    /**
     * Create an instance of {@link Thead }
     * 
     */
    public TheadImpl createThead() {
        return new TheadImpl();
    }

    /**
     * Create an instance of {@link Facet }
     * 
     */
    public FacetImpl createFacet() {
        return new FacetImpl();
    }

    /**
     * Create an instance of {@link Equation }
     * 
     */
    public EquationImpl createEquation() {
        return new EquationImpl();
    }

    /**
     * Create an instance of {@link AuthorGroup }
     * 
     */
    public AuthorGroupImpl createAuthorGroup() {
        return new AuthorGroupImpl();
    }

    /**
     * Create an instance of {@link Journal }
     * 
     */
    public JournalImpl createJournal() {
        return new JournalImpl();
    }

    /**
     * Create an instance of {@link CitationRef }
     * 
     */
    public CitationRefImpl createCitationRef() {
        return new CitationRefImpl();
    }

    /**
     * Create an instance of {@link Subjects }
     * 
     */
    public SubjectsImpl createSubjects() {
        return new SubjectsImpl();
    }

    /**
     * Create an instance of {@link BodyRef }
     * 
     */
    public BodyRefImpl createBodyRef() {
        return new BodyRefImpl();
    }

    /**
     * Create an instance of {@link Citation }
     * 
     */
    public CitationImpl createCitation() {
        return new CitationImpl();
    }

    /**
     * Create an instance of {@link ArticleSubTitle }
     * 
     */
    public ArticleSubTitleImpl createArticleSubTitle() {
        return new ArticleSubTitleImpl();
    }

    /**
     * Create an instance of {@link FacetValue }
     * 
     */
    public FacetValueImpl createFacetValue() {
        return new FacetValueImpl();
    }

    /**
     * Create an instance of {@link MediaObject }
     * 
     */
    public MediaObjectImpl createMediaObject() {
        return new MediaObjectImpl();
    }

    /**
     * Create an instance of {@link Volume }
     * 
     */
    public VolumeImpl createVolume() {
        return new VolumeImpl();
    }

    /**
     * Create an instance of {@link Path }
     * 
     */
    public PathImpl createPath() {
        return new PathImpl();
    }

    /**
     * Create an instance of {@link BibArticle }
     * 
     */
    public BibArticleImpl createBibArticle() {
        return new BibArticleImpl();
    }

    /**
     * Create an instance of {@link JournalOnlineFirst }
     * 
     */
    public JournalOnlineFirstImpl createJournalOnlineFirst() {
        return new JournalOnlineFirstImpl();
    }

    /**
     * Create an instance of {@link Section2 }
     * 
     */
    public Section2Impl createSection2() {
        return new Section2Impl();
    }

    /**
     * Create an instance of {@link ExternalRef }
     * 
     */
    public ExternalRefImpl createExternalRef() {
        return new ExternalRefImpl();
    }

    /**
     * Create an instance of {@link ArticleBackmatter }
     * 
     */
    public ArticleBackmatterImpl createArticleBackmatter() {
        return new ArticleBackmatterImpl();
    }

    /**
     * Create an instance of {@link Biography }
     * 
     */
    public BiographyImpl createBiography() {
        return new BiographyImpl();
    }

    /**
     * Create an instance of {@link Affiliation }
     * 
     */
    public AffiliationImpl createAffiliation() {
        return new AffiliationImpl();
    }

    /**
     * Create an instance of {@link JournalSubject }
     * 
     */
    public JournalSubjectImpl createJournalSubject() {
        return new JournalSubjectImpl();
    }

    /**
     * Create an instance of {@link Tgroup }
     * 
     */
    public TgroupImpl createTgroup() {
        return new TgroupImpl();
    }

    /**
     * Create an instance of {@link InternalRef }
     * 
     */
    public InternalRefImpl createInternalRef() {
        return new InternalRefImpl();
    }

    /**
     * Create an instance of {@link Accepted }
     * 
     */
    public AcceptedImpl createAccepted() {
        return new AcceptedImpl();
    }

    /**
     * Create an instance of {@link PrintDate }
     * 
     */
    public PrintDateImpl createPrintDate() {
        return new PrintDateImpl();
    }

    /**
     * Create an instance of {@link Received }
     * 
     */
    public ReceivedImpl createReceived() {
        return new ReceivedImpl();
    }

    /**
     * Create an instance of {@link AuthorName }
     * 
     */
    public AuthorNameImpl createAuthorName() {
        return new AuthorNameImpl();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public PublisherImpl createPublisher() {
        return new PublisherImpl();
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public ArticleImpl createArticle() {
        return new ArticleImpl();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public EntryImpl createEntry() {
        return new EntryImpl();
    }

    /**
     * Create an instance of {@link AbstractSection }
     * 
     */
    public AbstractSectionImpl createAbstractSection() {
        return new AbstractSectionImpl();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public SubjectImpl createSubject() {
        return new SubjectImpl();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public DescriptionImpl createDescription() {
        return new DescriptionImpl();
    }

    /**
     * Create an instance of {@link BibliographyGrant }
     * 
     */
    public BibliographyGrantImpl createBibliographyGrant() {
        return new BibliographyGrantImpl();
    }

    /**
     * Create an instance of {@link ChapterTitle }
     * 
     */
    public ChapterTitleImpl createChapterTitle() {
        return new ChapterTitleImpl();
    }

    /**
     * Create an instance of {@link Acknowledgments }
     * 
     */
    public AcknowledgmentsImpl createAcknowledgments() {
        return new AcknowledgmentsImpl();
    }

    /**
     * Create an instance of {@link PublisherInfo }
     * 
     */
    public PublisherInfoImpl createPublisherInfo() {
        return new PublisherInfoImpl();
    }

    /**
     * Create an instance of {@link DefinitionList }
     * 
     */
    public DefinitionListImpl createDefinitionList() {
        return new DefinitionListImpl();
    }

    /**
     * Create an instance of {@link Heading }
     * 
     */
    public HeadingImpl createHeading() {
        return new HeadingImpl();
    }

    /**
     * Create an instance of {@link Tbody }
     * 
     */
    public TbodyImpl createTbody() {
        return new TbodyImpl();
    }

    /**
     * Create an instance of {@link OnlineDate }
     * 
     */
    public OnlineDateImpl createOnlineDate() {
        return new OnlineDateImpl();
    }

    /**
     * Create an instance of {@link CaptionContent }
     * 
     */
    public CaptionContentImpl createCaptionContent() {
        return new CaptionContentImpl();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public FileImpl createFile() {
        return new FileImpl();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public ResponseImpl createResponse() {
        return new ResponseImpl();
    }

    /**
     * Create an instance of {@link BibAuthorName }
     * 
     */
    public BibAuthorNameImpl createBibAuthorName() {
        return new BibAuthorNameImpl();
    }

    /**
     * Create an instance of {@link Abstract }
     * 
     */
    public AbstractImpl createAbstract() {
        return new AbstractImpl();
    }

    /**
     * Create an instance of {@link Occurrence }
     * 
     */
    public OccurrenceImpl createOccurrence() {
        return new OccurrenceImpl();
    }

    /**
     * Create an instance of {@link ArticleEditorialResponsibility }
     * 
     */
    public ArticleEditorialResponsibilityImpl createArticleEditorialResponsibility() {
        return new ArticleEditorialResponsibilityImpl();
    }

    /**
     * Create an instance of {@link EquationSource }
     * 
     */
    public EquationSourceImpl createEquationSource() {
        return new EquationSourceImpl();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public AuthorImpl createAuthor() {
        return new AuthorImpl();
    }

    /**
     * Create an instance of {@link InlineEquation }
     * 
     */
    public InlineEquationImpl createInlineEquation() {
        return new InlineEquationImpl();
    }

    /**
     * Create an instance of {@link Facets }
     * 
     */
    public FacetsImpl createFacets() {
        return new FacetsImpl();
    }

    /**
     * Create an instance of {@link Table }
     * 
     */
    public TableImpl createTable() {
        return new TableImpl();
    }

    /**
     * Create an instance of {@link Footnote }
     * 
     */
    public FootnoteImpl createFootnote() {
        return new FootnoteImpl();
    }

    /**
     * Create an instance of {@link ArticleHeader }
     * 
     */
    public ArticleHeaderImpl createArticleHeader() {
        return new ArticleHeaderImpl();
    }

    /**
     * Create an instance of {@link JournalInfo }
     * 
     */
    public JournalInfoImpl createJournalInfo() {
        return new JournalInfoImpl();
    }

    /**
     * Create an instance of {@link Authors }
     * 
     */
    public AuthorsImpl createAuthors() {
        return new AuthorsImpl();
    }

    /**
     * Create an instance of {@link Section1 }
     * 
     */
    public Section1Impl createSection1() {
        return new Section1Impl();
    }

    /**
     * Create an instance of {@link P }
     * 
     */
    public PImpl createP() {
        return new PImpl();
    }

    /**
     * Create an instance of {@link VolumeInfo }
     * 
     */
    public VolumeInfoImpl createVolumeInfo() {
        return new VolumeInfoImpl();
    }

    /**
     * Create an instance of {@link IssueHistory }
     * 
     */
    public IssueHistoryImpl createIssueHistory() {
        return new IssueHistoryImpl();
    }

    /**
     * Create an instance of {@link Emphasis }
     * 
     */
    public EmphasisImpl createEmphasis() {
        return new EmphasisImpl();
    }

    /**
     * Create an instance of {@link ArticleContext }
     * 
     */
    public ArticleContextImpl createArticleContext() {
        return new ArticleContextImpl();
    }

    /**
     * Create an instance of {@link ESMGrant }
     * 
     */
    public ESMGrantImpl createESMGrant() {
        return new ESMGrantImpl();
    }

    /**
     * Create an instance of {@link Tfooter }
     * 
     */
    public TfooterImpl createTfooter() {
        return new TfooterImpl();
    }

    /**
     * Create an instance of {@link Revised }
     * 
     */
    public RevisedImpl createRevised() {
        return new RevisedImpl();
    }

    /**
     * Create an instance of {@link IssueInfo }
     * 
     */
    public IssueInfoImpl createIssueInfo() {
        return new IssueInfoImpl();
    }

    /**
     * Create an instance of {@link ArticleGrants }
     * 
     */
    public ArticleGrantsImpl createArticleGrants() {
        return new ArticleGrantsImpl();
    }

    /**
     * Create an instance of {@link Images }
     * 
     */
    public ImagesImpl createImages() {
        return new ImagesImpl();
    }

    /**
     * Create an instance of {@link SimplePara }
     * 
     */
    public SimpleParaImpl createSimplePara() {
        return new SimpleParaImpl();
    }

    /**
     * Create an instance of {@link KeywordGroup }
     * 
     */
    public KeywordGroupImpl createKeywordGroup() {
        return new KeywordGroupImpl();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public BodyImpl createBody() {
        return new BodyImpl();
    }

    /**
     * Create an instance of {@link DefinitionListEntry }
     * 
     */
    public DefinitionListEntryImpl createDefinitionListEntry() {
        return new DefinitionListEntryImpl();
    }

    /**
     * Create an instance of {@link IssueCopyright }
     * 
     */
    public IssueCopyrightImpl createIssueCopyright() {
        return new IssueCopyrightImpl();
    }

    /**
     * Create an instance of {@link TextObject }
     * 
     */
    public TextObjectImpl createTextObject() {
        return new TextObjectImpl();
    }

    /**
     * Create an instance of {@link Figure }
     * 
     */
    public FigureImpl createFigure() {
        return new FigureImpl();
    }

    /**
     * Create an instance of {@link ImageObjectElement }
     * 
     */
    public ImageObjectElementImpl createImageObjectElement() {
        return new ImageObjectElementImpl();
    }

    /**
     * Create an instance of {@link RegistrationDate }
     * 
     */
    public RegistrationDateImpl createRegistrationDate() {
        return new RegistrationDateImpl();
    }

    /**
     * Create an instance of {@link Term }
     * 
     */
    public TermImpl createTerm() {
        return new TermImpl();
    }

    /**
     * Create an instance of {@link Caption }
     * 
     */
    public CaptionImpl createCaption() {
        return new CaptionImpl();
    }

    /**
     * Create an instance of {@link Keywords }
     * 
     */
    public KeywordsImpl createKeywords() {
        return new KeywordsImpl();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberInSeries")
    public JAXBElement<String> createNumberInSeries(String value) {
        return new JAXBElement<String>(_NumberInSeries_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "total")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createTotal(Long value) {
        return new JAXBElement<Long>(_Total_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CopyrightHolderName")
    public JAXBElement<String> createCopyrightHolderName(String value) {
        return new JAXBElement<String>(_CopyrightHolderName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Format")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFormat(String value) {
        return new JAXBElement<String>(_Format_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EquationNumber")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createEquationNumber(Long value) {
        return new JAXBElement<Long>(_EquationNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SubjectCollection")
    public JAXBElement<String> createSubjectCollection(String value) {
        return new JAXBElement<String>(_SubjectCollection_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalTitle")
    public JAXBElement<String> createJournalTitle(String value) {
        return new JAXBElement<String>(_JournalTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VolumeId")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createVolumeId(Long value) {
        return new JAXBElement<Long>(_VolumeId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BibComments")
    public JAXBElement<String> createBibComments(String value) {
        return new JAXBElement<String>(_BibComments_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FamilyName")
    public JAXBElement<String> createFamilyName(String value) {
        return new JAXBElement<String>(_FamilyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "h1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createH1(String value) {
        return new JAXBElement<String>(_H1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FirstPage")
    public JAXBElement<String> createFirstPage(String value) {
        return new JAXBElement<String>(_FirstPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PubDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPubDate(String value) {
        return new JAXBElement<String>(_PubDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PublisherName")
    public JAXBElement<String> createPublisherName(String value) {
        return new JAXBElement<String>(_PublisherName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Country")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Color")
    public JAXBElement<Boolean> createColor(Boolean value) {
        return new JAXBElement<Boolean>(_Color_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConfEventDate")
    public JAXBElement<String> createConfEventDate(String value) {
        return new JAXBElement<String>(_ConfEventDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DateLoaded")
    public JAXBElement<XMLGregorianCalendar> createDateLoaded(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateLoaded_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalAbbreviatedTitle")
    public JAXBElement<String> createJournalAbbreviatedTitle(String value) {
        return new JAXBElement<String>(_JournalAbbreviatedTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "start")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createStart(Long value) {
        return new JAXBElement<Long>(_Start_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VolumeID")
    public JAXBElement<String> createVolumeID(String value) {
        return new JAXBElement<String>(_VolumeID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArticleID(String value) {
        return new JAXBElement<String>(_ArticleID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Provider")
    public JAXBElement<String> createProvider(String value) {
        return new JAXBElement<String>(_Provider_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChapterId")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createChapterId(Long value) {
        return new JAXBElement<Long>(_ChapterId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Street")
    public JAXBElement<String> createStreet(String value) {
        return new JAXBElement<String>(_Street_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OrgDivision")
    public JAXBElement<String> createOrgDivision(String value) {
        return new JAXBElement<String>(_OrgDivision_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "query")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createQuery(String value) {
        return new JAXBElement<String>(_Query_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Particle")
    public JAXBElement<String> createParticle(String value) {
        return new JAXBElement<String>(_Particle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalID")
    public JAXBElement<String> createJournalID(String value) {
        return new JAXBElement<String>(_JournalID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConfEventLocation")
    public JAXBElement<String> createConfEventLocation(String value) {
        return new JAXBElement<String>(_ConfEventLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssueId")
    public JAXBElement<String> createIssueId(String value) {
        return new JAXBElement<String>(_IssueId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssueArticleCount")
    public JAXBElement<String> createIssueArticleCount(String value) {
        return new JAXBElement<String>(_IssueArticleCount_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VolumeIDStart")
    public JAXBElement<String> createVolumeIDStart(String value) {
        return new JAXBElement<String>(_VolumeIDStart_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GivenName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGivenName(String value) {
        return new JAXBElement<String>(_GivenName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CopyrightHolder")
    public JAXBElement<String> createCopyrightHolder(String value) {
        return new JAXBElement<String>(_CopyrightHolder_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpenAccess")
    public JAXBElement<Boolean> createOpenAccess(Boolean value) {
        return new JAXBElement<Boolean>(_OpenAccess_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleFirstPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArticleFirstPage(String value) {
        return new JAXBElement<String>(_ArticleFirstPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleURI")
    public JAXBElement<String> createArticleURI(String value) {
        return new JAXBElement<String>(_ArticleURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CopyrightYear")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createCopyrightYear(Long value) {
        return new JAXBElement<Long>(_CopyrightYear_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Institution")
    public JAXBElement<String> createInstitution(String value) {
        return new JAXBElement<String>(_Institution_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssueID")
    public JAXBElement<String> createIssueID(String value) {
        return new JAXBElement<String>(_IssueID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "City")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RefSource")
    public JAXBElement<String> createRefSource(String value) {
        return new JAXBElement<String>(_RefSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PublisherURL")
    public JAXBElement<String> createPublisherURL(String value) {
        return new JAXBElement<String>(_PublisherURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookTitleId")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createBookTitleId(Long value) {
        return new JAXBElement<Long>(_BookTitleId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ImageType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createImageType(String value) {
        return new JAXBElement<String>(_ImageType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SourceTitle")
    public JAXBElement<String> createSourceTitle(String value) {
        return new JAXBElement<String>(_SourceTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PricelistYear")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createPricelistYear(Long value) {
        return new JAXBElement<Long>(_PricelistYear_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOI")
    public JAXBElement<String> createDOI(String value) {
        return new JAXBElement<String>(_DOI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalSPIN")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createJournalSPIN(Long value) {
        return new JAXBElement<Long>(_JournalSPIN_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Month")
    public JAXBElement<String> createMonth(String value) {
        return new JAXBElement<String>(_Month_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookTitle")
    public JAXBElement<String> createBookTitle(String value) {
        return new JAXBElement<String>(_BookTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalPrintISSN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJournalPrintISSN(String value) {
        return new JAXBElement<String>(_JournalPrintISSN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BookDOI")
    public JAXBElement<String> createBookDOI(String value) {
        return new JAXBElement<String>(_BookDOI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VolumeIDEnd")
    public JAXBElement<String> createVolumeIDEnd(String value) {
        return new JAXBElement<String>(_VolumeIDEnd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJournalId(String value) {
        return new JAXBElement<String>(_JournalId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageObjectImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InlineMediaObject")
    public JAXBElement<ImageObjectImpl> createInlineMediaObject(ImageObjectImpl value) {
        return new JAXBElement<ImageObjectImpl>(_InlineMediaObject_QNAME, ImageObjectImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Postcode")
    public JAXBElement<String> createPostcode(String value) {
        return new JAXBElement<String>(_Postcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalElectronicISSN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJournalElectronicISSN(String value) {
        return new JAXBElement<String>(_JournalElectronicISSN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PublisherLocation")
    public JAXBElement<String> createPublisherLocation(String value) {
        return new JAXBElement<String>(_PublisherLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "JournalSubTitle")
    public JAXBElement<String> createJournalSubTitle(String value) {
        return new JAXBElement<String>(_JournalSubTitle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Phone")
    public JAXBElement<String> createPhone(String value) {
        return new JAXBElement<String>(_Phone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Keyword")
    public JAXBElement<String> createKeyword(String value) {
        return new JAXBElement<String>(_Keyword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Day")
    public JAXBElement<String> createDay(String value) {
        return new JAXBElement<String>(_Day_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "apiKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createApiKey(String value) {
        return new JAXBElement<String>(_ApiKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Handle")
    public JAXBElement<String> createHandle(String value) {
        return new JAXBElement<String>(_Handle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Year")
    public JAXBElement<String> createYear(String value) {
        return new JAXBElement<String>(_Year_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleDOI")
    public JAXBElement<String> createArticleDOI(String value) {
        return new JAXBElement<String>(_ArticleDOI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssueIDEnd")
    public JAXBElement<String> createIssueIDEnd(String value) {
        return new JAXBElement<String>(_IssueIDEnd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Fax")
    public JAXBElement<String> createFax(String value) {
        return new JAXBElement<String>(_Fax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SourceType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSourceType(String value) {
        return new JAXBElement<String>(_SourceType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Location")
    public JAXBElement<String> createLocation(String value) {
        return new JAXBElement<String>(_Location_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleLastPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArticleLastPage(String value) {
        return new JAXBElement<String>(_ArticleLastPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IssueIDStart")
    public JAXBElement<String> createIssueIDStart(String value) {
        return new JAXBElement<String>(_IssueIDStart_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OrgName")
    public JAXBElement<String> createOrgName(String value) {
        return new JAXBElement<String>(_OrgName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastPage")
    public JAXBElement<String> createLastPage(String value) {
        return new JAXBElement<String>(_LastPage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pageLength")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createPageLength(Long value) {
        return new JAXBElement<Long>(_PageLength_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleSequenceNumber")
    public JAXBElement<String> createArticleSequenceNumber(String value) {
        return new JAXBElement<String>(_ArticleSequenceNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ArticleCategory")
    public JAXBElement<String> createArticleCategory(String value) {
        return new JAXBElement<String>(_ArticleCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CitationNumber")
    public JAXBElement<BigDecimal> createCitationNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CitationNumber_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "State")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Initials")
    public JAXBElement<String> createInitials(String value) {
        return new JAXBElement<String>(_Initials_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CaptionNumber")
    public JAXBElement<String> createCaptionNumber(String value) {
        return new JAXBElement<String>(_CaptionNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VolumeIssueCount")
    public JAXBElement<String> createVolumeIssueCount(String value) {
        return new JAXBElement<String>(_VolumeIssueCount_QNAME, String.class, null, value);
    }

}