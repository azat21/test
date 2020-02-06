package avenir_library.test.service.impl;

import avenir_library.test.dto.student.StudentCreateDto;
import avenir_library.test.dto.student.StudentDto;
import avenir_library.test.dto.student.StudentUpdateDto;
import avenir_library.test.entity.Student;
import avenir_library.test.mapper.StudentMapper;
import avenir_library.test.repository.StudentRepository;
import avenir_library.test.service.StudentService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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

    @Override
    public StudentDto save(StudentCreateDto studentCreateDto) {
        Student student = studentMapper.toStudent(studentCreateDto);
        Student savedStudent = studentRepository.save(student);
        return studentMapper.toStudentDto(savedStudent);
    }

    @Override
    public StudentDto getById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("There is no Student with id " + id));
        return studentMapper.toStudentDto(student);
    }

    @Override
    public StudentDto update(Long id, StudentUpdateDto studentUpdateDto) {
        Student updatingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("There is no Student with id " + id));
        Student student = studentMapper.toStudent(updatingStudent, studentUpdateDto);
        Student updatedStudent = studentRepository.save(student);
        return studentMapper.toStudentDto(updatedStudent);
    }
}