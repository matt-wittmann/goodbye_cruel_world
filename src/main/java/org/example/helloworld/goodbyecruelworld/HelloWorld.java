package org.example.helloworld.goodbyecruelworld;

/**
 * HelloWorld is the main class of the &quot;Goodbye, Cruel World&quot; program.
 */
public class HelloWorld implements Runnable {
	/** Hello, world! */
	private static final String HELLO_WORLD = "Hello, world!";

	/**
	 * Runs the program.
	 *
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println(HELLO_WORLD);
	}

	/**
	 * Point of entry into this Java program.
	 *
	 * @param args Command-line arguments to this Java program
	 */
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.run();
	}
}
