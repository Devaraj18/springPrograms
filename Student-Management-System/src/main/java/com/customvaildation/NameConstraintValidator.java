package com.customvaildation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameConstraintValidator implements ConstraintValidator<IsValidName, String> {
	private static final String NAME_PATTERN = "^[A-Za-z]*$";
	private Pattern pattern;
	private Matcher matcher;

	public NameConstraintValidator() {
		pattern = Pattern.compile(NAME_PATTERN);
	}

	@Override
	public void initialize(IsValidName isValidName) {
		isValidName.message();
	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext cxt) {
		if (name == null) {
			return false;
		}
		matcher = pattern.matcher(name);
		return matcher.matches();
	}
}
