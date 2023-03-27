package kg.edu.edukg.service;

import kg.edu.edukg.dto.TestDto;

import java.util.List;

public interface TestService {
    List<TestDto> getAll(Long userId);

    TestDto save(TestDto testDto);
}
