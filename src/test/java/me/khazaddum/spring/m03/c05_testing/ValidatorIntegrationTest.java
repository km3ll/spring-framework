package me.khazaddum.spring.m03.c05_testing;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("Integration")
@SpringJUnitConfig(classes = ValidatorConfig.class)
public class ValidatorIntegrationTest {

	@Autowired
	private IValidator validator;

	@Test
	public void givenAutowiredValidator_thenItIdentifiesEvenNumber() {

		ValidatorImpl validator = new ValidatorImpl();
		assertTrue(validator.isEven(100));

	}

	@Test
	public void givenAutowiredValidator_thenItIdentifiesOddNumber() {

		ValidatorImpl validator = new ValidatorImpl();
		assertFalse(validator.isEven(111));

	}

}
