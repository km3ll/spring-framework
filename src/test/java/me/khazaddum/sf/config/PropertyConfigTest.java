package me.khazaddum.sf.config;

import static org.junit.jupiter.api.Assertions.*;

import me.khazaddum.sf.Application;
import org.junit.jupiter.api.Test;
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