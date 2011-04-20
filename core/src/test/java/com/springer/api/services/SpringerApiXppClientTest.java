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

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.springer.api.schema.Response;
import com.springer.api.services.constant.TestConstants;
import com.springer.api.services.impl.SpringerApiXppClient;

/**
 * The Class SpringerApiXppClientTest.
 */
public class SpringerApiXppClientTest {
	

	/**
	 * Sets the up.
	 * 
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tear down.
	 * 
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test images.
	 */
	@Test
	public void testImages() {
		SpringerApiClient client = new SpringerApiXppClient(TestConstants.TEST_IMAGES_KEY);
		Response response = client.images(TestConstants.TEST_QUERY);
		assertNotNull("Response cannot be null or empty.", response);
	}

	/**
	 * Test metadata.
	 */
	@Test
	public void testMetadata() {
		SpringerApiClient client = new SpringerApiXppClient(TestConstants.TEST_METADATA_KEY);
		Response response = client.metadata(TestConstants.TEST_QUERY);
		assertNotNull("Response cannot be null or empty.", response);
	}

	/**
	 * Test open access.
	 */
	@Test
	public void testOpenAccess() {
		SpringerApiClient client = new SpringerApiXppClient(TestConstants.TEST_OPEN_ACCESS_KEY);
		Response response = client.openAccess(TestConstants.TEST_QUERY);
		assertNotNull("Response cannot be null or empty.", response);
	}
}
