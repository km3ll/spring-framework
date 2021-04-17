package me.khazaddum.sf.persistence.repository.impl;

import me.khazaddum.sf.persistence.model.Topic;
import me.khazaddum.sf.persistence.repository.ITopicRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TopicRepositoryImpl implements ITopicRepository {

    private List<Topic> topics = new ArrayList<>();

    @Override
    public Optional<Topic> findById(Integer id) {
        return topics.stream()
            .filter( p -> p.getId().equals(id) )
            .findFirst();
    }

    @Override
    public Topic save(Topic topic) {
        Topic existingTopic = findById(topic.getId()).orElse(null);
        if (existingTopic == null) {
            topics.add(topic);
        } else {
            topics.remove(topic);
            Topic newTopic = new Topic(topic);
            topics.add(newTopic);
        }
        return topic;
    }

}
