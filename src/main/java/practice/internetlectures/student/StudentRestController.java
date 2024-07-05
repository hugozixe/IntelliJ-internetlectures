package practice.internetlectures.student;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentRestController {

    private final StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public void register(@RequestBody RegisterStudentRequest request) {
        studentService.create(request);
    }

    @PostMapping("enrollments")
    public void enroll(@RequestBody EnrollRequest request) {
        studentService.enroll(request);

    }

}
