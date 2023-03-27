package kg.edu.edukg.db.repo;

import kg.edu.edukg.db.entities.Choice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChoiceRepo extends JpaRepository<Choice, Long> {
    @Query("select c from Choice c where c.task.id = :taskId")
    List<Choice> getAllByTaskId(Long taskId);
}
