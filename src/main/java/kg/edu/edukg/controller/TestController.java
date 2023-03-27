package kg.edu.edukg.controller;

import kg.edu.edukg.dto.TestDto;
import kg.edu.edukg.service.TestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
    final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/tests")
    public List<TestDto> getAllTests(@RequestParam("userId") Long userId) {
        return testService.getAll(userId);
    }

    @PostMapping("/tests")
    public TestDto save(@RequestBody TestDto testDto) {
        return testService.save(testDto);
    }
}
