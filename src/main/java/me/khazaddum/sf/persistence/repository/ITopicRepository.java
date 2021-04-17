package me.khazaddum.sf.persistence.repository;

import me.khazaddum.sf.persistence.model.Topic;
import java.util.Optional;

public interface ITopicRepository {

    public Optional<Topic> findById(Integer id);

    Topic save(Topic topic);

}
