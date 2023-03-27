package kg.edu.edukg.db.repo;

import kg.edu.edukg.db.entities.Solution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolutionRepo extends JpaRepository<Solution, Long> {
    @Query("select s from Solution s join s.task t where s.user.id = :userId and t.test.id = :testId")
    List<Solution> getAllByUserId(Long userId, Long testId);
}
