package practice.internetlectures.lecture;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository <Lecture, Long> {
}
