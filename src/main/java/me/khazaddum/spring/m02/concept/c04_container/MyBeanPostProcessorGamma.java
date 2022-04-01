package me.khazaddum.spring.m02.concept.c04_container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class MyBeanPostProcessorGamma implements BeanPostProcessor, Ordered {

	private static final Logger LOG = LoggerFactory.getLogger(MyBeanPostProcessorGamma.class);

	public MyBeanPostProcessorGamma() {
		LOG.info("Created");
	}

	// Before
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("gamma")) {
			LOG.info("Before initializing bean: {}", beanName);
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	// After
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("gamma")) {
			LOG.info("After initializing bean: {}", beanName);
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public int getOrder() {
		return 2;
	}

}
