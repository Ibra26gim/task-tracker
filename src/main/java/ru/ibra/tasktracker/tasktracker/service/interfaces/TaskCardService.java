package ru.ibra.tasktracker.tasktracker.service.interfaces;

import ru.ibra.tasktracker.tasktracker.entity.TaskCardEntity;

public interface TaskCardService {

    public TaskCardEntity save(TaskCardEntity entity);
    public TaskCardEntity getById(Long id);
}
