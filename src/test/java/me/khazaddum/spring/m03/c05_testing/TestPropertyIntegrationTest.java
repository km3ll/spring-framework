package me.khazaddum.spring.m03.c05_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@Tag("Integration")
@SpringJUnitConfig()
@TestPropertySource(locations = "classpath:test.properties")
public class TestPropertyIntegrationTest {

	@Value("${m03.c05.property}")
	private String property;

	@Test
	public void givenPropertiesFile_thenValueIsRead() {

		assertEquals("Test Drive 6", property);

	}

}
