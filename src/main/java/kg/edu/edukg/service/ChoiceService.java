package kg.edu.edukg.service;

import kg.edu.edukg.dto.ChoiceDto;

import java.util.List;

public interface ChoiceService {
    List<ChoiceDto> getAllByTaskId(Long taskId);
}
