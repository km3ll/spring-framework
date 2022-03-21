package me.khazaddum.sf.infrastructure.container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

public class ContainerStaticBeanPostProcessor implements BeanPostProcessor {

	private static final Logger LOG = LoggerFactory.getLogger(ContainerStaticBeanPostProcessor.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("product")) {
			Product product = (Product) bean;
			LOG.info("Before initializing bean 'product'");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("product")) {
			Product product = (Product) bean;
			LOG.info("Order {}, after initializing bean 'product'");
		}
		return bean;
	}

}
