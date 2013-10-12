package org.example.helloworld.goodbyecruelworld;

import org.example.helloworld.goodbyecruelworld.domain.HelloBean;

/**
 * HelloWorld provides an interface for &quot;Hello, World&quot;-type applications.
 */
public interface HelloWorld extends Runnable {
	/**
	 * Greets the world.
	 *
	 * @return An instance of HelloBean
	 */
	HelloBean helloWorld();
}
