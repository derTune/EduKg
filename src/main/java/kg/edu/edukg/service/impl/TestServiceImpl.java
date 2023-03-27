package kg.edu.edukg.service.impl;

import kg.edu.edukg.db.entities.Test;
import kg.edu.edukg.db.repo.TestRepo;
import kg.edu.edukg.dto.TestDto;
import kg.edu.edukg.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestServiceImpl implements TestService {
    final TestRepo testRepo;

    public TestServiceImpl(TestRepo testRepo) {
        this.testRepo = testRepo;
    }

    @Override
    public List<TestDto> getAll(Long userId) {
        List<Test> test = testRepo.getAllByUserId(userId);
        return test.stream()
                .map(Test::getTestDto)
                .collect(Collectors.toList());
    }

    @Override
    public TestDto save(TestDto testDto) {
        Test toSave = testDto.toEntity();
        Test saved = testRepo.save(toSave);
        return saved.getTestDto();
    }
}
