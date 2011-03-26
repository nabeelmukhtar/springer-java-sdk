
package com.springer.api.images;

import java.util.List;

public class Facets{
   	private String name;
   	private List<Values> values;

 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public List<Values> getValues(){
		return this.values;
	}
	public void setValues(List<Values> values){
		this.values = values;
	}
}
