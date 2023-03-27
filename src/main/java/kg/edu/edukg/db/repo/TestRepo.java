package kg.edu.edukg.db.repo;

import kg.edu.edukg.db.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepo extends JpaRepository<Test, Long> {
    @Query("select t from Test t where t.user.id = :userId")
    List<Test> getAllByUserId(Long userId);
}
