package me.khazaddum.sf.service;

import me.khazaddum.sf.persistence.model.Topic;

import java.util.Optional;

public interface ITopicService {

    public Optional<Topic> findById(Integer id);

    public Topic save(Topic topic);

}
