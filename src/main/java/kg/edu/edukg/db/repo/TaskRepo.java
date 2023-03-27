package kg.edu.edukg.db.repo;

import kg.edu.edukg.db.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {
    List<Task> getAllByTestId(Long testId);
}
