package org.example.helloworld.goodbyecruelworld.factory;

import org.example.helloworld.goodbyecruelworld.HelloWorld;
import org.example.helloworld.goodbyecruelworld.HelloWorldImpl;

/**
 * Enables different implementations of {@link HelloWorld} to be instantiated.
 */
public class HelloWorldFactory {
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
		return new HelloWorldImpl();
	}
}
