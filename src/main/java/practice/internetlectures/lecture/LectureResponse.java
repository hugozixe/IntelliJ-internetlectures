package practice.internetlectures.lecture;

import java.time.LocalDateTime;

public record LectureResponse(
        Long lectureId,
        String name,
        String teacher,
        long price,
        Long studentCount,
        LectureCategory category,
        LocalDateTime createdAt
) {
}

