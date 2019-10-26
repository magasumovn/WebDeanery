package magasumovn.WebDeanery.repo;

import magasumovn.WebDeanery.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, Long> {
}
