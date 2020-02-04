package avenir_library.test.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentCreateDto {
    private String firstName;
    private String lastName;
    private String universityId;
}