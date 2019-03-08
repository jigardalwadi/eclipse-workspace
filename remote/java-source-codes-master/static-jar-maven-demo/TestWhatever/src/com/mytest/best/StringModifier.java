package com.mytest.best;

import static org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase;

public class StringModifier {

	public String appendSensitiveWaring(String message) {

		return appendIfMissingIgnoreCase(message, "This is meant for VA employee");

	}

}
