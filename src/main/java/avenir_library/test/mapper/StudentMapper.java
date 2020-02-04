package avenir_library.test.mapper;


import avenir_library.test.dto.StudentDto;
import avenir_library.test.entity.Student;

public interface StudentMapper {
    StudentDto toStudentDto(Student student);
}
