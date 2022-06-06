package ru.ibra.tasktracker.tasktracker.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ibra.tasktracker.tasktracker.entity.TaskCardEntity;
import ru.ibra.tasktracker.tasktracker.service.impl.TaskCardServiceImpl;
import ru.ibra.tasktracker.tasktracker.service.interfaces.TaskCardService;

@RestController
@RequestMapping("/api/task")
public class TaskCardController {

    @Autowired
    private TaskCardService taskCardService;

    @GetMapping("/get-task-card/{id}")
    public TaskCardEntity getByid(@PathVariable Long id){
        return taskCardService.getById(id);
    }

    @PostMapping("create-task")
    public TaskCardEntity save(@RequestBody TaskCardEntity taskCardEntity){
        return taskCardService.save(taskCardEntity);
    }

}
