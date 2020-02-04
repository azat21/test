package avenir_library.test.mapper.impl;


import avenir_library.test.dto.StudentCreateDto;
import avenir_library.test.dto.StudentDto;
import avenir_library.test.dto.StudentUpdateDto;
import avenir_library.test.entity.Student;
import avenir_library.test.mapper.StudentMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentMapperImpl implements StudentMapper {
    @Override
    public StudentDto toStudentDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setFirstName(student.getFirstName());
        studentDto.setLastName(student.getLastName());
        studentDto.setId(student.getId());
        studentDto.setUniversityId(student.getUniversityId());
        studentDto.setFullName(student.getFirstName() + " " + student.getLastName());
        return studentDto;
    }

    @Override
    public Student toStudent(StudentCreateDto studentCreateDto) {
        Student student = new Student();
        student.setFirstName(studentCreateDto.getFirstName());
        student.setUniversityId(studentCreateDto.getUniversityId());
        student.setLastName(studentCreateDto.getLastName());
        return student;
    }

    @Override
    public Student toStudent(Student updatingStudent, StudentUpdateDto studentUpdateDto) {
        updatingStudent.setFirstName(studentUpdateDto.getFirstName());
        updatingStudent.setUniversityId(studentUpdateDto.getUniversityId());
        updatingStudent.setLastName(studentUpdateDto.getLastName());
        return updatingStudent;
    }
}