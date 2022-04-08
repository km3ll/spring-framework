package me.khazaddum.spring.m03.c05_testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ValidatorImpl implements IValidator {

	private static final Logger LOG = LoggerFactory.getLogger(ValidatorImpl.class);

	public ValidatorImpl() {
		LOG.info("Created");
	}

	@Override
	public boolean isEven(int value) {
		return value % 2 == 0;
	}

}
