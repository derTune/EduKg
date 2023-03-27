package kg.edu.edukg.db.entities;

import jakarta.persistence.*;
import kg.edu.edukg.dto.TestDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tests", schema = "edu")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rec_time")
    private LocalDateTime recTime = LocalDateTime.now();

    @Column(name = "is_deleted")
    private Boolean isDeleted = false;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public TestDto getTestDto() {
        return new TestDto(
              id,
              name,
              user.getId()
        );
    }
}
