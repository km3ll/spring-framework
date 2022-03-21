package erebor.spring.m02.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Repository {
 */
@Repository
public class TaskRepository {

	private static final Logger LOG = LoggerFactory.getLogger(TaskRepository.class);

	private List<Task> tasks = new ArrayList<Task>();

	public TaskRepository() {
		LOG.info("Created");
	}

	public Optional<Task> findById(Long id) {
		return tasks.stream().filter(p -> p.getId().equals(id)).findFirst();
	}

	public Task save(Task task) {
		Task existingTask = findById(task.getId()).orElse(null);
		if (null == existingTask) {
			tasks.add(task);
		}
		else {
			tasks.remove(task);
			Task newTask = new Task(task);
			tasks.add(newTask);
		}
		return task;
	}

}