package com.paulocorrea.tasks.service;

import com.paulocorrea.tasks.domain.Task;
import com.paulocorrea.tasks.repository.TaskRepository;

public class TaskServiceImp  implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImp(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return null;
    }
}
