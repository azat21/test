package avenir_library.test.service.impl;

import avenir_library.test.dto.StudentDto;
import avenir_library.test.mapper.StudentMapper;
import avenir_library.test.repository.StudentRepository;
import avenir_library.test.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentRepository studentRepository,
                              StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public List<StudentDto> findAll() {
        return studentRepository.findAll().stream()
                .map(studentMapper::toStudentDto)
                .collect(Collectors.toList());
    }
}
