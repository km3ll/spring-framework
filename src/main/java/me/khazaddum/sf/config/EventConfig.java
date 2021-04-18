package me.khazaddum.sf.config;

import me.khazaddum.sf.persistence.repository.ITopicRepository;
import me.khazaddum.sf.persistence.repository.impl.TopicRepositoryImpl;
import me.khazaddum.sf.service.IEventService;
import me.khazaddum.sf.service.impl.EventServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfig {

    private static final Logger log = LoggerFactory.getLogger(EventConfig.class);

    public EventConfig() {
        super();
        log.info("Creating EventConfig");
    }

    @Bean
    public IEventService eventService() {
        return new EventServiceImpl();
    }

}
