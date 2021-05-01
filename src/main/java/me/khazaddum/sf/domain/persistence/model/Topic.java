package me.khazaddum.sf.domain.persistence.model;

import java.util.Objects;
import java.util.Random;

public class Topic {

    private Integer id;
    private String name;

    public Topic(Integer id, String name) {
        if (Objects.isNull(id)) {
            id = new Random().nextInt();
        }
        this.id = id;
        this.name = name;
    }

    public Topic(Topic topic) {
        this.id = topic.getId();
        this.name = topic.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topic [ id=" + id + ", name='" + name + '\'' + "] \n";
    }

}
