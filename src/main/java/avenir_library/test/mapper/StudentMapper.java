package avenir_library.test.mapper;


import avenir_library.test.dto.StudentCreateDto;
import avenir_library.test.dto.StudentDto;
import avenir_library.test.dto.StudentUpdateDto;
import avenir_library.test.entity.Student;

public interface StudentMapper {
    StudentDto toStudentDto(Student student);
    Student toStudent(StudentCreateDto studentCreateDto);
    Student toStudent(Student updatingStudent, StudentUpdateDto studentUpdateDto);
}