
package com.springer.api.images;

import java.util.List;

public class Result{
   	private String pageLength;
   	private String start;
   	private String total;

 	public String getPageLength(){
		return this.pageLength;
	}
	public void setPageLength(String pageLength){
		this.pageLength = pageLength;
	}
 	public String getStart(){
		return this.start;
	}
	public void setStart(String start){
		this.start = start;
	}
 	public String getTotal(){
		return this.total;
	}
	public void setTotal(String total){
		this.total = total;
	}
}
