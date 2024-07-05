package practice.internetlectures.lecture;

import java.time.LocalDateTime;
import java.util.List;

public record LectureDetailResponse(
        String title,
        String description,
        long price,
        Long studentCount,
        List<StudentResponse> students,
        LectureCategory category,
        LocalDateTime createdAt,
        LocalDateTime updateAt
) {
    public record StudentResponse(
            String nickname,
            LocalDateTime enrolledAt
    ) {
    }
}