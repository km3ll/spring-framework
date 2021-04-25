package me.khazaddum.sf.service.impl;

import me.khazaddum.sf.persistence.model.Topic;
import me.khazaddum.sf.persistence.repository.ITopicRepository;
import me.khazaddum.sf.service.ITopicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TopicServiceImpl implements ITopicService {

    private static final Logger LOG = LoggerFactory.getLogger(TopicServiceImpl.class);

    @Autowired
    private ITopicRepository topicRepository;

    public TopicServiceImpl() {
        super();
        LOG.info("Creating TopicService");
    }

    @Override
    public Optional<Topic> findById(Integer id) {
        return topicRepository.findById(id);
    }

    @Override
    public Topic save(Topic topic) {
        return topicRepository.save(topic);
    }

}
