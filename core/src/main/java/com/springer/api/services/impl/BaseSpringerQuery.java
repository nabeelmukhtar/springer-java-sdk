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
package com.springer.api.services.impl;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.springer.api.common.PagedArrayList;
import com.springer.api.common.PagedList;
import com.springer.api.services.SpringerException;
import com.springer.api.services.SpringerQuery;
import com.springer.api.services.constant.ApplicationConstants;
import com.springer.api.services.constant.SpringerApiUrls.SpringerApiUrlBuilder;

/**
 * The Class BaseSpringerQuery.
 */
public abstract class BaseSpringerQuery<E> extends SpringerApiGateway implements SpringerQuery<E> {
	
	/** The Constant UTF_8_CHAR_SET. */
	protected static final Charset UTF_8_CHAR_SET = Charset.forName(ApplicationConstants.CONTENT_ENCODING);
	
    /** The parser. */
    private final JsonParser parser = new JsonParser();
    
	/** The api url builder. */
	protected SpringerApiUrlBuilder apiUrlBuilder;
    
	/**
	 * Instantiates a new base springer query.
	 */
	public BaseSpringerQuery() {
        // by default we compress contents
        requestHeaders.put("Accept-Encoding", "gzip, deflate");
        reset();
	}

	/**
	 * Instantiates a new base springer query.
	 * 
	 * @param apiVersion the api version
	 */
	public BaseSpringerQuery(String apiVersion) {
		setApiVersion(apiVersion);
	}
	
	/* (non-Javadoc)
	 * @see com.google.code.stackexchange.client.query.StackOverflowApiQuery#list()
	 */
	@Override
	public PagedList<E> list() {
		InputStream jsonContent = null;
        try {
        	jsonContent = callApiGet(apiUrlBuilder.buildUrl());
        	JsonElement response = parser.parse(new InputStreamReader(jsonContent, UTF_8_CHAR_SET));
        	if (response.isJsonArray()) {
        		PagedList<E> responseList = unmarshallList(response.getAsJsonArray());
//        		notifyObservers(responseList);
    			return responseList;
        	}
        	throw new SpringerException("Unknown content found in response:" + response.toString());
        } catch (Exception e) {
            throw new SpringerException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}
	
	/* (non-Javadoc)
	 * @see org.worldbank.api.services.WorldBankQuery#singleResult()
	 */
	@Override
	public E singleResult() {
		List<E> list = list();
		return (list.isEmpty())? null : list.get(0);
	}
	
	/**
	 * Unmarshall list.
	 * 
	 * @param jsonArray the json array
	 * 
	 * @return the paged list< e>
	 */
	protected PagedList<E> unmarshallList(JsonArray jsonArray) {
		PagedArrayList<E> list = new PagedArrayList<E>();
		if (jsonArray.size() == 2) {
			JsonObject cursor = jsonArray.get(0).getAsJsonObject();
			if (cursor != null) {
				list.setCursor(getGsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create().fromJson(cursor, PagedArrayList.Cursor.class));
			}
			JsonArray results = jsonArray.get(1).getAsJsonArray();
			for (JsonElement object : results) {
				E element = unmarshall(object);
				list.add(element);
			}
		}
		return list;
	}
	
	
	/**
	 * Unmarshall.
	 * 
	 * @param response the response
	 * 
	 * @return the e
	 */
	protected abstract E unmarshall(JsonElement response);
	
	/**
	 * Gets the gson builder.
	 * 
	 * @return the gson builder
	 */
	protected GsonBuilder getGsonBuilder() {
		GsonBuilder builder = new GsonBuilder();
		builder.setDateFormat(ApplicationConstants.DATE_FORMAT);
//		builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
//		builder.registerTypeAdapter(Issue.State.class, new JsonDeserializer<Issue.State>() {
//			@Override
//			public Issue.State deserialize(JsonElement arg0, Type arg1,
//					JsonDeserializationContext arg2) throws JsonParseException {
//				return Issue.State.fromValue(arg0.getAsString());
//			}
//		});
		return builder;
	}
    
	/**
	 * Unmarshall.
	 * 
	 * @param jsonContent the json content
	 * 
	 * @return the json object
	 */
	protected JsonObject unmarshall(InputStream jsonContent) {
        try {
        	JsonElement element = parser.parse(new InputStreamReader(jsonContent, UTF_8_CHAR_SET));
        	if (element.isJsonObject()) {
        		return element.getAsJsonObject();
        	} else {
        		throw new SpringerException("Unknown content found in response." + element);
        	}
        } catch (Exception e) {
            throw new SpringerException(e);
        } finally {
	        closeStream(jsonContent);
	    }
	}
	
	/**
	 * Creates the world bank api url builder.
	 * 
	 * @param urlFormat the url format
	 * 
	 * @return the springer api url builder
	 */
	protected SpringerApiUrlBuilder createWorldBankApiUrlBuilder(String urlFormat) {
		return new SpringerApiUrlBuilder(urlFormat);
	}
}
