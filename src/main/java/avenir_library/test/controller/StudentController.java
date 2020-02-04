package avenir_library.test.controller;

import avenir_library.test.dto.StudentCreateDto;
import avenir_library.test.dto.StudentDto;
import avenir_library.test.dto.StudentUpdateDto;
import avenir_library.test.service.StudentService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    private StudentDto save(@RequestBody StudentCreateDto studentCreateDto) {
        return studentService.save(studentCreateDto);
    }

    @GetMapping("/{id}")
    private StudentDto getById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @PutMapping("/{id}")
    private StudentDto update(@PathVariable Long id,
                              @RequestBody StudentUpdateDto studentUpdateDto) {
        return studentService.update(id, studentUpdateDto);
    }
}
