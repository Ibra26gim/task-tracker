package ru.ibra.tasktracker.tasktracker.service.interfaces;

import ru.ibra.tasktracker.tasktracker.entity.UserCardEntity;

public interface UserCardService {

    public UserCardEntity save(UserCardEntity entity);
    public UserCardEntity getById(Long id);
}
