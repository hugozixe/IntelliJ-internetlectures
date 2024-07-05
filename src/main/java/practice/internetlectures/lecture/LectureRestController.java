package practice.internetlectures.lecture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/lectures")
public class LectureRestController {

    private final LectureService lectureService;

    public LectureRestController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping("/{id}")
    public LectureDetailResponse findOne(@PathVariable Long id) {
        return new LectureDetailResponse(
                "",
                "",
                0,
                0L,
                List.of(),
                LectureCategory.과학,
                LocalDateTime.now(),
                LocalDateTime.now()
        );
    }
}
