
package com.springer.api.metadata;

import java.util.List;

public class Records{
   	private String copyright;
   	private List<Creators> creators;
   	private String doi;
   	private String identifier;
   	private String isbn;
   	private String issn;
   	private String number;
   	private String publicationDate;
   	private String publicationName;
   	private String publisher;
   	private String startingPage;
   	private String title;
   	private String url;
   	private String volume;

 	public String getCopyright(){
		return this.copyright;
	}
	public void setCopyright(String copyright){
		this.copyright = copyright;
	}
 	public List<Creators> getCreators(){
		return this.creators;
	}
	public void setCreators(List<Creators> creators){
		this.creators = creators;
	}
 	public String getDoi(){
		return this.doi;
	}
	public void setDoi(String doi){
		this.doi = doi;
	}
 	public String getIdentifier(){
		return this.identifier;
	}
	public void setIdentifier(String identifier){
		this.identifier = identifier;
	}
 	public String getIsbn(){
		return this.isbn;
	}
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
 	public String getIssn(){
		return this.issn;
	}
	public void setIssn(String issn){
		this.issn = issn;
	}
 	public String getNumber(){
		return this.number;
	}
	public void setNumber(String number){
		this.number = number;
	}
 	public String getPublicationDate(){
		return this.publicationDate;
	}
	public void setPublicationDate(String publicationDate){
		this.publicationDate = publicationDate;
	}
 	public String getPublicationName(){
		return this.publicationName;
	}
	public void setPublicationName(String publicationName){
		this.publicationName = publicationName;
	}
 	public String getPublisher(){
		return this.publisher;
	}
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
 	public String getStartingPage(){
		return this.startingPage;
	}
	public void setStartingPage(String startingPage){
		this.startingPage = startingPage;
	}
 	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}
 	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}
 	public String getVolume(){
		return this.volume;
	}
	public void setVolume(String volume){
		this.volume = volume;
	}
}
