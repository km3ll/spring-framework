package erebor.spring.m02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(
    excludeFilters = {@Filter(
    type = FilterType.CUSTOM,
    classes = {TypeExcludeFilter.class}
), @Filter(
    type = FilterType.CUSTOM,
    classes = {AutoConfigurationExcludeFilter.class}
)}
)
public @interface SpringBootApplication {
 */

// @SpringBootApplication( scanBasePackages = erebor.spring.m02.config"" )
@SpringBootApplication
public class ApplicationM02 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationM02.class, args);
	}

}
