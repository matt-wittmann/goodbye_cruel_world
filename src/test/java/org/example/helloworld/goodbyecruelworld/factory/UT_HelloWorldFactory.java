package org.example.helloworld.goodbyecruelworld.factory;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for {@link HelloWorldFactory}.
 */
public class UT_HelloWorldFactory {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetInstance() {
		assertNotNull("HelloWorldFactory.getInstance() must not return null.", HelloWorldFactory.getInstance());
	}

	@Test
	public void testGetHelloWorld() {
		assertNotNull("HelloWorldFactory.getInstance().getHelloWorld() must not return null.",
				HelloWorldFactory.getInstance().getHelloWorld());
	}
}
