package me.khazaddum.sf.domain.service;

import me.khazaddum.sf.domain.persistence.model.Topic;

import java.util.Optional;

public interface ITopicService {

	public Optional<Topic> findById(Integer id);

	public Topic save(Topic topic);

}
