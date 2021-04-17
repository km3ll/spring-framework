package me.khazaddum.sf.service.impl;

import me.khazaddum.sf.persistence.model.Topic;
import me.khazaddum.sf.persistence.repository.ITopicRepository;
import me.khazaddum.sf.service.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

public class TopicServiceImpl implements ITopicService {

    @Autowired
    private ITopicRepository topicRepository;

    @Override
    public Optional<Topic> findById(Integer id) {
        return topicRepository.findById(id);
    }

    @Override
    public Topic save(Topic topic) {
        return topicRepository.save(topic);
    }

}
