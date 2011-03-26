
package com.springer.api.images;

import java.util.List;

public class Records{
   	private String dOI;
   	private String iSXN;
   	private String articleTitle;
   	private List<Authors> authors;
   	private String bookDOI;
   	private String bookTitleId;
   	private String caption;
   	private String chapterId;
   	private List<File> file;
   	private String identifier;
   	private String imageType;
   	private List<Institutions> institutions;
   	private List<Keywords> keywords;
   	private String openAccess;
   	private String provider;
   	private String pubDate;
   	private String sourceTitle;
   	private String sourceType;
   	private String subjectCollection;
   	private List<Subjects> subjects;

 	public String getDOI(){
		return this.dOI;
	}
	public void setDOI(String dOI){
		this.dOI = dOI;
	}
 	public String getISXN(){
		return this.iSXN;
	}
	public void setISXN(String iSXN){
		this.iSXN = iSXN;
	}
 	public String getArticleTitle(){
		return this.articleTitle;
	}
	public void setArticleTitle(String articleTitle){
		this.articleTitle = articleTitle;
	}
 	public List<Authors> getAuthors(){
		return this.authors;
	}
	public void setAuthors(List<Authors> authors){
		this.authors = authors;
	}
 	public String getBookDOI(){
		return this.bookDOI;
	}
	public void setBookDOI(String bookDOI){
		this.bookDOI = bookDOI;
	}
 	public String getBookTitleId(){
		return this.bookTitleId;
	}
	public void setBookTitleId(String bookTitleId){
		this.bookTitleId = bookTitleId;
	}
 	public String getCaption(){
		return this.caption;
	}
	public void setCaption(String caption){
		this.caption = caption;
	}
 	public String getChapterId(){
		return this.chapterId;
	}
	public void setChapterId(String chapterId){
		this.chapterId = chapterId;
	}
 	public List<File> getFile(){
		return this.file;
	}
	public void setFile(List<File> file){
		this.file = file;
	}
 	public String getIdentifier(){
		return this.identifier;
	}
	public void setIdentifier(String identifier){
		this.identifier = identifier;
	}
 	public String getImageType(){
		return this.imageType;
	}
	public void setImageType(String imageType){
		this.imageType = imageType;
	}
 	public List<Institutions> getInstitutions(){
		return this.institutions;
	}
	public void setInstitutions(List<Institutions> institutions){
		this.institutions = institutions;
	}
 	public List<Keywords> getKeywords(){
		return this.keywords;
	}
	public void setKeywords(List<Keywords> keywords){
		this.keywords = keywords;
	}
 	public String getOpenAccess(){
		return this.openAccess;
	}
	public void setOpenAccess(String openAccess){
		this.openAccess = openAccess;
	}
 	public String getProvider(){
		return this.provider;
	}
	public void setProvider(String provider){
		this.provider = provider;
	}
 	public String getPubDate(){
		return this.pubDate;
	}
	public void setPubDate(String pubDate){
		this.pubDate = pubDate;
	}
 	public String getSourceTitle(){
		return this.sourceTitle;
	}
	public void setSourceTitle(String sourceTitle){
		this.sourceTitle = sourceTitle;
	}
 	public String getSourceType(){
		return this.sourceType;
	}
	public void setSourceType(String sourceType){
		this.sourceType = sourceType;
	}
 	public String getSubjectCollection(){
		return this.subjectCollection;
	}
	public void setSubjectCollection(String subjectCollection){
		this.subjectCollection = subjectCollection;
	}
 	public List<Subjects> getSubjects(){
		return this.subjects;
	}
	public void setSubjects(List<Subjects> subjects){
		this.subjects = subjects;
	}
}
