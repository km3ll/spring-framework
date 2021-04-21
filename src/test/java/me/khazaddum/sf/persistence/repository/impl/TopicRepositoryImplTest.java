package me.khazaddum.sf.persistence.repository.impl;

import static org.junit.jupiter.api.Assertions.*;

import me.khazaddum.sf.persistence.model.Topic;
import me.khazaddum.sf.persistence.repository.ITopicRepository;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("unit")
class TopicRepositoryImplTest {

    @Test
    void findById_givenDummyId_returnsEmpty() {
        assertFalse(new TopicRepositoryImpl().findById(1100).isPresent());
    }

    @Test
    void findById_givenExistingId_returnsNonEmpty() {

        ITopicRepository repository = new TopicRepositoryImpl();
        Topic newTopic = new Topic(1101, "Movies");

        repository.save(newTopic);

        assertTrue(repository.findById(1101).isPresent());

    }

}