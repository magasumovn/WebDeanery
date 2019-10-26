package magasumovn.WebDeanery.repo;

import magasumovn.WebDeanery.domain.Performance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerformanceRepo extends JpaRepository<Performance, Long> {
    List<Performance> getPerformancesByStudent_StudentID(long parseLong);
    Performance getPerformanceByStudent_StudentIDAndSubject_SubjectIDAndSemesterNumber(long parseLong, long parseLong1, int parseint);
}
