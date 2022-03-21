package me.khazaddum.sf.infrastructure.container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class ContainerFirstBeanPostProcessor implements BeanPostProcessor, Ordered {

	private static final Logger LOG = LoggerFactory.getLogger(ContainerFirstBeanPostProcessor.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("item") || beanName.equals("product")) {
			LOG.info("Order {}, before initializing bean '{}'", getOrder(), beanName);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("item") || beanName.equals("product")) {
			LOG.info("Order {}, after initializing bean '{}'", getOrder(), beanName);
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 1;
	}

}
