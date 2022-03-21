package me.khazaddum.sf.infrastructure.container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class ContainerSecondBeanPostProcessor implements BeanPostProcessor, Ordered {

	private static final Logger LOG = LoggerFactory.getLogger(ContainerSecondBeanPostProcessor.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("product")) {
			Product product = (Product) bean;
			LOG.info("Order {}, before initializing bean 'product': code={}, name={}", getOrder(), product.getCode(),
					product.getName());
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("product")) {
			Product product = (Product) bean;
			LOG.info("Order {}, after initializing bean 'product': code={}, name={}", getOrder(), product.getCode(),
					product.getName());
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 2;
	}

}
