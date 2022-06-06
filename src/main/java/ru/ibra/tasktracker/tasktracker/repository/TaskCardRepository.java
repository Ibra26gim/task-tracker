package ru.ibra.tasktracker.tasktracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ibra.tasktracker.tasktracker.entity.TaskCardEntity;

public interface TaskCardRepository extends JpaRepository<TaskCardEntity, Long> {

}
