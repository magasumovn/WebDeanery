package magasumovn.WebDeanery.repo;

import magasumovn.WebDeanery.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
