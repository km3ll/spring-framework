package me.khazaddum.sf.infrastructure.testing;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GreetingServiceWithRepoImplUnitTest {

    @Mock
    GreetingRepository greetingRepository;

    @InjectMocks
    GreetingServiceWithRepo greetingServiceWithRepo;

    @Test
    public void whenGreeting_ThenOk() {

        String mocked = "Hola, ";
        when(greetingRepository.getGreeting()).thenReturn("Hola, ");

        String greeting = greetingServiceWithRepo.greet( "John Wick" );
        assertEquals( "Hola, John Wick", greeting)  ;

    }

}