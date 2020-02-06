package avenir_library.test.mapper;


import avenir_library.test.dto.student.StudentCreateDto;
import avenir_library.test.dto.student.StudentDto;
import avenir_library.test.dto.student.StudentUpdateDto;
import avenir_library.test.entity.Student;

public interface StudentMapper {
    StudentDto toStudentDto(Student student);
    Student toStudent(StudentCreateDto studentCreateDto);
    Student toStudent(Student updatingStudent, StudentUpdateDto studentUpdateDto);
}