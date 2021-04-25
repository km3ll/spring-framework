package me.khazaddum.sf.persistence.repository.impl;

import me.khazaddum.sf.persistence.model.Topic;
import me.khazaddum.sf.persistence.repository.ITopicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TopicRepositoryImpl implements ITopicRepository {

    private static final Logger LOG = LoggerFactory.getLogger(TopicRepositoryImpl.class);

    private List<Topic> topics = new ArrayList<>();

    public TopicRepositoryImpl() {
        super();
        LOG.info("Created");
    }

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
