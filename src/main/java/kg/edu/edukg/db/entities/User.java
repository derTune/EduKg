package kg.edu.edukg.db.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users", schema = "edu")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rec_time")
    private LocalDateTime recTime = LocalDateTime.now();

    @Column(name = "is_deleted")
    private Boolean isDeleted = false;

    private String username;

    @JsonIgnore
    private String password;

    public User(Long id) {
        this.id = id;
    }
}
