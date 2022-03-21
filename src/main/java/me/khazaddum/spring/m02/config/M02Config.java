package me.khazaddum.spring.m02.config;

import me.khazaddum.spring.m02.domain.ProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.*;

@Import({ BaseConfig.class })
@Configuration
public class M02Config {

	private static final Logger LOG = LoggerFactory.getLogger(M02Config.class);

	public M02Config() {
		LOG.info("Created");
	}

	@Primary
	@Bean
	public ProjectRepository primaryProjectRepository() {
		LOG.info("Binding primary bean to context");
		return new ProjectRepository();
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
	public ProjectRepository secondaryProjectRepository() {
		LOG.info("Binding secondary bean to context");
		return new ProjectRepository();
	}

}