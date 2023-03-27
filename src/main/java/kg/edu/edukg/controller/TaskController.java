package kg.edu.edukg.controller;

import kg.edu.edukg.dto.TaskDto;
import kg.edu.edukg.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<TaskDto> getAllTasks(@RequestParam Long testId) {
        return taskService.getByTestId(testId);
    }
}
