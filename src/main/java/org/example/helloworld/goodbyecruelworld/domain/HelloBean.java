package org.example.helloworld.goodbyecruelworld.domain;

/**
 * JavaBean encapsulating core &quot;Hello, World&quot; message payload.
 */
public class HelloBean {
	/** Hello, world. */
	private static final String HELLO_WORLD = "Hello, world!";
	/** We wish to say only, &quot;Hello, world!&quot; with the HelloBean. */
	private static final String ERR_NOT_HELLO = "HelloBean constructor argument must be: " + HELLO_WORLD;
	private String hello;

	/**
	 * Default constructor sets {@link #hello} to &quot;Hello, world!&quot;.
	 */
	public HelloBean() {
		this(HELLO_WORLD);
	}

	/**
	 * Constructor sets {@link #hello}.
	 *
	 * @param hello {@link java.lang.String}
	 */
	public HelloBean(String hello) {
		// Enforcing valid helloness
		if (!HELLO_WORLD.equals(hello)) {
			throw new IllegalArgumentException(ERR_NOT_HELLO);
		}

		this.hello = hello;
	}

	/**
	 * Gets the {@link #hello}.
	 *
	 * @return {@link java.lang.String}
	 * @see #setHello
	 */
	public String getHello() {
		return hello;
	}

	/**
	 * Sets {@link #hello}.
	 *
	 * @param hello {@link java.lang.String}
	 * @see #getHello
	 */
	public void setHello(String hello) {
		this.hello = hello;
	}

	/**
	 * Gets the default value for {@link #hello}.
	 *
	 * @return {@link #HELLO_WORLD}
	 */
	public static String getDefaultHello() {
		return HELLO_WORLD;
	}
}
