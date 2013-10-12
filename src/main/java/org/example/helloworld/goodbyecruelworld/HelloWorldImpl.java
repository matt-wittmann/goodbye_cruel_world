package org.example.helloworld.goodbyecruelworld;

/**
 * HelloWorldImpl is the main class of the &quot;Goodbye, Cruel World&quot; program.
 */
public class HelloWorldImpl implements HelloWorld {
	/** Hello, world! */
	private static final String HELLO_WORLD = "Hello, world!";

	/**
	 * Greets the world.
	 *
	 * @see org.example.helloworld.goodbyecruelworld.HelloWorld#helloWorld()
	 */
	@Override
	public void helloWorld() {
		System.out.println(HELLO_WORLD);
	}

	/**
	 * Delegates to {@link #helloWorld()}.
	 *
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		helloWorld();
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
