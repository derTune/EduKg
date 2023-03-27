package kg.edu.edukg.service.impl;

import kg.edu.edukg.db.entities.Choice;
import kg.edu.edukg.db.repo.ChoiceRepo;
import kg.edu.edukg.dto.ChoiceDto;
import kg.edu.edukg.service.ChoiceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChoiceServiceImpl implements ChoiceService {
    final ChoiceRepo choiceRepo;

    public ChoiceServiceImpl(ChoiceRepo choiceRepo) {
        this.choiceRepo = choiceRepo;
    }

    @Override
    public List<ChoiceDto> getAllByTaskId(Long taskId) {
        List<Choice> choices = choiceRepo.getAllByTaskId(taskId);
        return choices.stream()
                .map(Choice::getChoiceDto)
                .collect(Collectors.toList());
    }
}
