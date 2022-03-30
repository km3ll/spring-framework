package me.khazaddum.spring.m02.concept.c05_context;

import me.khazaddum.spring.m02.concept.c05_context.service.IContextService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class M02ContextApplication {

    private static final Logger LOG = LoggerFactory.getLogger(M02ContextApplication.class);

    public static void main(String[] args) throws InterruptedException {

        SpringApplication.run(M02ContextApplication.class, args);

        String basePackage = "me.khazaddum.spring.m02.concept.c05_context.service";

        AnnotationConfigApplicationContext ctxOne = new AnnotationConfigApplicationContext(basePackage);
        LOG.info("Context One created with ID '{}'", ctxOne.getId());
        LOG.info("Context One is active: {}", ctxOne.isActive());

        IContextService contextService = ctxOne.getBean("contextServiceImpl", IContextService.class);
        LOG.info("Bean from context: {}", contextService);

        ctxOne.close();
        LOG.info("Context One is active: {}", ctxOne.isActive());

        AnnotationConfigApplicationContext ctxTwo = new AnnotationConfigApplicationContext();
        ctxTwo.scan(basePackage);
        LOG.info("Context Two created with ID '{}'", ctxTwo.getId());
        ctxTwo.close();

    }

}
