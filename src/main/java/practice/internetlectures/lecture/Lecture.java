package practice.internetlectures.lecture;

import jakarta.persistence.*;
import practice.internetlectures.teacher.Teacher;

import java.time.LocalDateTime;

@Entity
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @ManyToOne
    private Teacher teacher;

    private long price;

    @Enumerated(EnumType.STRING)
    private LectureCategory category;

    private LocalDateTime createdDatetime = LocalDateTime.now();

    private LocalDateTime modifiedDatetime = LocalDateTime.now();

    public Lecture(
            Long id,
            String title,
            String description,
            Teacher teacher,
            long price,
            LectureCategory category
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.teacher = teacher;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public long getPrice() {
        return price;
    }

    public LectureCategory getCategory() {
        return category;
    }

    public LocalDateTime getCreatedDatetime() {
        return createdDatetime;
    }

    public LocalDateTime getModifiedDatetime() {
        return modifiedDatetime;
    }
}
