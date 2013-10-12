package org.example.helloworld.goodbyecruelworld.domain;

import org.example.helloworld.goodbyecruelworld.constants.HelloConstants;

/**
 * JavaBean encapsulating core &quot;Hello, World&quot; message payload.
 */
public class HelloBean implements Cloneable {
	/** We wish to say only, &quot;Hello, world!&quot; with the HelloBean. */
	private static final String ERR_NOT_HELLO = "HelloBean constructor argument must be: " + HelloConstants.HELLO_WORLD;
	private String hello;

	/**
	 * Default constructor sets {@link #hello} to &quot;Hello, world!&quot;.
	 */
	public HelloBean() {
		this(HelloConstants.HELLO_WORLD);
	}

	/**
	 * Constructor sets {@link #hello}.
	 *
	 * @param hello {@link java.lang.String}
	 */
	public HelloBean(String hello) {
		// Enforcing valid helloness
		if (!HelloConstants.HELLO_WORLD.equals(hello)) {
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
	 * @return {@link HelloConstants#HELLO_WORLD}
	 */
	public static String getDefaultHello() {
		return HelloConstants.HELLO_WORLD;
	}

	/**
	 * Clones this HelloBean.
	 *
	 * @return A new copy of this HelloBean
	 * @see java.lang.Object#clone()
	 */
	@Override
	public HelloBean clone() {
		return new HelloBean(hello);
	}
}
