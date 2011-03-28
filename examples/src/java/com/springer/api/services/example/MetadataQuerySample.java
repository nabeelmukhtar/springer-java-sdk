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
package com.springer.api.services.example;

import java.util.List;

import com.springer.api.common.Facet;
import com.springer.api.common.FacetValue;
import com.springer.api.schema.Metadata;
import com.springer.api.services.MetadataQuery;
import com.springer.api.services.SpringerQueryFactory;


/**
 * The Class MetadataQuerySample.
 */
public class MetadataQuerySample {

    /**
     * The main method.
     * 
     * @param args the arguments
     * 
     * @throws Exception the exception
     */
	public static void main(String[] args) throws Exception {
		SpringerQueryFactory factory = SpringerQueryFactory.newInstance();
		MetadataQuery service = factory.createMetadataQuery("gunwy4dr9rkvpbv4nq3effqy");
		List<Metadata> metadata = service.withQuery("mapreduce").list();
		for (Metadata data : metadata) {
			printResult(data);
		}
		
		List<Facet> facets = service.facets();
		for (Facet facet : facets) {
			System.out.println(facet.getName());
			for (FacetValue facetValue : facet.getValues()) {
				System.out.println(facetValue.getValue() + ":" + facetValue.getCount());
			}
		}
	}

	/**
	 * Prints the result.
	 * 
	 * @param data the data
	 */
	private static void printResult(Metadata data) {
		System.out.println(data.getPublicationName() + ":" + data.getPublisher());
	}
}
