package me.khazaddum.spring.m02.concept.c04_container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessorBeta implements BeanPostProcessor, Ordered {

	private static final Logger LOG = LoggerFactory.getLogger(MyBeanPostProcessorBeta.class);

	public MyBeanPostProcessorBeta() {
		LOG.info("Created");
	}

	// Before
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("beta")) {
			LOG.info("Before initializing bean: {}", beanName);
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	// After
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("beta")) {
			LOG.info("After initializing bean: {}", beanName);
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public int getOrder() {
		return 2;
	}

}
