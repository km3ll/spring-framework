package me.khazaddum.spring.m03.c05_testing;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("Unit")
public class ValidatorUnitTest {

	@Test
	public void givenValidator_thenItIdentifiesEvenNumber() {

		ValidatorImpl validator = new ValidatorImpl();
		assertTrue(validator.isEven(100));

	}

	@Test
	public void givenValidator_thenItIdentifiesOddNumber() {

		ValidatorImpl validator = new ValidatorImpl();
		assertFalse(validator.isEven(111));

	}

}