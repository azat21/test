package avenir_library.test.dto.book;

import avenir_library.test.dto.author.AuthorDto;
import avenir_library.test.enums.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {
    private Long id;
    private String name;
    private AuthorDto author;
    private Category category;
    private Integer quantity;

}
