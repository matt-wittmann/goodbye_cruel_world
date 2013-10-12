package org.example.helloworld.goodbyecruelworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.example.helloworld.goodbyecruelworld.constants.HelloConstants;
import org.example.helloworld.goodbyecruelworld.domain.HelloBean;
import org.junit.Test;

/**
 * A unit test for the {@link HardCodedHelloWorldImpl} class.
 */
public class UT_HardCodedHelloWorldImpl {
	@Test
	public void testHelloWorld() {
		HardCodedHelloWorldImpl helloWorldImpl = new HardCodedHelloWorldImpl();
		HelloBean helloBean = helloWorldImpl.helloWorld();
		assertNotNull("The helloBean returned by HardCodedHelloWorldImpl#helloWorld() must not be null.", helloBean);
		assertEquals("helloBean#getHello() must be equal to \"Hello, world!\"",
				HelloConstants.HELLO_WORLD, helloBean.getHello());
	}

	@Test
	public void testCorruptMessage() {
		HardCodedHelloWorldImpl helloWorldImpl = new HardCodedHelloWorldImpl();
		HelloBean helloBean = helloWorldImpl.helloWorld();
		assertEquals("helloBean#getHello() must be equal to \"Hello, world!\"",
				HelloConstants.HELLO_WORLD, helloBean.getHello());
		helloBean.setHello("Salut à tout le monde !");
		helloBean = helloWorldImpl.helloWorld();
		assertEquals("On ne parle pas le français.",
				HelloConstants.HELLO_WORLD, helloBean.getHello());
	}
}
