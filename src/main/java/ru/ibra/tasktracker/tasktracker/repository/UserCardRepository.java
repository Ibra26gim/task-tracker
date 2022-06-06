package ru.ibra.tasktracker.tasktracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ibra.tasktracker.tasktracker.entity.UserCardEntity;

public interface UserCardRepository extends JpaRepository<UserCardEntity, Long> {

}
