package me.khazaddum.sf.config;

import static org.junit.jupiter.api.Assertions.*;

import me.khazaddum.sf.Application;
import me.khazaddum.sf.infrastructure.testing.GreetingRepository;
import me.khazaddum.sf.infrastructure.testing.GreetingServiceI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = Application.class)
@TestPropertySource(locations = { "classpath:application.properties", "classpath:test.properties" })
public class PropertyConfigTest {

	@Value("${test.property}")
	private String testProperty;

	@Test
	public void whenTestPropertySource_thenValueRetrieved() {
		assertEquals("testdrive", testProperty);
	}

}