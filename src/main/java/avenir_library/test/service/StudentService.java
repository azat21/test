package avenir_library.test.service;

import avenir_library.test.dto.StudentCreateDto;
import avenir_library.test.dto.StudentDto;
import avenir_library.test.dto.StudentUpdateDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll();
    StudentDto save(StudentCreateDto studentCreateDto);
    StudentDto getById(Long id);
    StudentDto update(Long id, StudentUpdateDto studentUpdateDto);
}
