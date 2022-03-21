package me.khazaddum.sf.config;

import me.khazaddum.sf.infrastructure.injection.pet.OwnerRepository;
import me.khazaddum.sf.infrastructure.injection.pet.PetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PetConfig {

	private static final Logger LOG = LoggerFactory.getLogger(PetConfig.class);

	public PetConfig() {
		LOG.info("Created");
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public OwnerRepository ownerRepository() {
		return new OwnerRepository();
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PetRepository categoryRepository() {
		return new PetRepository();
	}

}
