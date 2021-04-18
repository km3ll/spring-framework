package me.khazaddum.sf.config;

import me.khazaddum.sf.persistence.repository.ITopicRepository;
import me.khazaddum.sf.persistence.repository.impl.TopicRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfig {

    private static final Logger log = LoggerFactory.getLogger(PersistenceConfig.class);

    @Bean
    public ITopicRepository topicRepository() {
        log.info("Initializing TopicRepository");
        return new TopicRepositoryImpl();
    }

}
