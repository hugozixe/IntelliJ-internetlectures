package practice.internetlectures.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository <Enrollment, Long> {
}
