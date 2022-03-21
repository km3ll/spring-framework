package me.khazaddum.sf.config;

import me.khazaddum.sf.infrastructure.container.ContainerStaticBeanPostProcessor;
import me.khazaddum.sf.infrastructure.container.ItemFactoryBean;
import me.khazaddum.sf.infrastructure.container.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* Mix and run multiple configurations: @Import({EmailConfig.class}) */
@Configuration
public class ContainerConfig {

	private static final Logger LOG = LoggerFactory.getLogger(ContainerConfig.class);

	public ContainerConfig() {
		LOG.info("Created");
	}

	@Bean
	public Product product() {
		return new Product();
	}

	/*
	 * Defining the bean method as static will ensure that such beans are created even
	 * before the containing configuration class gets initialized, hence avoiding
	 * triggering other parts of the configuration at that point.
	 */
	@Bean
	public static ContainerStaticBeanPostProcessor containerStaticBeanPostProcessor() {
		return new ContainerStaticBeanPostProcessor();
	}

	@Bean
	public static ItemFactoryBean itemFactoryBean() {
		return new ItemFactoryBean();
	}

}
