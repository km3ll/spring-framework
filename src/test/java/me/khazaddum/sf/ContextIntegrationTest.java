package me.khazaddum.sf;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import me.khazaddum.sf.config.TestConfig;
import me.khazaddum.sf.infrastructure.testing.GreetingRepository;
import me.khazaddum.sf.infrastructure.testing.GreetingServiceI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig( classes = TestConfig.class )
public class ContextIntegrationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private GreetingServiceI greetingService;

    @MockBean
    private GreetingRepository greetingRepository;

    @Test
    public void whenContextIsLoaded_thenNoExceptions() {

    }

    @Test
    public void whenGreeting_thenOk() {

        String greeting = greetingService.greet("John Wick");
        assertNotNull(greeting);

    }

}
