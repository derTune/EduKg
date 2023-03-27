package kg.edu.edukg.dto;

import kg.edu.edukg.db.entities.Test;
import kg.edu.edukg.db.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class TestDto {
    private Long id;

    private String name;

    private Long userId;

    public Test toEntity() {
        Test test = new Test();
        test.setName(this.name);
        test.setUser(new User(this.userId));
        return test;
    }
}
