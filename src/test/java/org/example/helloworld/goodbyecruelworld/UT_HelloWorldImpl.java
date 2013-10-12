package org.example.helloworld.goodbyecruelworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.example.helloworld.goodbyecruelworld.constants.HelloConstants;
import org.example.helloworld.goodbyecruelworld.domain.HelloBean;
import org.junit.Test;

/**
 * A unit test for the {@link HelloWorldImpl} class.
 */
public class UT_HelloWorldImpl {
	@Test
	public void testHelloWorld() {
		HelloWorldImpl helloWorldImpl = new HelloWorldImpl();
		HelloBean helloBean = helloWorldImpl.helloWorld();
		assertNotNull("The helloBean returned by HelloWorldImpl#helloWorld() must not be null.", helloBean);
		assertEquals("helloBean#getHello() must be equal to \"Hello, world!\"",
				HelloConstants.HELLO_WORLD, helloBean.getHello());
	}
}
