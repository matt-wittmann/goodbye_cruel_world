package org.example.helloworld.goodbyecruelworld;

import org.example.helloworld.goodbyecruelworld.factory.HelloWorldFactory;

/**
 * The class for the entry point into the &quot;Goodbye, Cruel World&quot; program.
 */
public class Main {
	/**
	 * Point of entry into this Java program.
	 *
	 * @param args Command-line arguments to this Java program
	 */
	public static void main(String[] args) {
		HelloWorld helloWorld = HelloWorldFactory.getInstance().getHelloWorld();
		helloWorld.run();
	}
}
