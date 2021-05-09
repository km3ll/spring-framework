package me.khazaddum.sf.infrastructure.container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class Product {

    private static final Logger LOG = LoggerFactory.getLogger(Product.class);

    private int code;
    private String name;

    public Product() {
        LOG.info("Created");
    }

    @PostConstruct
    public void postConstruct() {
        LOG.info("Instance values: code={}, name={}", this.code, this.name);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
