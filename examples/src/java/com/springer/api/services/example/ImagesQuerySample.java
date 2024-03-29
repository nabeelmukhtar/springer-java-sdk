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

import com.springer.api.schema.common.Facet;
import com.springer.api.schema.common.FacetValue;
import com.springer.api.schema.json.Image;
import com.springer.api.services.ImagesQuery;
import com.springer.api.services.SpringerQueryFactory;


/**
 * The Class ImagesQuerySample.
 */
public class ImagesQuerySample {

    /**
     * The main method.
     * 
     * @param args the arguments
     * 
     * @throws Exception the exception
     */
	public static void main(String[] args) throws Exception {
		SpringerQueryFactory factory = SpringerQueryFactory.newInstance();
		ImagesQuery service = factory.createImagesQuery("");
		List<Image> images = service.withQuery("mapreduce").list();
		for (Image image : images) {
			printResult(image);
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
	 * @param incomeLevel the income level
	 */
	private static void printResult(Image incomeLevel) {
		System.out.println(incomeLevel.getArticleTitle() + ":" + incomeLevel.getCaption());
	}
}
