package me.khazaddum.spring.m03.c05_testing;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@Tag("Integration")
@SpringJUnitConfig
public class ContextIntegrationTest {

	private static final Logger LOG = LoggerFactory.getLogger(ContextIntegrationTest.class);

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void whenContextIsLoaded_thenNoExceptions() {
		LOG.info("Application context ID: {}", applicationContext.getId());
		assertNotNull(applicationContext);
	}

	@Test
	public void whenContextIsLoaded_thenCached() {
		LOG.info("Application context cached with ID: {}", applicationContext.getId());
		assertNotNull(applicationContext);
	}

}
