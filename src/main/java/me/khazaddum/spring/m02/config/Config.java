package me.khazaddum.spring.m02.config;

import me.khazaddum.spring.m02.domain.impl.ProjectRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.*;

@Import({ Basic.class })
@Configuration
public class Config {

	private static final Logger LOG = LoggerFactory.getLogger(Config.class);

	public Config() {
		LOG.info("Created");
	}

	@Primary
	@Bean
	public ProjectRepositoryImpl primaryProjectRepository() {
		LOG.info("Binding primary bean to context");
		return new ProjectRepositoryImpl();
	}

	/*
	 * @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR,
	 * ElementType.PARAMETER, ElementType.FIELD})
	 *
	 * @Retention(RetentionPolicy.RUNTIME)
	 *
	 * @Documented public @interface Lazy {
	 */
	@Lazy
	@Bean
	public ProjectRepositoryImpl secondaryProjectRepository() {
		LOG.info("Binding secondary bean to context");
		return new ProjectRepositoryImpl();
	}

}