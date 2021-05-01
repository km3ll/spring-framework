package me.khazaddum.sf.infrastructure.container;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class Item {

    private static final Logger LOG = LoggerFactory.getLogger(Item.class);

    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
        LOG.info("Created with id={}, name={}", id, name);
    }

    public Item() {
        LOG.info("Created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
