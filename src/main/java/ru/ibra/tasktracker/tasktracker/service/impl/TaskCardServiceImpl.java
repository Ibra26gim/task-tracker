package ru.ibra.tasktracker.tasktracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibra.tasktracker.tasktracker.entity.TaskCardEntity;
import ru.ibra.tasktracker.tasktracker.repository.TaskCardRepository;
import ru.ibra.tasktracker.tasktracker.service.interfaces.TaskCardService;

@Service
public class TaskCardServiceImpl implements TaskCardService {

    @Autowired
    private TaskCardRepository taskCardRepository;

    @Override
    public TaskCardEntity save(TaskCardEntity entity) {
        return taskCardRepository.save(entity);
    }

    @Override
    public TaskCardEntity getById(Long id) {
        return taskCardRepository.getReferenceById(id);
    }
}
