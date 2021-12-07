package com.config;


import java.util.MissingResourceException;
import java.util.ResourceBundle;


public class JDBCConfiguration {
	private static final String BUNDLE_NAME = "application";

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private JDBCConfiguration() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException mre) {
			return "ERROR:" + key;
		}
	}
}