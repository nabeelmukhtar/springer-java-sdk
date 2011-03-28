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
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.springer.api.services.SpringerApiClient;
import com.springer.api.services.SpringerException;
import com.springer.api.services.constant.SpringerApiUrls.SpringerApiUrlBuilder;

/**
 * The Class SpringerApiJaxbClient.
 */
public class SpringerApiJaxbClient implements SpringerApiClient {

    /** The Constant JAXB_PACKAGE_NAME. */
    private static final String JAXB_PACKAGE_NAME = "com.springer.api";
    
    /** The JAX b_ context. */
    private static JAXBContext JAXB_CONTEXT;

    /**
     * Instantiates a new springer api jaxb client.
     * 
     * @param apiKey the api key
     */
    public SpringerApiJaxbClient(String apiKey) {
    }

    /**
     * Unmarshall object.
     * 
     * @param clazz the clazz
     * @param xmlContent the xml content
     * 
     * @return the t
     */
    @SuppressWarnings("unchecked")
    protected <T> T unmarshallObject(Class<T> clazz, InputStream xmlContent) {
        try {
            Unmarshaller u  = getJaxbContext().createUnmarshaller();

            return (T) u.unmarshal(xmlContent);
        } catch (JAXBException e) {
            throw new SpringerException(e);
        }
    }

    /**
     * Marshall object.
     * 
     * @param element the element
     * 
     * @return the string
     */
    protected String marshallObject(Object element) {
        try {
            StringWriter writer = new StringWriter();
            Marshaller   m = getJaxbContext().createMarshaller();

            m.marshal(element, writer);

            return writer.toString();
        } catch (JAXBException e) {
            throw new SpringerException(e);
        }
    }

	/**
	 * Creates the springer api url builder.
	 * 
	 * @param urlFormat the url format
	 * 
	 * @return the springer api url builder
	 */
	protected SpringerApiUrlBuilder createSpringerApiUrlBuilder(String urlFormat) {
		return new SpringerApiUrlBuilder(urlFormat);
	}

    /**
     * Gets the jaxb context.
     * 
     * @return the jaxb context
     * 
     * @throws JAXBException the JAXB exception
     */
	protected JAXBContext getJaxbContext() throws JAXBException {
		if (JAXB_CONTEXT == null ) {
			JAXB_CONTEXT = JAXBContext.newInstance(JAXB_PACKAGE_NAME);
		}
		return JAXB_CONTEXT;
	}

    /**
     * Sets the jaxb context.
     * 
     * @param context the new jaxb context
     */
	protected void setJaxbContext(JAXBContext context) {
		JAXB_CONTEXT = context;
	}
}
