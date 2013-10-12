package org.example.helloworld.goodbyecruelworld;

import org.example.helloworld.goodbyecruelworld.domain.HelloBean;

/**
 * HelloWorldImpl is the main class of the &quot;Goodbye, Cruel World&quot; program.
 */
public class HelloWorldImpl implements HelloWorld {
	private HelloBean helloBean;

	/**
	 * Default constructor.
	 */
	public HelloWorldImpl() {
		this.helloBean = new HelloBean();
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
	 * Point of entry into this Java program.
	 *
	 * @param args Command-line arguments to this Java program
	 */
	public static void main(String[] args) {
		HelloWorldImpl helloWorld = new HelloWorldImpl();
		helloWorld.run();
	}
}
