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
package com.springer.api.services;

import com.springer.api.services.impl.MetadataQueryImpl;
import com.springer.api.services.impl.ImagesQueryImpl;
import com.springer.api.services.impl.OpenAccessQueryImpl;




/**
 * A factory for creating WorldBankQuery objects.
 */
public class SpringerQueryFactory {

    /**
     * Instantiates a new world bank query factory.
     */
	private SpringerQueryFactory() {
    }
	
    /**
     * New instance.
     * 
     * @return the world bank query factory
     */
    public static SpringerQueryFactory newInstance() {
        return new SpringerQueryFactory();
    }
    
    /**
     * Creates a new WorldBankQuery object.
     * 
     * @return the country query
     */
    public MetadataQuery createCountryQuery() {
    	return new MetadataQueryImpl();
    }
    
    /**
     * Creates a new WorldBankQuery object.
     * 
     * @return the income level query
     */
    public ImagesQuery createIncomeLevelQuery() {
    	return new ImagesQueryImpl();
    }
    
    /**
     * Creates a new WorldBankQuery object.
     * 
     * @return the indicator query
     */
    public OpenAccessQuery createIndicatorQuery() {
    	return new OpenAccessQueryImpl();
    }
}
