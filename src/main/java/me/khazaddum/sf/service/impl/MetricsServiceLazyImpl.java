package me.khazaddum.sf.service.impl;

import me.khazaddum.sf.service.IMetricsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MetricsServiceLazyImpl implements IMetricsService {

    private static final Logger log = LoggerFactory.getLogger(MetricsServiceLazyImpl.class);

    public MetricsServiceLazyImpl() {
        super();
        log.info("Creating MetricsServiceLazyImpl");
    }

    @Override
    public void count() {
    }

}
