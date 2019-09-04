package com.paulocorrea.tasks.repository;

import com.paulocorrea.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
