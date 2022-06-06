package ru.ibra.tasktracker.tasktracker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibra.tasktracker.tasktracker.entity.UserCardEntity;
import ru.ibra.tasktracker.tasktracker.repository.UserCardRepository;
import ru.ibra.tasktracker.tasktracker.service.interfaces.UserCardService;

@Service
public class UserCardServiceImpl implements UserCardService {

    @Autowired
    private UserCardRepository userCardRepository;

    @Override
    public UserCardEntity save(UserCardEntity entity) {
        return userCardRepository.save(entity);
    }

    @Override
    public UserCardEntity getById(Long id) {
        return userCardRepository.getReferenceById(id);
    }
}
