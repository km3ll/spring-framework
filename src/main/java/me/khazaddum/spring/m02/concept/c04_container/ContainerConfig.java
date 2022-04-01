package me.khazaddum.spring.m02.concept.c04_container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContainerConfig {

	private static final Logger LOG = LoggerFactory.getLogger(ContainerConfig.class);

	@Bean(name = "alpha")
	public BeanAlpha beanAlpha() {
		return new BeanAlpha();
	}

	@Bean(name = "beta")
	public BeanBeta beanBeta() {
		return new BeanBeta();
	}

	@Bean(name = "gamma")
	public BeanGamma beanBGamma() {
		return new BeanGamma();
	}

	@Bean
	public static MyBeanPostProcessorGamma beanPostProcessorGama() {
		return new MyBeanPostProcessorGamma();
	}

	@Bean
	public MyDeltaFactoryBean myDeltaFactoryBean() {
		return new MyDeltaFactoryBean();
	}

}
