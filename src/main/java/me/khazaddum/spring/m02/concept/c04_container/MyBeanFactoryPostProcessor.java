package me.khazaddum.spring.m02.concept.c04_container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	private static final Logger LOG = LoggerFactory.getLogger(MyBeanFactoryPostProcessor.class);

	private static final String BEAN_NAME = "beta";

	public MyBeanFactoryPostProcessor() {
		LOG.info("Created");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory)
			throws BeansException {

		BeanDefinition bd = configurableListableBeanFactory.getBeanDefinition(BEAN_NAME);
		bd.getPropertyValues().add("status", "modified");

	}

}
