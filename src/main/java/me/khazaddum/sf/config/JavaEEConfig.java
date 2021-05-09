package me.khazaddum.sf.config;

import me.khazaddum.sf.infrastructure.javaee.AccountRepositoryCacheImpl;
import me.khazaddum.sf.infrastructure.javaee.AccountRepositoryDbImpl;
import me.khazaddum.sf.infrastructure.javaee.AccountRepositoryH2Impl;
import me.khazaddum.sf.infrastructure.javaee.IAccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaEEConfig {

    private static final Logger LOG = LoggerFactory.getLogger(JavaEEConfig.class);

    public JavaEEConfig() {
        LOG.info("Created");
    }

    @Bean
    public IAccountRepository accountRepositoryCacheImpl() {
        return new AccountRepositoryCacheImpl();
    }

    @Bean
    public IAccountRepository accountRepositoryDbImpl() {
        return new AccountRepositoryDbImpl();
    }

    @Bean
    public IAccountRepository accountRepositoryH2Impl() {
        return new AccountRepositoryH2Impl();
    }

}
