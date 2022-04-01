package me.khazaddum.spring.m02.concept.c03_scope;

import me.khazaddum.spring.m02.concept.c03_scope.impl.OwnerRepositoryImpl;
import me.khazaddum.spring.m02.concept.c03_scope.impl.PetRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {

	private static final Logger LOG = LoggerFactory.getLogger(ScopeConfig.class);

	public ScopeConfig() {
		LOG.info("Created");
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public IPetRepository singletonBean() {
		return new PetRepositoryImpl();
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public IOwnerRepository prototypeBean() {
		return new OwnerRepositoryImpl();
	}

}
