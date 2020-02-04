package avenir_library.test.service;

import avenir_library.test.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll();
}
