package me.khazaddum.sf.infrastructure.container;

import me.khazaddum.sf.config.BeanConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class ContainerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private static final Logger LOG = LoggerFactory.getLogger(ContainerBeanFactoryPostProcessor.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        LOG.info("Initializing bean 'product': code '1100', name 'coffee'");

        BeanDefinition bd = configurableListableBeanFactory.getBeanDefinition("product");

        bd.getPropertyValues().add("code", 1100L);
        bd.getPropertyValues().add("name", "coffee");

    }

}
