package me.khazaddum.sf.service.impl;

import me.khazaddum.sf.persistence.repository.impl.TopicRepositoryImpl;
import me.khazaddum.sf.service.IEventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EventServiceImpl implements IEventService {

    private static final Logger log = LoggerFactory.getLogger(EventServiceImpl.class);

    public EventServiceImpl() {
        super();
        log.info("Creating EventService");
    }

    @Override
    public void publish(String message) {

    }
}
