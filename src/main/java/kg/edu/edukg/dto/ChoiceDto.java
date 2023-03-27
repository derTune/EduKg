package kg.edu.edukg.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChoiceDto {
    private Long id;

    private String choice;

    private Boolean isAnswer;

    private Long taskId;
}
