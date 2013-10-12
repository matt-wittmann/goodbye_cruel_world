package org.example.helloworld.goodbyecruelworld.factory;

import java.lang.reflect.Constructor;
import java.util.ResourceBundle;

import org.example.helloworld.goodbyecruelworld.HelloWorld;
import org.example.helloworld.goodbyecruelworld.constants.HelloConstants;

/**
 * Enables different implementations of {@link HelloWorld} to be instantiated.
 */
public class HelloWorldFactory {
	private static final String ERROR_HELLO_WORLD_INSTANTIATION = "Could not create a new HelloWorld object.";
	/** The static instance of the factory. */
	private static HelloWorldFactory instance;

	/**
	 * Gets the instance of the factory.
	 *
	 * @return {@link #instance}
	 */
	public static HelloWorldFactory getInstance() {
		if (instance == null) {
			instance = new HelloWorldFactory();
		}

		return instance;
	}

	/**
	 * Creates a new instance of {@link HelloWorld}.
	 *
	 * @return A fresh HelloWorld
	 */
	public HelloWorld getHelloWorld() {
		ResourceBundle bundle = ResourceBundle.getBundle(HelloConstants.DEFAULT_RESOURCE_BUNDLE_NAME);
		String className = bundle.getString(HelloWorld.class.getName());
		HelloWorld helloWorld = null;
		try {
			Class<?> clazz = getClass().getClassLoader().loadClass(className);
			Constructor<?> constructor = clazz.getConstructor();
			helloWorld = (HelloWorld) constructor.newInstance();
		}
		catch (Exception e) {
			throw new RuntimeException(ERROR_HELLO_WORLD_INSTANTIATION, e);
		}
		return helloWorld;
	}
}
