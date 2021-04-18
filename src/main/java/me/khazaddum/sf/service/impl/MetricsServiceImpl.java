package me.khazaddum.sf.service.impl;

import me.khazaddum.sf.service.IMetricsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MetricsServiceImpl implements IMetricsService {

    private static final Logger log = LoggerFactory.getLogger(MetricsServiceImpl.class);

    public MetricsServiceImpl() {
        super();
        log.info("Creating MetricsService");
    }

    @Override
    public void count() {
    }

}
