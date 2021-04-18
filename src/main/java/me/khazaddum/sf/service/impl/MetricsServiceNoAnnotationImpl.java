package me.khazaddum.sf.service.impl;

import me.khazaddum.sf.service.IMetricsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetricsServiceNoAnnotationImpl implements IMetricsService {

    private static final Logger log = LoggerFactory.getLogger(MetricsServiceNoAnnotationImpl.class);

    public MetricsServiceNoAnnotationImpl() {
        super();
        log.info("Creating MetricsServiceNoAnnotationImpl");
    }

    @Override
    public void count() {

    }
}
