package erebor.spring.m02.domain;

import java.util.Objects;

public class Task {

    private Long id;
    private String name;

    public Task(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Task(Task task) {
        this(task.getId(), task.getName());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Override {
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}