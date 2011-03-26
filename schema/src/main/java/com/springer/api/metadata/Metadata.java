
package com.springer.api.metadata;

import java.util.List;

public class Metadata{
   	private String apiKey;
   	private List<Facets> facets;
   	private String query;
   	private List<Records> records;
   	private List<Result> result;

 	public String getApiKey(){
		return this.apiKey;
	}
	public void setApiKey(String apiKey){
		this.apiKey = apiKey;
	}
 	public List<Facets> getFacets(){
		return this.facets;
	}
	public void setFacets(List<Facets> facets){
		this.facets = facets;
	}
 	public String getQuery(){
		return this.query;
	}
	public void setQuery(String query){
		this.query = query;
	}
 	public List<Records> getRecords(){
		return this.records;
	}
	public void setRecords(List<Records> records){
		this.records = records;
	}
 	public List<Result> getResult(){
		return this.result;
	}
	public void setResult(List<Result> result){
		this.result = result;
	}
}
