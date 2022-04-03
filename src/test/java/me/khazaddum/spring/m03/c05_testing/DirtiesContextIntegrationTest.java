package me.khazaddum.spring.m03.c05_testing;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@Tag("Integration")
@SpringJUnitConfig
@DirtiesContext
@ActiveProfiles("default")
public class DirtiesContextIntegrationTest {

	private static final Logger LOG = LoggerFactory.getLogger(DirtiesContextIntegrationTest.class);

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void whenContextIsLoaded_thenNotCachedOne() {
		LOG.info("Application context not cached ID: {}", applicationContext.getId());
		assertNotNull(applicationContext);
	}

	@Test
	public void whenContextIsLoaded_thenNotCachedTwo() {
		LOG.info("Application context not cached ID: {}", applicationContext.getId());
		assertNotNull(applicationContext);
	}

}
