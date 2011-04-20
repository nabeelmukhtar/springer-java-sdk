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

package com.springer.api.schema.xpp;

import java.util.Date;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

import org.w3._1999.xhtml.P;
import org.w3._1999.xhtml.impl.PImpl;
import org.w3._2001.xmlschema.Adapter1;
import org.w3._2001.xmlschema.Adapter2;

import com.springer.api.schema.*;


/**
 * A factory for creating Object objects.
 */
@XmlRegistry
public class ObjectFactory {

    /** The Constant _CopyrightHolderName_QNAME. */
    private final static QName _CopyrightHolderName_QNAME = new QName("", "CopyrightHolderName");
    
    /** The Constant _Total_QNAME. */
    private final static QName _Total_QNAME = new QName("", "total");
    
    /** The Constant _NumberInSeries_QNAME. */
    private final static QName _NumberInSeries_QNAME = new QName("", "NumberInSeries");
    
    /** The Constant _Format_QNAME. */
    private final static QName _Format_QNAME = new QName("", "Format");
    
    /** The Constant _EquationNumber_QNAME. */
    private final static QName _EquationNumber_QNAME = new QName("", "EquationNumber");
    
    /** The Constant _JournalTitle_QNAME. */
    private final static QName _JournalTitle_QNAME = new QName("", "JournalTitle");
    
    /** The Constant _BookPrintISBN_QNAME. */
    private final static QName _BookPrintISBN_QNAME = new QName("", "BookPrintISBN");
    
    /** The Constant _BookSequenceNumber_QNAME. */
    private final static QName _BookSequenceNumber_QNAME = new QName("", "BookSequenceNumber");
    
    /** The Constant _VolumeId_QNAME. */
    private final static QName _VolumeId_QNAME = new QName("", "VolumeId");
    
    /** The Constant _BookTitleID_QNAME. */
    private final static QName _BookTitleID_QNAME = new QName("", "BookTitleID");
    
    /** The Constant _InstitutionalAuthorName_QNAME. */
    private final static QName _InstitutionalAuthorName_QNAME = new QName("", "InstitutionalAuthorName");
    
    /** The Constant _BibComments_QNAME. */
    private final static QName _BibComments_QNAME = new QName("", "BibComments");
    
    /** The Constant _FamilyName_QNAME. */
    private final static QName _FamilyName_QNAME = new QName("", "FamilyName");
    
    /** The Constant _H1_QNAME. */
    private final static QName _H1_QNAME = new QName("", "h1");
    
    /** The Constant _ChapterID_QNAME. */
    private final static QName _ChapterID_QNAME = new QName("", "ChapterID");
    
    /** The Constant _FirstPage_QNAME. */
    private final static QName _FirstPage_QNAME = new QName("", "FirstPage");
    
    /** The Constant _PubDate_QNAME. */
    private final static QName _PubDate_QNAME = new QName("", "PubDate");
    
    /** The Constant _PublisherName_QNAME. */
    private final static QName _PublisherName_QNAME = new QName("", "PublisherName");
    
    /** The Constant _APPId_QNAME. */
    private final static QName _APPId_QNAME = new QName("", "APPId");
    
    /** The Constant _Country_QNAME. */
    private final static QName _Country_QNAME = new QName("", "Country");
    
    /** The Constant _Color_QNAME. */
    private final static QName _Color_QNAME = new QName("", "Color");
    
    /** The Constant _ConfEventDate_QNAME. */
    private final static QName _ConfEventDate_QNAME = new QName("", "ConfEventDate");
    
    /** The Constant _DateLoaded_QNAME. */
    private final static QName _DateLoaded_QNAME = new QName("", "DateLoaded");
    
    /** The Constant _Email_QNAME. */
    private final static QName _Email_QNAME = new QName("", "Email");
    
    /** The Constant _JournalAbbreviatedTitle_QNAME. */
    private final static QName _JournalAbbreviatedTitle_QNAME = new QName("", "JournalAbbreviatedTitle");
    
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
    
    /** The Constant _VolumeIDStart_QNAME. */
    private final static QName _VolumeIDStart_QNAME = new QName("", "VolumeIDStart");
    
    /** The Constant _IssueArticleCount_QNAME. */
    private final static QName _IssueArticleCount_QNAME = new QName("", "IssueArticleCount");
    
    /** The Constant _GivenName_QNAME. */
    private final static QName _GivenName_QNAME = new QName("", "GivenName");
    
    /** The Constant _ChapterLastPage_QNAME. */
    private final static QName _ChapterLastPage_QNAME = new QName("", "ChapterLastPage");
    
    /** The Constant _CopyrightHolder_QNAME. */
    private final static QName _CopyrightHolder_QNAME = new QName("", "CopyrightHolder");
    
    /** The Constant _OpenAccess_QNAME. */
    private final static QName _OpenAccess_QNAME = new QName("", "OpenAccess");
    
    /** The Constant _URL_QNAME. */
    private final static QName _URL_QNAME = new QName("", "URL");
    
    /** The Constant _ArticleFirstPage_QNAME. */
    private final static QName _ArticleFirstPage_QNAME = new QName("", "ArticleFirstPage");
    
    /** The Constant _BookChapterCount_QNAME. */
    private final static QName _BookChapterCount_QNAME = new QName("", "BookChapterCount");
    
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
    
    /** The Constant _BookID_QNAME. */
    private final static QName _BookID_QNAME = new QName("", "BookID");
    
    /** The Constant _BookElectronicISBN_QNAME. */
    private final static QName _BookElectronicISBN_QNAME = new QName("", "BookElectronicISBN");
    
    /** The Constant _IssueHeader_QNAME. */
    private final static QName _IssueHeader_QNAME = new QName("", "IssueHeader");
    
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
    
    /** The Constant _Month_QNAME. */
    private final static QName _Month_QNAME = new QName("", "Month");
    
    /** The Constant _JournalSPIN_QNAME. */
    private final static QName _JournalSPIN_QNAME = new QName("", "JournalSPIN");
    
    /** The Constant _JournalPrintISSN_QNAME. */
    private final static QName _JournalPrintISSN_QNAME = new QName("", "JournalPrintISSN");
    
    /** The Constant _BookContext_QNAME. */
    private final static QName _BookContext_QNAME = new QName("", "BookContext");
    
    /** The Constant _BookDOI_QNAME. */
    private final static QName _BookDOI_QNAME = new QName("", "BookDOI");
    
    /** The Constant _VolumeIDEnd_QNAME. */
    private final static QName _VolumeIDEnd_QNAME = new QName("", "VolumeIDEnd");
    
    /** The Constant _SeriesID_QNAME. */
    private final static QName _SeriesID_QNAME = new QName("", "SeriesID");
    
    /** The Constant _JournalId_QNAME. */
    private final static QName _JournalId_QNAME = new QName("", "JournalId");
    
    /** The Constant _SeriesAbbreviatedTitle_QNAME. */
    private final static QName _SeriesAbbreviatedTitle_QNAME = new QName("", "SeriesAbbreviatedTitle");
    
    /** The Constant _InlineMediaObject_QNAME. */
    private final static QName _InlineMediaObject_QNAME = new QName("", "InlineMediaObject");
    
    /** The Constant _Postcode_QNAME. */
    private final static QName _Postcode_QNAME = new QName("", "Postcode");
    
    /** The Constant _JournalElectronicISSN_QNAME. */
    private final static QName _JournalElectronicISSN_QNAME = new QName("", "JournalElectronicISSN");
    
    /** The Constant _PublisherLocation_QNAME. */
    private final static QName _PublisherLocation_QNAME = new QName("", "PublisherLocation");
    
    /** The Constant _Phone_QNAME. */
    private final static QName _Phone_QNAME = new QName("", "Phone");
    
    /** The Constant _JournalSubTitle_QNAME. */
    private final static QName _JournalSubTitle_QNAME = new QName("", "JournalSubTitle");
    
    /** The Constant _Keyword_QNAME. */
    private final static QName _Keyword_QNAME = new QName("", "Keyword");
    
    /** The Constant _Type_QNAME. */
    private final static QName _Type_QNAME = new QName("", "Type");
    
    /** The Constant _ChapterSequenceNumber_QNAME. */
    private final static QName _ChapterSequenceNumber_QNAME = new QName("", "ChapterSequenceNumber");
    
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
    
    /** The Constant _ChapterDOI_QNAME. */
    private final static QName _ChapterDOI_QNAME = new QName("", "ChapterDOI");
    
    /** The Constant _IssueIDEnd_QNAME. */
    private final static QName _IssueIDEnd_QNAME = new QName("", "IssueIDEnd");
    
    /** The Constant _SourceType_QNAME. */
    private final static QName _SourceType_QNAME = new QName("", "SourceType");
    
    /** The Constant _Fax_QNAME. */
    private final static QName _Fax_QNAME = new QName("", "Fax");
    
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
    
    /** The Constant _ChapterFirstPage_QNAME. */
    private final static QName _ChapterFirstPage_QNAME = new QName("", "ChapterFirstPage");
    
    /** The Constant _CitationNumber_QNAME. */
    private final static QName _CitationNumber_QNAME = new QName("", "CitationNumber");
    
    /** The Constant _State_QNAME. */
    private final static QName _State_QNAME = new QName("", "State");
    
    /** The Constant _Initials_QNAME. */
    private final static QName _Initials_QNAME = new QName("", "Initials");
    
    /** The Constant _BookHeader_QNAME. */
    private final static QName _BookHeader_QNAME = new QName("", "BookHeader");
    
    /** The Constant _CaptionNumber_QNAME. */
    private final static QName _CaptionNumber_QNAME = new QName("", "CaptionNumber");
    
    /** The Constant _ItemNumber_QNAME. */
    private final static QName _ItemNumber_QNAME = new QName("", "ItemNumber");
    
    /** The Constant _Postbox_QNAME. */
    private final static QName _Postbox_QNAME = new QName("", "Postbox");
    
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
     * @return the received impl
     */
    public ReceivedImpl createReceived() {
        return new ReceivedImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the image object element impl
     */
    public ImageObjectElementImpl createImageObjectElement() {
        return new ImageObjectElementImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the editor group impl
     */
    public EditorGroupImpl createEditorGroup() {
        return new EditorGroupImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the section3 impl
     */
    public Section3Impl createSection3() {
        return new Section3Impl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the chapter info impl
     */
    public ChapterInfoImpl createChapterInfo() {
        return new ChapterInfoImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the body pdf grant impl
     */
    public BodyPDFGrantImpl createBodyPDFGrant() {
        return new BodyPDFGrantImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the prints the date impl
     */
    public PrintDateImpl createPrintDate() {
        return new PrintDateImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the ESM grant impl
     */
    public ESMGrantImpl createESMGrant() {
        return new ESMGrantImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the book title impl
     */
    public BookTitleImpl createBookTitle() {
        return new BookTitleImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the series impl
     */
    public SeriesImpl createSeries() {
        return new SeriesImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the colspec impl
     */
    public ColspecImpl createColspec() {
        return new ColspecImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the list item impl
     */
    public ListItemImpl createListItem() {
        return new ListItemImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the external ref impl
     */
    public ExternalRefImpl createExternalRef() {
        return new ExternalRefImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the description impl
     */
    public DescriptionImpl createDescription() {
        return new DescriptionImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the definition list impl
     */
    public DefinitionListImpl createDefinitionList() {
        return new DefinitionListImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the affiliation impl
     */
    public AffiliationImpl createAffiliation() {
        return new AffiliationImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the issue impl
     */
    public IssueImpl createIssue() {
        return new IssueImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the journal impl
     */
    public JournalImpl createJournal() {
        return new JournalImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the journal subject impl
     */
    public JournalSubjectImpl createJournalSubject() {
        return new JournalSubjectImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the image impl
     */
    public ImageImpl createImage() {
        return new ImageImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the file impl
     */
    public FileImpl createFile() {
        return new FileImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the text object impl
     */
    public TextObjectImpl createTextObject() {
        return new TextObjectImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article backmatter impl
     */
    public ArticleBackmatterImpl createArticleBackmatter() {
        return new ArticleBackmatterImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the tgroup impl
     */
    public TgroupImpl createTgroup() {
        return new TgroupImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bib chapter impl
     */
    public BibChapterImpl createBibChapter() {
        return new BibChapterImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the online date impl
     */
    public OnlineDateImpl createOnlineDate() {
        return new OnlineDateImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the subject collection impl
     */
    public SubjectCollectionImpl createSubjectCollection() {
        return new SubjectCollectionImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the figure impl
     */
    public FigureImpl createFigure() {
        return new FigureImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the body html grant impl
     */
    public BodyHTMLGrantImpl createBodyHTMLGrant() {
        return new BodyHTMLGrantImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the entry impl
     */
    public EntryImpl createEntry() {
        return new EntryImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the unordered list impl
     */
    public UnorderedListImpl createUnorderedList() {
        return new UnorderedListImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article header impl
     */
    public ArticleHeaderImpl createArticleHeader() {
        return new ArticleHeaderImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the chapter title impl
     */
    public ChapterTitleImpl createChapterTitle() {
        return new ChapterTitleImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the keywords impl
     */
    public KeywordsImpl createKeywords() {
        return new KeywordsImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the acknowledgments impl
     */
    public AcknowledgmentsImpl createAcknowledgments() {
        return new AcknowledgmentsImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the internal ref impl
     */
    public InternalRefImpl createInternalRef() {
        return new InternalRefImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the heading impl
     */
    public HeadingImpl createHeading() {
        return new HeadingImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the editor name impl
     */
    public EditorNameImpl createEditorName() {
        return new EditorNameImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the subject impl
     */
    public SubjectImpl createSubject() {
        return new SubjectImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the thead impl
     */
    public TheadImpl createThead() {
        return new TheadImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the caption content impl
     */
    public CaptionContentImpl createCaptionContent() {
        return new CaptionContentImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article note impl
     */
    public ArticleNoteImpl createArticleNote() {
        return new ArticleNoteImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the facet value impl
     */
    public FacetValueImpl createFacetValue() {
        return new FacetValueImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the volume info impl
     */
    public VolumeInfoImpl createVolumeInfo() {
        return new VolumeInfoImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bib book impl
     */
    public BibBookImpl createBibBook() {
        return new BibBookImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the full text impl
     */
    public FullTextImpl createFullText() {
        return new FullTextImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the chapter context impl
     */
    public ChapterContextImpl createChapterContext() {
        return new ChapterContextImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the journal subject group impl
     */
    public JournalSubjectGroupImpl createJournalSubjectGroup() {
        return new JournalSubjectGroupImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the citation impl
     */
    public CitationImpl createCitation() {
        return new CitationImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the media object impl
     */
    public MediaObjectImpl createMediaObject() {
        return new MediaObjectImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the formal para impl
     */
    public FormalParaImpl createFormalPara() {
        return new FormalParaImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bib editor name impl
     */
    public BibEditorNameImpl createBibEditorName() {
        return new BibEditorNameImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the ref target impl
     */
    public RefTargetImpl createRefTarget() {
        return new RefTargetImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the facets impl
     */
    public FacetsImpl createFacets() {
        return new FacetsImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the block quote impl
     */
    public BlockQuoteImpl createBlockQuote() {
        return new BlockQuoteImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the path impl
     */
    public PathImpl createPath() {
        return new PathImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the image object impl
     */
    public ImageObjectImpl createImageObject() {
        return new ImageObjectImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article history impl
     */
    public ArticleHistoryImpl createArticleHistory() {
        return new ArticleHistoryImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the issue title impl
     */
    public IssueTitleImpl createIssueTitle() {
        return new IssueTitleImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the authors impl
     */
    public AuthorsImpl createAuthors() {
        return new AuthorsImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the facet impl
     */
    public FacetImpl createFacet() {
        return new FacetImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the institutions impl
     */
    public InstitutionsImpl createInstitutions() {
        return new InstitutionsImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the row impl
     */
    public RowImpl createRow() {
        return new RowImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article impl
     */
    public ArticleImpl createArticle() {
        return new ArticleImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the chapter copyright impl
     */
    public ChapterCopyrightImpl createChapterCopyright() {
        return new ChapterCopyrightImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the author group impl
     */
    public AuthorGroupImpl createAuthorGroup() {
        return new AuthorGroupImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the footnote impl
     */
    public FootnoteImpl createFootnote() {
        return new FootnoteImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the equation impl
     */
    public EquationImpl createEquation() {
        return new EquationImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the subscript impl
     */
    public SubscriptImpl createSubscript() {
        return new SubscriptImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the section2 impl
     */
    public Section2Impl createSection2() {
        return new Section2Impl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the volume impl
     */
    public VolumeImpl createVolume() {
        return new VolumeImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bibliography impl
     */
    public BibliographyImpl createBibliography() {
        return new BibliographyImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the book copyright impl
     */
    public BookCopyrightImpl createBookCopyright() {
        return new BookCopyrightImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the p impl
     */
    public PImpl createP() {
        return new PImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the book subject group impl
     */
    public BookSubjectGroupImpl createBookSubjectGroup() {
        return new BookSubjectGroupImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the ISXN impl
     */
    public ISXNImpl createISXN() {
        return new ISXNImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the biography impl
     */
    public BiographyImpl createBiography() {
        return new BiographyImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the issue info impl
     */
    public IssueInfoImpl createIssueInfo() {
        return new IssueInfoImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the abstract section impl
     */
    public AbstractSectionImpl createAbstractSection() {
        return new AbstractSectionImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the emphasis impl
     */
    public EmphasisImpl createEmphasis() {
        return new EmphasisImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the keyword group impl
     */
    public KeywordGroupImpl createKeywordGroup() {
        return new KeywordGroupImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the abstract impl
     */
    public AbstractImpl createAbstract() {
        return new AbstractImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the author impl
     */
    public AuthorImpl createAuthor() {
        return new AuthorImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the caption impl
     */
    public CaptionImpl createCaption() {
        return new CaptionImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the book info impl
     */
    public BookInfoImpl createBookInfo() {
        return new BookInfoImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the series title impl
     */
    public SeriesTitleImpl createSeriesTitle() {
        return new SeriesTitleImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the accepted impl
     */
    public AcceptedImpl createAccepted() {
        return new AcceptedImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the book subject impl
     */
    public BookSubjectImpl createBookSubject() {
        return new BookSubjectImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the item content impl
     */
    public ItemContentImpl createItemContent() {
        return new ItemContentImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the publisher impl
     */
    public PublisherImpl createPublisher() {
        return new PublisherImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the images impl
     */
    public ImagesImpl createImages() {
        return new ImagesImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the body impl
     */
    public BodyImpl createBody() {
        return new BodyImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the equation source impl
     */
    public EquationSourceImpl createEquationSource() {
        return new EquationSourceImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the tbody impl
     */
    public TbodyImpl createTbody() {
        return new TbodyImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the cover date impl
     */
    public CoverDateImpl createCoverDate() {
        return new CoverDateImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the issue history impl
     */
    public IssueHistoryImpl createIssueHistory() {
        return new IssueHistoryImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the term impl
     */
    public TermImpl createTerm() {
        return new TermImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the book impl
     */
    public BookImpl createBook() {
        return new BookImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the no initials impl
     */
    public NoInitialsImpl createNoInitials() {
        return new NoInitialsImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the table impl
     */
    public TableImpl createTable() {
        return new TableImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the chapter backmatter impl
     */
    public ChapterBackmatterImpl createChapterBackmatter() {
        return new ChapterBackmatterImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the contact impl
     */
    public ContactImpl createContact() {
        return new ContactImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the revised impl
     */
    public RevisedImpl createRevised() {
        return new RevisedImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the author name impl
     */
    public AuthorNameImpl createAuthorName() {
        return new AuthorNameImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article info impl
     */
    public ArticleInfoImpl createArticleInfo() {
        return new ArticleInfoImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the records impl
     */
    public RecordsImpl createRecords() {
        return new RecordsImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the editor impl
     */
    public EditorImpl createEditor() {
        return new EditorImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the journal online first impl
     */
    public JournalOnlineFirstImpl createJournalOnlineFirst() {
        return new JournalOnlineFirstImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bib unstructured impl
     */
    public BibUnstructuredImpl createBibUnstructured() {
        return new BibUnstructuredImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the ordered list impl
     */
    public OrderedListImpl createOrderedList() {
        return new OrderedListImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article sub title impl
     */
    public ArticleSubTitleImpl createArticleSubTitle() {
        return new ArticleSubTitleImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bib author name impl
     */
    public BibAuthorNameImpl createBibAuthorName() {
        return new BibAuthorNameImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the journal info impl
     */
    public JournalInfoImpl createJournalInfo() {
        return new JournalInfoImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article grants impl
     */
    public ArticleGrantsImpl createArticleGrants() {
        return new ArticleGrantsImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bib article impl
     */
    public BibArticleImpl createBibArticle() {
        return new BibArticleImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the eds impl
     */
    public EdsImpl createEds() {
        return new EdsImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article title impl
     */
    public ArticleTitleImpl createArticleTitle() {
        return new ArticleTitleImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the publisher info impl
     */
    public PublisherInfoImpl createPublisherInfo() {
        return new PublisherInfoImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the tfooter impl
     */
    public TfooterImpl createTfooter() {
        return new TfooterImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the section1 impl
     */
    public Section1Impl createSection1() {
        return new Section1Impl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the section4 impl
     */
    public Section4Impl createSection4() {
        return new Section4Impl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article copyright impl
     */
    public ArticleCopyrightImpl createArticleCopyright() {
        return new ArticleCopyrightImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the issue copyright impl
     */
    public IssueCopyrightImpl createIssueCopyright() {
        return new IssueCopyrightImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the registration date impl
     */
    public RegistrationDateImpl createRegistrationDate() {
        return new RegistrationDateImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the bibliography grant impl
     */
    public BibliographyGrantImpl createBibliographyGrant() {
        return new BibliographyGrantImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the metadata grant impl
     */
    public MetadataGrantImpl createMetadataGrant() {
        return new MetadataGrantImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the series id impl
     */
    public SeriesIDImpl createSeriesID() {
        return new SeriesIDImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the superscript impl
     */
    public SuperscriptImpl createSuperscript() {
        return new SuperscriptImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the response impl
     */
    public ResponseImpl createResponse() {
        return new ResponseImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the result impl
     */
    public ResultImpl createResult() {
        return new ResultImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the definition list entry impl
     */
    public DefinitionListEntryImpl createDefinitionListEntry() {
        return new DefinitionListEntryImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the chapter impl
     */
    public ChapterImpl createChapter() {
        return new ChapterImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the article context impl
     */
    public ArticleContextImpl createArticleContext() {
        return new ArticleContextImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the chapter grants impl
     */
    public ChapterGrantsImpl createChapterGrants() {
        return new ChapterGrantsImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the editor group element impl
     */
    public EditorGroupElementImpl createEditorGroupElement() {
        return new EditorGroupElementImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the appendix impl
     */
    public AppendixImpl createAppendix() {
        return new AppendixImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the series info impl
     */
    public SeriesInfoImpl createSeriesInfo() {
        return new SeriesInfoImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the chapter header impl
     */
    public ChapterHeaderImpl createChapterHeader() {
        return new ChapterHeaderImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the inline equation impl
     */
    public InlineEquationImpl createInlineEquation() {
        return new InlineEquationImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the chapter history impl
     */
    public ChapterHistoryImpl createChapterHistory() {
        return new ChapterHistoryImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the record impl
     */
    public RecordImpl createRecord() {
        return new RecordImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the abstract grant impl
     */
    public AbstractGrantImpl createAbstractGrant() {
        return new AbstractGrantImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the para impl
     */
    public ParaImpl createPara() {
        return new ParaImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the org address impl
     */
    public OrgAddressImpl createOrgAddress() {
        return new OrgAddressImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the occurrence impl
     */
    public OccurrenceImpl createOccurrence() {
        return new OccurrenceImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the subjects impl
     */
    public SubjectsImpl createSubjects() {
        return new SubjectsImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the body ref impl
     */
    public BodyRefImpl createBodyRef() {
        return new BodyRefImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the simple para impl
     */
    public SimpleParaImpl createSimplePara() {
        return new SimpleParaImpl();
    }

    /**
     * Creates a new Object object.
     * 
     * @return the citation ref impl
     */
    public CitationRefImpl createCitationRef() {
        return new CitationRefImpl();
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
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "total")
    @XmlJavaTypeAdapter(Adapter2 .class)
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
    @XmlElementDecl(namespace = "", name = "NumberInSeries")
    public JAXBElement<String> createNumberInSeries(String value) {
        return new JAXBElement<String>(_NumberInSeries_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Format")
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
    @XmlJavaTypeAdapter(Adapter2 .class)
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
    @XmlElementDecl(namespace = "", name = "JournalTitle")
    public JAXBElement<String> createJournalTitle(String value) {
        return new JAXBElement<String>(_JournalTitle_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "BookPrintISBN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBookPrintISBN(String value) {
        return new JAXBElement<String>(_BookPrintISBN_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "BookSequenceNumber")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createBookSequenceNumber(Long value) {
        return new JAXBElement<Long>(_BookSequenceNumber_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "VolumeId")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createVolumeId(Long value) {
        return new JAXBElement<Long>(_VolumeId_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "BookTitleID")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createBookTitleID(Long value) {
        return new JAXBElement<Long>(_BookTitleID_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "InstitutionalAuthorName")
    public JAXBElement<String> createInstitutionalAuthorName(String value) {
        return new JAXBElement<String>(_InstitutionalAuthorName_QNAME, String.class, null, value);
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
    public JAXBElement<String> createH1(String value) {
        return new JAXBElement<String>(_H1_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "ChapterID")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createChapterID(Long value) {
        return new JAXBElement<Long>(_ChapterID_QNAME, Long.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "APPId")
    public JAXBElement<String> createAPPId(String value) {
        return new JAXBElement<String>(_APPId_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Country")
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
     * @return the JAXB element< date>
     */
    @XmlElementDecl(namespace = "", name = "DateLoaded")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Date> createDateLoaded(Date value) {
        return new JAXBElement<Date>(_DateLoaded_QNAME, Date.class, null, value);
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
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "start")
    @XmlJavaTypeAdapter(Adapter2 .class)
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
    @XmlJavaTypeAdapter(Adapter2 .class)
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
    @XmlElementDecl(namespace = "", name = "GivenName")
    public JAXBElement<String> createGivenName(String value) {
        return new JAXBElement<String>(_GivenName_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "ChapterLastPage")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createChapterLastPage(Long value) {
        return new JAXBElement<Long>(_ChapterLastPage_QNAME, Long.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "URL")
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(_URL_QNAME, String.class, null, value);
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
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "BookChapterCount")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createBookChapterCount(Long value) {
        return new JAXBElement<Long>(_BookChapterCount_QNAME, Long.class, null, value);
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
    @XmlJavaTypeAdapter(Adapter2 .class)
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
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "BookID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBookID(String value) {
        return new JAXBElement<String>(_BookID_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "BookElectronicISBN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBookElectronicISBN(String value) {
        return new JAXBElement<String>(_BookElectronicISBN_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< editor group impl>
     */
    @XmlElementDecl(namespace = "", name = "IssueHeader")
    public JAXBElement<EditorGroupImpl> createIssueHeader(EditorGroupImpl value) {
        return new JAXBElement<EditorGroupImpl>(_IssueHeader_QNAME, EditorGroupImpl.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "BookTitleId")
    @XmlJavaTypeAdapter(Adapter2 .class)
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
    @XmlJavaTypeAdapter(Adapter2 .class)
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
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "JournalSPIN")
    @XmlJavaTypeAdapter(Adapter2 .class)
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
     * @return the JAXB element< series id impl>
     */
    @XmlElementDecl(namespace = "", name = "BookContext")
    public JAXBElement<SeriesIDImpl> createBookContext(SeriesIDImpl value) {
        return new JAXBElement<SeriesIDImpl>(_BookContext_QNAME, SeriesIDImpl.class, null, value);
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
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "SeriesID")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createSeriesID(Long value) {
        return new JAXBElement<Long>(_SeriesID_QNAME, Long.class, null, value);
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
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "SeriesAbbreviatedTitle")
    public JAXBElement<String> createSeriesAbbreviatedTitle(String value) {
        return new JAXBElement<String>(_SeriesAbbreviatedTitle_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< image object impl>
     */
    @XmlElementDecl(namespace = "", name = "InlineMediaObject")
    public JAXBElement<ImageObjectImpl> createInlineMediaObject(ImageObjectImpl value) {
        return new JAXBElement<ImageObjectImpl>(_InlineMediaObject_QNAME, ImageObjectImpl.class, null, value);
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
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "ChapterSequenceNumber")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createChapterSequenceNumber(Long value) {
        return new JAXBElement<Long>(_ChapterSequenceNumber_QNAME, Long.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "ChapterDOI")
    public JAXBElement<String> createChapterDOI(String value) {
        return new JAXBElement<String>(_ChapterDOI_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "SourceType")
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
    @XmlJavaTypeAdapter(Adapter2 .class)
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
     * @return the JAXB element< long>
     */
    @XmlElementDecl(namespace = "", name = "ChapterFirstPage")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Long> createChapterFirstPage(Long value) {
        return new JAXBElement<Long>(_ChapterFirstPage_QNAME, Long.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "CitationNumber")
    public JAXBElement<String> createCitationNumber(String value) {
        return new JAXBElement<String>(_CitationNumber_QNAME, String.class, null, value);
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
     * @return the JAXB element< editor group impl>
     */
    @XmlElementDecl(namespace = "", name = "BookHeader")
    public JAXBElement<EditorGroupImpl> createBookHeader(EditorGroupImpl value) {
        return new JAXBElement<EditorGroupImpl>(_BookHeader_QNAME, EditorGroupImpl.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "ItemNumber")
    public JAXBElement<String> createItemNumber(String value) {
        return new JAXBElement<String>(_ItemNumber_QNAME, String.class, null, value);
    }

    /**
     * Creates a new Object object.
     * 
     * @param value the value
     * 
     * @return the JAXB element< string>
     */
    @XmlElementDecl(namespace = "", name = "Postbox")
    public JAXBElement<String> createPostbox(String value) {
        return new JAXBElement<String>(_Postbox_QNAME, String.class, null, value);
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
