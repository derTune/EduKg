package kg.edu.edukg.service;

import kg.edu.edukg.dto.TaskDto;

import java.util.List;

public interface TaskService {
    List<TaskDto> getByTestId(Long testId);
}
