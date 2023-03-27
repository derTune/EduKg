package kg.edu.edukg.db.entities;

import jakarta.persistence.*;
import kg.edu.edukg.common.TaskType;
import kg.edu.edukg.dto.TaskDto;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tasks", schema = "edu")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rec_time")
    private LocalDateTime recTime = LocalDateTime.now();

    @Column(name = "is_deleted")
    private Boolean isDeleted = false;

    @NotNull
    private String text;

    @Enumerated(EnumType.ORDINAL)
    private TaskType type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "test_id")
    private Test test;

    public TaskDto getTaskDto() {
        return new TaskDto(
                id,
                text,
                type,
                test.getId()
        );
    }
}
