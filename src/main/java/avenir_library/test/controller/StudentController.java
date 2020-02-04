package avenir_library.test.controller;

import avenir_library.test.dto.StudentDto;
import avenir_library.test.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    private List<StudentDto> findAll() {
        return studentService.findAll();
    }
}
