package erebor.spring.m02.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import erebor.spring.m02.domain.ProjectRepository;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

import java.lang.annotation.*;

/*
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Configuration {
 */
@Import({ BaseConfig.class })
@Configuration
public class RepositoryConfig {

	private static final Logger LOG = LoggerFactory.getLogger(RepositoryConfig.class);

	public RepositoryConfig() {
		LOG.info("Created");
	}

	/*
	 * @Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
	 *
	 * @Retention(RetentionPolicy.RUNTIME)
	 *
	 * @Documented public @interface Bean {
	 */
	@Bean
	public ProjectRepository mainProjectRepository() {
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
		return new ProjectRepository();
	}

}
