package kg.edu.edukg.dto;

import kg.edu.edukg.common.TaskType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskDto {
    private Long id;

    private String text;

    private TaskType type;

    private Long testId;
}
