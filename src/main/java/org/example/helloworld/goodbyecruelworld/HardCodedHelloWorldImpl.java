package org.example.helloworld.goodbyecruelworld;

import org.example.helloworld.goodbyecruelworld.domain.HelloBean;

/**
 * HardCodedHelloWorldImpl is the main class of the &quot;Goodbye, Cruel World&quot; program.
 */
public class HardCodedHelloWorldImpl implements HelloWorld {
	private HelloBean helloBean;

	/**
	 * Default constructor.
	 */
	public HardCodedHelloWorldImpl() {
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
}
