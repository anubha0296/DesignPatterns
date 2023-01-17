package com.anubha.singleton;

public class DateUtil implements Cloneable {

	private static DateUtil instance; // Lazy Initialization

	// Eager Initialization
	// private static DateUtil instance = new DateUtil();

	// Eager Initialization using static block
	// private static DateUtil instance;

//	static {
//		instance = new DateUtil();
//	}

	private DateUtil() {

	}

	public static DateUtil getInstance() {

		if (instance == null) {

			synchronized (DateUtil.class) {
				// Lazy Initialization
				if (instance == null) {
					instance = new DateUtil();
				}
			}
			;

		}

		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
