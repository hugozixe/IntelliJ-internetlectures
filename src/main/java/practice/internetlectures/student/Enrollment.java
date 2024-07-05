package practice.internetlectures.student;

import jakarta.persistence.*;
import practice.internetlectures.lecture.Lecture;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Lecture lecture;

    public Enrollment() {
    }

    public Enrollment(Student student, Lecture lecture) {
        this.student = student;
        this.lecture = lecture;
    }
}
