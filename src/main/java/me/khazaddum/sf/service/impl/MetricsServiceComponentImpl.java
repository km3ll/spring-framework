package me.khazaddum.sf.service.impl;

import me.khazaddum.sf.service.IMetricsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MetricsServiceComponentImpl implements IMetricsService {

    private static final Logger log = LoggerFactory.getLogger(MetricsServiceComponentImpl.class);

    public MetricsServiceComponentImpl() {
        super();
        log.info("Creating MetricsServiceComponentImpl");
    }

    @Override
    public void count() {
    }

}
