package me.khazaddum.sf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* Search for components inside a specific package:
 * @SpringBootApplication(scanBasePackages = "me.khazaddum.sf.component.impl")
 * */
@SpringBootApplication
public class Application {

	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		/* Trigger PreDestroy hook
		 * ConfigurableApplicationContext context = SpringApplication.run(new Class[]{Application.class, Config.class}, args);
		 * context.close(); */

		// Another context
		// When created, its BeanFactory is empty; the context does not know where to scan for beans.

		// 1. Scanning a package
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("me.khazaddum.sf.infrastructure.context.component");
		LOG.info("Context ctx created with id '{}'", ctx.getId());

		LOG.info("Context ctx active before close: {}", ctx.isActive());

		ctx.close();

		LOG.info("Context ctx active after close: {}", ctx.isActive());

		// 2. Using the scan() method
		// AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		// ctx.scan("me.khazaddum.sf.infrastructure.context.component");

	}

}
