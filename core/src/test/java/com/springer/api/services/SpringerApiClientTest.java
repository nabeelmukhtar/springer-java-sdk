package com.springer.api.services;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.springer.api.Response;
import com.springer.api.services.constant.TestConstants;
import com.springer.api.services.impl.SpringerApiJaxbClient;

public class SpringerApiClientTest {
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testImages() {
		SpringerApiClient client = new SpringerApiJaxbClient(TestConstants.TEST_IMAGES_KEY);
		Response response = client.images(TestConstants.TEST_QUERY);
		assertNotNull("Response cannot be null or empty.", response);
	}

	@Test
	public void testMetadata() {
		SpringerApiClient client = new SpringerApiJaxbClient(TestConstants.TEST_METADATA_KEY);
		Response response = client.metadata(TestConstants.TEST_QUERY);
		assertNotNull("Response cannot be null or empty.", response);
	}

	@Test
	public void testOpenAccess() {
		SpringerApiClient client = new SpringerApiJaxbClient(TestConstants.TEST_OPEN_ACCESS_KEY);
		Response response = client.openAccess(TestConstants.TEST_QUERY);
		assertNotNull("Response cannot be null or empty.", response);
	}
}
