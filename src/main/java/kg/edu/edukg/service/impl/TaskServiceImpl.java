package kg.edu.edukg.service.impl;

import kg.edu.edukg.db.entities.Task;
import kg.edu.edukg.db.repo.TaskRepo;
import kg.edu.edukg.dto.TaskDto;
import kg.edu.edukg.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {
    final TaskRepo taskRepo;

    public TaskServiceImpl(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    @Override
    public List<TaskDto> getByTestId(Long testId) {
        List<Task> tasks = taskRepo.getAllByTestId(testId);
        return tasks.stream()
                .map(Task::getTaskDto)
                .collect(Collectors.toList());
    }
}
