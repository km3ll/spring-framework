package me.khazaddum.spring.m02.concept.c02_lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfig {

	@Bean
	public AnnotatedBean annotatedBean() {
		return new AnnotatedBean();
	}

	@Bean(initMethod = "initialize", destroyMethod = "destroy")
	public CleanBean cleanBean() {
		return new CleanBean();
	}

}
