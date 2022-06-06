package ru.ibra.tasktracker.tasktracker.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ibra.tasktracker.tasktracker.entity.TaskCardEntity;
import ru.ibra.tasktracker.tasktracker.entity.UserCardEntity;
import ru.ibra.tasktracker.tasktracker.service.interfaces.TaskCardService;
import ru.ibra.tasktracker.tasktracker.service.interfaces.UserCardService;

@RestController
@RequestMapping("/api/task")
public class UserCardController {

    @Autowired
    private UserCardService userCardService;

    @GetMapping("/get-user-card/{id}")
    public UserCardEntity getById(@PathVariable Long id){
        return userCardService.getById(id);
    }

    @PostMapping("/create-user")
    public UserCardEntity save(@RequestBody UserCardEntity userCardEntity){
        return userCardService.save(userCardEntity);
    }

}