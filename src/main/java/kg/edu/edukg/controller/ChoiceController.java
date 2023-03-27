package kg.edu.edukg.controller;

import kg.edu.edukg.dto.ChoiceDto;
import kg.edu.edukg.service.ChoiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ChoiceController {
    final ChoiceService choiceService;

    public ChoiceController(ChoiceService choiceService) {
        this.choiceService = choiceService;
    }

    @GetMapping("/tasks/{taskId}/choices")
    public List<ChoiceDto> getChoices(@PathVariable Long taskId) {
        List<ChoiceDto> choices = choiceService.getAllByTaskId(taskId);
        Collections.shuffle(choices);
        return choices;
    }
}
