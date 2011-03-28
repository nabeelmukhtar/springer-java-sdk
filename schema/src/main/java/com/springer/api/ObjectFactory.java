/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.springer.api;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3._2001.xmlschema.Adapter1;


/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {

    /** The Constant _NumberInSeries_QNAME. */
    private final static QName _NumberInSeries_QNAME = new QName("", "NumberInSeries");
    
    /** The Constant _Total_QNAME. */
    private final static QName _Total_QNAME = new QName("", "total");
    
    /** The Constant _CopyrightHolderName_QNAME. */
    private final static QName _CopyrightHolderName_QNAME = new QName("", "CopyrightHolderName");
    
    /** The Constant _Format_QNAME. */
    private final static QName _Format_QNAME = new QName("", "Format");
    
    /** The Constant _EquationNumber_QNAME. */
    private final static QName _EquationNumber_QNAME = new QName("", "EquationNumber");
    
    /** The Constant _SubjectCollection_QNAME. */
    private final static QName _SubjectCollection_QNAME = new QName("", "SubjectCollection");
    
    /** The Constant _JournalTitle_QNAME. */
    private final static QName _JournalTitle_QNAME = new QName("", "JournalTitle");
    
    /** The Constant _VolumeId_QNAME. */
    private final static QName _VolumeId_QNAME = new QName("", "VolumeId");
    
    /** The Constant _BibComments_QNAME. */
    private final static QName _BibComments_QNAME = new QName("", "BibComments");
    
    /** The Constant _FamilyName_QNAME. */
    private final static QName _FamilyName_QNAME = new QName("", "FamilyName");
    
    /** The Constant _H1_QNAME. */
    private final static QName _H1_QNAME = new QName("", "h1");
    
    /** The Constant _FirstPage_QNAME. */
    private final static QName _FirstPage_QNAME = new QName("", "FirstPage");
    
    /** The Constant _PubDate_QNAME. */
    private final static QName _PubDate_QNAME = new QName("", "PubDate");
    
    /** The Constant _PublisherName_QNAME. */
    private final static QName _PublisherName_QNAME = new QName("", "PublisherName");
    
    /** The Constant _Country_QNAME. */
    private final static QName _Country_QNAME = new QName("", "Country");
    
    /** The Constant _Color_QNAME. */
    private final static QName _Color_QNAME = new QName("", "Color");
    
    /** The Constant _ConfEventDate_QNAME. */
    private final static QName _ConfEventDate_QNAME = new QName("", "ConfEventDate");
    
    /** The Constant _DateLoaded_QNAME. */
    private final static QName _DateLoaded_QNAME = new QName("", "DateLoaded");
    
    /** The Constant _JournalAbbreviatedTitle_QNAME. */
    private final static QName _JournalAbbreviatedTitle_QNAME = new QName("", "JournalAbbreviatedTitle");
    
    /** The Constant _Email_QNAME. */
    private final static QName _Email_QNAME = new QName("", "Email");
    
    /** The Constant _Start_QNAME. */
    private final static QName _Start_QNAME = new QName("", "start");
    
    /** The Constant _VolumeID_QNAME. */
    private final static QName _VolumeID_QNAME = new QName("", "VolumeID");
    
    /** The Constant _ArticleID_QNAME. */
    private final static QName _ArticleID_QNAME = new QName("", "ArticleID");
    
    /** The Constant _Provider_QNAME. */
    private final static QName _Provider_QNAME = new QName("", "Provider");
    
    /** The Constant _ChapterId_QNAME. */
    private final static QName _ChapterId_QNAME = new QName("", "ChapterId");
    
    /** The Constant _Street_QNAME. */
    private final static QName _Street_QNAME = new QName("", "Street");
    
    /** The Constant _OrgDivision_QNAME. */
    private final static QName _OrgDivision_QNAME = new QName("", "OrgDivision");
    
    /** The Constant _Query_QNAME. */
    private final static QName _Query_QNAME = new QName("", "query");
    
    /** The Constant _Particle_QNAME. */
    private final static QName _Particle_QNAME = new QName("", "Particle");
    
    /** The Constant _JournalID_QNAME. */
    private final static QName _JournalID_QNAME = new QName("", "JournalID");
    
    /** The Constant _ConfEventLocation_QNAME. */
    private final static QName _ConfEventLocation_QNAME = new QName("", "ConfEventLocation");
    
    /** The Constant _IssueId_QNAME. */
    private final static QName _IssueId_QNAME = new QName("", "IssueId");
    
    /** The Constant _IssueArticleCount_QNAME. */
    private final static QName _IssueArticleCount_QNAME = new QName("", "IssueArticleCount");
    
    /** The Constant _VolumeIDStart_QNAME. */
    private final static QName _VolumeIDStart_QNAME = new QName("", "VolumeIDStart");
    
    /** The Constant _GivenName_QNAME. */
    private final static QName _GivenName_QNAME = new QName("", "GivenName");
    
    /** The Constant _CopyrightHolder_QNAME. */
    private final static QName _CopyrightHolder_QNAME = new QName("", "CopyrightHolder");
    
    /** The Constant _OpenAccess_QNAME. */
    private final static QName _OpenAccess_QNAME = new QName("", "OpenAccess");
    
    /** The Constant _ArticleFirstPage_QNAME. */
    private final static QName _ArticleFirstPage_QNAME = new QName("", "ArticleFirstPage");
    
    /** The Constant _ArticleURI_QNAME. */
    private final static QName _ArticleURI_QNAME = new QName("", "ArticleURI");
    
    /** The Constant _CopyrightYear_QNAME. */
    private final static QName _CopyrightYear_QNAME = new QName("", "CopyrightYear");
    
    /** The Constant _Institution_QNAME. */
    private final static QName _Institution_QNAME = new QName("", "Institution");
    
    /** The Constant _IssueID_QNAME. */
    private final static QName _IssueID_QNAME = new QName("", "IssueID");
    
    /** The Constant _City_QNAME. */
    private final static QName _City_QNAME = new QName("", "City");
    
    /** The Constant _RefSource_QNAME. */
    private final static QName _RefSource_QNAME = new QName("", "RefSource");
    
    /** The Constant _PublisherURL_QNAME. */
    private final static QName _PublisherURL_QNAME = new QName("", "PublisherURL");
    
    /** The Constant _BookTitleId_QNAME. */
    private final static QName _BookTitleId_QNAME = new QName("", "BookTitleId");
    
    /** The Constant _ImageType_QNAME. */
    private final static QName _ImageType_QNAME = new QName("", "ImageType");
    
    /** The Constant _SourceTitle_QNAME. */
    private final static QName _SourceTitle_QNAME = new QName("", "SourceTitle");
    
    /** The Constant _PricelistYear_QNAME. */
    private final static QName _PricelistYear_QNAME = new QName("", "PricelistYear");
    
    /** The Constant _DOI_QNAME. */
    private final static QName _DOI_QNAME = new QName("", "DOI");
    
    /** The Constant _JournalSPIN_QNAME. */
    private final static QName _JournalSPIN_QNAME = new QName("", "JournalSPIN");
    
    /** The Constant _Month_QNAME. */
    private final static QName _Month_QNAME = new QName("", "Month");
    
    /** The Constant _BookTitle_QNAME. */
    private final static QName _BookTitle_QNAME = new QName("", "BookTitle");
    
    /** The Constant _JournalPrintISSN_QNAME. */
    private final static QName _JournalPrintISSN_QNAME = new QName("", "JournalPrintISSN");
    
    /** The Constant _BookDOI_QNAME. */
    private final static QName _BookDOI_QNAME = new QName("", "BookDOI");
    
    /** The Constant _VolumeIDEnd_QNAME. */
    private final static QName _VolumeIDEnd_QNAME = new QName("", "VolumeIDEnd");
    
    /** The Constant _JournalId_QNAME. */
    private final static QName _JournalId_QNAME = new QName("", "JournalId");
    
    /** The Constant _InlineMediaObject_QNAME. */
    private final static QName _InlineMediaObject_QNAME = new QName("", "InlineMediaObject");
    
    /** The Constant _Postcode_QNAME. */
    private final static QName _Postcode_QNAME = new QName("", "Postcode");
    
    /** The Constant _JournalElectronicISSN_QNAME. */
    private final static QName _JournalElectronicISSN_QNAME = new QName("", "JournalElectronicISSN");
    
    /** The Constant _PublisherLocation_QNAME. */
    private final static QName _PublisherLocation_QNAME = new QName("", "PublisherLocation");
    
    /** The Constant _JournalSubTitle_QNAME. */
    private final static QName _JournalSubTitle_QNAME = new QName("", "JournalSubTitle");
    
    /** The Constant _Phone_QNAME. */
    private final static QName _Phone_QNAME = new QName("", "Phone");
    
    /** The Constant _Keyword_QNAME. */
    private final static QName _Keyword_QNAME = new QName("", "Keyword");
    
    /** The Constant _Type_QNAME. */
    private final static QName _Type_QNAME = new QName("", "Type");
    
    /** The Constant _Day_QNAME. */
    private final static QName _Day_QNAME = new QName("", "Day");
    
    /** The Constant _ApiKey_QNAME. */
    private final static QName _ApiKey_QNAME = new QName("", "apiKey");
    
    /** The Constant _Handle_QNAME. */
    private final static QName _Handle_QNAME = new QName("", "Handle");
    
    /** The Constant _Year_QNAME. */
    private final static QName _Year_QNAME = new QName("", "Year");
    
    /** The Constant _ArticleDOI_QNAME. */
    private final static QName _ArticleDOI_QNAME = new QName("", "ArticleDOI");
    
    /** The Constant _IssueIDEnd_QNAME. */
    private final static QName _IssueIDEnd_QNAME = new QName("", "IssueIDEnd");
    
    /** The Constant _Fax_QNAME. */
    private final static QName _Fax_QNAME = new QName("", "Fax");
    
    /** The Constant _SourceType_QNAME. */
    private final static QName _SourceType_QNAME = new QName("", "SourceType");
    
    /** The Constant _Location_QNAME. */
    private final static QName _Location_QNAME = new QName("", "Location");
    
    /** The Constant _ArticleLastPage_QNAME. */
    private final static QName _ArticleLastPage_QNAME = new QName("", "ArticleLastPage");
    
    /** The Constant _IssueIDStart_QNAME. */
    private final static QName _IssueIDStart_QNAME = new QName("", "IssueIDStart");
    
    /** The Constant _OrgName_QNAME. */
    private final static QName _OrgName_QNAME = new QName("", "OrgName");
    
    /** The Constant _LastPage_QNAME. */
    private final static QName _LastPage_QNAME = new QName("", "LastPage");
    
    /** The Constant _PageLength_QNAME. */
    private final static QName _PageLength_QNAME = new QName("", "pageLength");
    
    /** The Constant _ArticleSequenceNumber_QNAME. */
    private final static QName _ArticleSequenceNumber_QNAME = new QName("", "ArticleSequenceNumber");
    
    /** The Constant _ArticleCategory_QNAME. */
    private final static QName _ArticleCategory_QNAME = new QName("", "ArticleCategory");
    
    /** The Constant _CitationNumber_QNAME. */
    private final static QName _CitationNumber_QNAME = new QName("", "CitationNumber");
    
    /** The Constant _State_QNAME. */
    private final static QName _State_QNAME = new QName("", "State");
    
    /** The Constant _Initials_QNAME. */
    private final static QName _Initials_QNAME = new QName("", "Initials");
    
    /** The Constant _CaptionNumber_QNAME. */
    private final static QName _CaptionNumber_QNAME = new QName("", "CaptionNumber");
    
    /** The Constant _VolumeIssueCount_QNAME. */
    private final static QName _VolumeIssueCount_QNAME = new QName("", "VolumeIssueCount");

    /**
     * Instantiates a new object factory.
     */
    public ObjectFactory() {
    }

    /**
     * Creates a new Object object.
     * 
     * @return the journal info
     */
    public JournalInfo createJournalInfo() {
        return new JournalInfo();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the publisher info
     */
    public PublisherInfo createPublisherInfo() {
        return new PublisherInfo();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article header
     */
    public ArticleHeader createArticleHeader() {
        return new ArticleHeader();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the journal subject
     */
    public JournalSubject createJournalSubject() {
        return new JournalSubject();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the volume
     */
    public Volume createVolume() {
        return new Volume();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article editorial responsibility
     */
    public ArticleEditorialResponsibility createArticleEditorialResponsibility() {
        return new ArticleEditorialResponsibility();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the org address
     */
    public OrgAddress createOrgAddress() {
        return new OrgAddress();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the tgroup
     */
    public Tgroup createTgroup() {
        return new Tgroup();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article title
     */
    public ArticleTitle createArticleTitle() {
        return new ArticleTitle();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the figure
     */
    public Figure createFigure() {
        return new Figure();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the acknowledgments
     */
    public Acknowledgments createAcknowledgments() {
        return new Acknowledgments();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the colspec
     */
    public Colspec createColspec() {
        return new Colspec();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the subject
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the issue
     */
    public Issue createIssue() {
        return new Issue();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the journal
     */
    public Journal createJournal() {
        return new Journal();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the external ref
     */
    public ExternalRef createExternalRef() {
        return new ExternalRef();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article context
     */
    public ArticleContext createArticleContext() {
        return new ArticleContext();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the keyword group
     */
    public KeywordGroup createKeywordGroup() {
        return new KeywordGroup();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the keywords
     */
    public Keywords createKeywords() {
        return new Keywords();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the image object element
     */
    public ImageObjectElement createImageObjectElement() {
        return new ImageObjectElement();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article history
     */
    public ArticleHistory createArticleHistory() {
        return new ArticleHistory();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the ISXN
     */
    public ISXN createISXN() {
        return new ISXN();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the definition list
     */
    public DefinitionList createDefinitionList() {
        return new DefinitionList();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the body pdf grant
     */
    public BodyPDFGrant createBodyPDFGrant() {
        return new BodyPDFGrant();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the thead
     */
    public Thead createThead() {
        return new Thead();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the issue history
     */
    public IssueHistory createIssueHistory() {
        return new IssueHistory();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the author name
     */
    public AuthorName createAuthorName() {
        return new AuthorName();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the tbody
     */
    public Tbody createTbody() {
        return new Tbody();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the description
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the institutions
     */
    public Institutions createInstitutions() {
        return new Institutions();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the metadata grant
     */
    public MetadataGrant createMetadataGrant() {
        return new MetadataGrant();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the para
     */
    public Para createPara() {
        return new Para();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the response
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bibliography
     */
    public Bibliography createBibliography() {
        return new Bibliography();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the biography
     */
    public Biography createBiography() {
        return new Biography();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the body ref
     */
    public BodyRef createBodyRef() {
        return new BodyRef();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the section2
     */
    public Section2 createSection2() {
        return new Section2();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the journal online first
     */
    public JournalOnlineFirst createJournalOnlineFirst() {
        return new JournalOnlineFirst();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the citation ref
     */
    public CitationRef createCitationRef() {
        return new CitationRef();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the record
     */
    public Record createRecord() {
        return new Record();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bib article
     */
    public BibArticle createBibArticle() {
        return new BibArticle();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the received
     */
    public Received createReceived() {
        return new Received();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bib author name
     */
    public BibAuthorName createBibAuthorName() {
        return new BibAuthorName();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the facet value
     */
    public FacetValue createFacetValue() {
        return new FacetValue();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the body
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the revised
     */
    public Revised createRevised() {
        return new Revised();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the publisher
     */
    public Publisher createPublisher() {
        return new Publisher();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the formal para
     */
    public FormalPara createFormalPara() {
        return new FormalPara();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the author
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bibliography grant
     */
    public BibliographyGrant createBibliographyGrant() {
        return new BibliographyGrant();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the P
     */
    public P createP() {
        return new P();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the abstract grant
     */
    public AbstractGrant createAbstractGrant() {
        return new AbstractGrant();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the body html grant
     */
    public BodyHTMLGrant createBodyHTMLGrant() {
        return new BodyHTMLGrant();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the ref target
     */
    public RefTarget createRefTarget() {
        return new RefTarget();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article backmatter
     */
    public ArticleBackmatter createArticleBackmatter() {
        return new ArticleBackmatter();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the accepted
     */
    public Accepted createAccepted() {
        return new Accepted();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the simple para
     */
    public SimplePara createSimplePara() {
        return new SimplePara();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the row
     */
    public Row createRow() {
        return new Row();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the abstract section
     */
    public AbstractSection createAbstractSection() {
        return new AbstractSection();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the result
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the volume info
     */
    public VolumeInfo createVolumeInfo() {
        return new VolumeInfo();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the issue copyright
     */
    public IssueCopyright createIssueCopyright() {
        return new IssueCopyright();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the emphasis
     */
    public Emphasis createEmphasis() {
        return new Emphasis();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the registration date
     */
    public RegistrationDate createRegistrationDate() {
        return new RegistrationDate();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the section3
     */
    public Section3 createSection3() {
        return new Section3();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the superscript
     */
    public Superscript createSuperscript() {
        return new Superscript();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the abstract
     */
    public Abstract createAbstract() {
        return new Abstract();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the footnote
     */
    public Footnote createFootnote() {
        return new Footnote();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the term
     */
    public Term createTerm() {
        return new Term();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the journal subject group
     */
    public JournalSubjectGroup createJournalSubjectGroup() {
        return new JournalSubjectGroup();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the file
     */
    public File createFile() {
        return new File();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the subscript
     */
    public Subscript createSubscript() {
        return new Subscript();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the facets
     */
    public Facets createFacets() {
        return new Facets();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the caption content
     */
    public CaptionContent createCaptionContent() {
        return new CaptionContent();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article sub title
     */
    public ArticleSubTitle createArticleSubTitle() {
        return new ArticleSubTitle();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the media object
     */
    public MediaObject createMediaObject() {
        return new MediaObject();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the text object
     */
    public TextObject createTextObject() {
        return new TextObject();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the equation
     */
    public Equation createEquation() {
        return new Equation();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the authors
     */
    public Authors createAuthors() {
        return new Authors();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the author group
     */
    public AuthorGroup createAuthorGroup() {
        return new AuthorGroup();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the image object
     */
    public ImageObject createImageObject() {
        return new ImageObject();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bib book
     */
    public BibBook createBibBook() {
        return new BibBook();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the path
     */
    public Path createPath() {
        return new Path();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the affiliation
     */
    public Affiliation createAffiliation() {
        return new Affiliation();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the subjects
     */
    public Subjects createSubjects() {
        return new Subjects();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the entry
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article copyright
     */
    public ArticleCopyright createArticleCopyright() {
        return new ArticleCopyright();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the internal ref
     */
    public InternalRef createInternalRef() {
        return new InternalRef();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the section1
     */
    public Section1 createSection1() {
        return new Section1();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the tfooter
     */
    public Tfooter createTfooter() {
        return new Tfooter();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the table
     */
    public Table createTable() {
        return new Table();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the full text
     */
    public FullText createFullText() {
        return new FullText();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the citation
     */
    public Citation createCitation() {
        return new Citation();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the image
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the inline equation
     */
    public InlineEquation createInlineEquation() {
        return new InlineEquation();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the contact
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the issue info
     */
    public IssueInfo createIssueInfo() {
        return new IssueInfo();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bib unstructured
     */
    public BibUnstructured createBibUnstructured() {
        return new BibUnstructured();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the ESM grant
     */
    public ESMGrant createESMGrant() {
        return new ESMGrant();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the equation source
     */
    public EquationSource createEquationSource() {
        return new EquationSource();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the prints the date
     */
    public PrintDate createPrintDate() {
        return new PrintDate();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the cover date
     */
    public CoverDate createCoverDate() {
        return new CoverDate();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the facet
     */
    public Facet createFacet() {
        return new Facet();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article grants
     */
    public ArticleGrants createArticleGrants() {
        return new ArticleGrants();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the occurrence
     */
    public Occurrence createOccurrence() {
        return new Occurrence();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the chapter title
     */
    public ChapterTitle createChapterTitle() {
        return new ChapterTitle();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the records
     */
    public Records createRecords() {
        return new Records();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the section4
     */
    public Section4 createSection4() {
        return new Section4();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article info
     */
    public ArticleInfo createArticleInfo() {
        return new ArticleInfo();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bib chapter
     */
    public BibChapter createBibChapter() {
        return new BibChapter();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the images
     */
    public Images createImages() {
        return new Images();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the definition list entry
     */
    public DefinitionListEntry createDefinitionListEntry() {
        return new DefinitionListEntry();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the heading
     */
    public Heading createHeading() {
        return new Heading();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the caption
     */
    public Caption createCaption() {
        return new Caption();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the online date
     */
    public OnlineDate createOnlineDate() {
        return new OnlineDate();
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "NumberInSeries")
    public JAXBElement<String> createNumberInSeries(String value) {
        return new JAXBElement<String>(_NumberInSeries_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "total")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createTotal(Long value) {
        return new JAXBElement<Long>(_Total_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "CopyrightHolderName")
    public JAXBElement<String> createCopyrightHolderName(String value) {
        return new JAXBElement<String>(_CopyrightHolderName_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Format")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFormat(String value) {
        return new JAXBElement<String>(_Format_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "EquationNumber")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createEquationNumber(Long value) {
        return new JAXBElement<Long>(_EquationNumber_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "SubjectCollection")
    public JAXBElement<String> createSubjectCollection(String value) {
        return new JAXBElement<String>(_SubjectCollection_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "JournalTitle")
    public JAXBElement<String> createJournalTitle(String value) {
        return new JAXBElement<String>(_JournalTitle_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "VolumeId")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createVolumeId(Long value) {
        return new JAXBElement<Long>(_VolumeId_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "BibComments")
    public JAXBElement<String> createBibComments(String value) {
        return new JAXBElement<String>(_BibComments_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "FamilyName")
    public JAXBElement<String> createFamilyName(String value) {
        return new JAXBElement<String>(_FamilyName_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "h1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createH1(String value) {
        return new JAXBElement<String>(_H1_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "FirstPage")
    public JAXBElement<String> createFirstPage(String value) {
        return new JAXBElement<String>(_FirstPage_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "PubDate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPubDate(String value) {
        return new JAXBElement<String>(_PubDate_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "PublisherName")
    public JAXBElement<String> createPublisherName(String value) {
        return new JAXBElement<String>(_PublisherName_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Country")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< boolean>
     */
    @XmlElementDecl(namespace = "", name = "Color")
    public JAXBElement<Boolean> createColor(Boolean value) {
        return new JAXBElement<Boolean>(_Color_QNAME, Boolean.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "ConfEventDate")
    public JAXBElement<String> createConfEventDate(String value) {
        return new JAXBElement<String>(_ConfEventDate_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< xml gregorian calendar>
     */
    @XmlElementDecl(namespace = "", name = "DateLoaded")
    public JAXBElement<XMLGregorianCalendar> createDateLoaded(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateLoaded_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "JournalAbbreviatedTitle")
    public JAXBElement<String> createJournalAbbreviatedTitle(String value) {
        return new JAXBElement<String>(_JournalAbbreviatedTitle_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "start")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createStart(Long value) {
        return new JAXBElement<Long>(_Start_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "VolumeID")
    public JAXBElement<String> createVolumeID(String value) {
        return new JAXBElement<String>(_VolumeID_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "ArticleID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArticleID(String value) {
        return new JAXBElement<String>(_ArticleID_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Provider")
    public JAXBElement<String> createProvider(String value) {
        return new JAXBElement<String>(_Provider_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "ChapterId")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createChapterId(Long value) {
        return new JAXBElement<Long>(_ChapterId_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Street")
    public JAXBElement<String> createStreet(String value) {
        return new JAXBElement<String>(_Street_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "OrgDivision")
    public JAXBElement<String> createOrgDivision(String value) {
        return new JAXBElement<String>(_OrgDivision_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "query")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createQuery(String value) {
        return new JAXBElement<String>(_Query_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Particle")
    public JAXBElement<String> createParticle(String value) {
        return new JAXBElement<String>(_Particle_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "JournalID")
    public JAXBElement<String> createJournalID(String value) {
        return new JAXBElement<String>(_JournalID_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "ConfEventLocation")
    public JAXBElement<String> createConfEventLocation(String value) {
        return new JAXBElement<String>(_ConfEventLocation_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "IssueId")
    public JAXBElement<String> createIssueId(String value) {
        return new JAXBElement<String>(_IssueId_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "IssueArticleCount")
    public JAXBElement<String> createIssueArticleCount(String value) {
        return new JAXBElement<String>(_IssueArticleCount_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "VolumeIDStart")
    public JAXBElement<String> createVolumeIDStart(String value) {
        return new JAXBElement<String>(_VolumeIDStart_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "GivenName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGivenName(String value) {
        return new JAXBElement<String>(_GivenName_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "CopyrightHolder")
    public JAXBElement<String> createCopyrightHolder(String value) {
        return new JAXBElement<String>(_CopyrightHolder_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< boolean>
     */
    @XmlElementDecl(namespace = "", name = "OpenAccess")
    public JAXBElement<Boolean> createOpenAccess(Boolean value) {
        return new JAXBElement<Boolean>(_OpenAccess_QNAME, Boolean.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "ArticleFirstPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArticleFirstPage(String value) {
        return new JAXBElement<String>(_ArticleFirstPage_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "ArticleURI")
    public JAXBElement<String> createArticleURI(String value) {
        return new JAXBElement<String>(_ArticleURI_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "CopyrightYear")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createCopyrightYear(Long value) {
        return new JAXBElement<Long>(_CopyrightYear_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Institution")
    public JAXBElement<String> createInstitution(String value) {
        return new JAXBElement<String>(_Institution_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "IssueID")
    public JAXBElement<String> createIssueID(String value) {
        return new JAXBElement<String>(_IssueID_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "City")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "RefSource")
    public JAXBElement<String> createRefSource(String value) {
        return new JAXBElement<String>(_RefSource_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "PublisherURL")
    public JAXBElement<String> createPublisherURL(String value) {
        return new JAXBElement<String>(_PublisherURL_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "BookTitleId")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createBookTitleId(Long value) {
        return new JAXBElement<Long>(_BookTitleId_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "ImageType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createImageType(String value) {
        return new JAXBElement<String>(_ImageType_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "SourceTitle")
    public JAXBElement<String> createSourceTitle(String value) {
        return new JAXBElement<String>(_SourceTitle_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "PricelistYear")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createPricelistYear(Long value) {
        return new JAXBElement<Long>(_PricelistYear_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "DOI")
    public JAXBElement<String> createDOI(String value) {
        return new JAXBElement<String>(_DOI_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "JournalSPIN")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createJournalSPIN(Long value) {
        return new JAXBElement<Long>(_JournalSPIN_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Month")
    public JAXBElement<String> createMonth(String value) {
        return new JAXBElement<String>(_Month_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "BookTitle")
    public JAXBElement<String> createBookTitle(String value) {
        return new JAXBElement<String>(_BookTitle_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "JournalPrintISSN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJournalPrintISSN(String value) {
        return new JAXBElement<String>(_JournalPrintISSN_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "BookDOI")
    public JAXBElement<String> createBookDOI(String value) {
        return new JAXBElement<String>(_BookDOI_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "VolumeIDEnd")
    public JAXBElement<String> createVolumeIDEnd(String value) {
        return new JAXBElement<String>(_VolumeIDEnd_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "JournalId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJournalId(String value) {
        return new JAXBElement<String>(_JournalId_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< image object>
     */
    @XmlElementDecl(namespace = "", name = "InlineMediaObject")
    public JAXBElement<ImageObject> createInlineMediaObject(ImageObject value) {
        return new JAXBElement<ImageObject>(_InlineMediaObject_QNAME, ImageObject.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Postcode")
    public JAXBElement<String> createPostcode(String value) {
        return new JAXBElement<String>(_Postcode_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "JournalElectronicISSN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJournalElectronicISSN(String value) {
        return new JAXBElement<String>(_JournalElectronicISSN_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "PublisherLocation")
    public JAXBElement<String> createPublisherLocation(String value) {
        return new JAXBElement<String>(_PublisherLocation_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "JournalSubTitle")
    public JAXBElement<String> createJournalSubTitle(String value) {
        return new JAXBElement<String>(_JournalSubTitle_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Phone")
    public JAXBElement<String> createPhone(String value) {
        return new JAXBElement<String>(_Phone_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Keyword")
    public JAXBElement<String> createKeyword(String value) {
        return new JAXBElement<String>(_Keyword_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Day")
    public JAXBElement<String> createDay(String value) {
        return new JAXBElement<String>(_Day_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "apiKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createApiKey(String value) {
        return new JAXBElement<String>(_ApiKey_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Handle")
    public JAXBElement<String> createHandle(String value) {
        return new JAXBElement<String>(_Handle_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Year")
    public JAXBElement<String> createYear(String value) {
        return new JAXBElement<String>(_Year_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "ArticleDOI")
    public JAXBElement<String> createArticleDOI(String value) {
        return new JAXBElement<String>(_ArticleDOI_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "IssueIDEnd")
    public JAXBElement<String> createIssueIDEnd(String value) {
        return new JAXBElement<String>(_IssueIDEnd_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Fax")
    public JAXBElement<String> createFax(String value) {
        return new JAXBElement<String>(_Fax_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "SourceType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSourceType(String value) {
        return new JAXBElement<String>(_SourceType_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Location")
    public JAXBElement<String> createLocation(String value) {
        return new JAXBElement<String>(_Location_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "ArticleLastPage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArticleLastPage(String value) {
        return new JAXBElement<String>(_ArticleLastPage_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "IssueIDStart")
    public JAXBElement<String> createIssueIDStart(String value) {
        return new JAXBElement<String>(_IssueIDStart_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "OrgName")
    public JAXBElement<String> createOrgName(String value) {
        return new JAXBElement<String>(_OrgName_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "LastPage")
    public JAXBElement<String> createLastPage(String value) {
        return new JAXBElement<String>(_LastPage_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "pageLength")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Long> createPageLength(Long value) {
        return new JAXBElement<Long>(_PageLength_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "ArticleSequenceNumber")
    public JAXBElement<String> createArticleSequenceNumber(String value) {
        return new JAXBElement<String>(_ArticleSequenceNumber_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "ArticleCategory")
    public JAXBElement<String> createArticleCategory(String value) {
        return new JAXBElement<String>(_ArticleCategory_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< big decimal>
     */
    @XmlElementDecl(namespace = "", name = "CitationNumber")
    public JAXBElement<BigDecimal> createCitationNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CitationNumber_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "State")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Initials")
    public JAXBElement<String> createInitials(String value) {
        return new JAXBElement<String>(_Initials_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "CaptionNumber")
    public JAXBElement<String> createCaptionNumber(String value) {
        return new JAXBElement<String>(_CaptionNumber_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "VolumeIssueCount")
    public JAXBElement<String> createVolumeIssueCount(String value) {
        return new JAXBElement<String>(_VolumeIssueCount_QNAME, String.class, null, value);
    }

}
