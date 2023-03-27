package kg.edu.edukg.db.entities;

import jakarta.persistence.*;
import kg.edu.edukg.dto.ChoiceDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "choices", schema = "edu")
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rec_time")
    private LocalDateTime recTime = LocalDateTime.now();

    @Column(name = "is_deleted")
    private Boolean isDeleted = false;

    private String choice;

    @Column(name = "is_answer")
    private Boolean isAnswer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "task_id")
    private Task task;

    public ChoiceDto getChoiceDto() {
        return new ChoiceDto(
                id,
                choice,
                isAnswer,
                task.getId()
        );
    }
}
