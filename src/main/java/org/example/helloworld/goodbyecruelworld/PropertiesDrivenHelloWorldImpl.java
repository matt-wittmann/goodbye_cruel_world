package org.example.helloworld.goodbyecruelworld;

import java.util.ResourceBundle;

import org.example.helloworld.goodbyecruelworld.constants.HelloConstants;
import org.example.helloworld.goodbyecruelworld.domain.HelloBean;

/**
 * Loads &quot;Hello, world!&quot; from a *.properties file.
 */
public class PropertiesDrivenHelloWorldImpl implements HelloWorld {
	private HelloBean helloBean;

	/**
	 * Default constructor looks for resource bundle defined as {@link HelloConstants#DEFAULT_RESOURCE_BUNDLE_NAME}.
	 */
	public PropertiesDrivenHelloWorldImpl() {
		this(HelloConstants.DEFAULT_RESOURCE_BUNDLE_NAME);
	}

	/**
	 * Instantiates a PropertiesDrivenHelloWorldImpl.
	 *
	 * @param resourceBundleName The name of the resource bundle to use
	 */
	public PropertiesDrivenHelloWorldImpl(String resourceBundleName) {
		ResourceBundle bundle = ResourceBundle.getBundle(resourceBundleName);
		String hello = bundle.getString(HelloConstants.KEY_HELLO_WORLD);
		helloBean = new HelloBean(hello);
	}

	/**
	 * Prints the hello message from HelloBean to STDOUT.
	 *
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println(helloWorld().getHello());
	}

	/**
	 * Greets the world.
	 *
	 * @return An instance of HelloBean
	 * @see org.example.helloworld.goodbyecruelworld.HelloWorld#helloWorld()
	 */
	@Override
	public HelloBean helloWorld() {
		return helloBean.clone();
	}
}
