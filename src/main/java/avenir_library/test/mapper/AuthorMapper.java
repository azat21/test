package avenir_library.test.mapper;

import avenir_library.test.dto.author.AuthorDto;
import avenir_library.test.entity.Author;

public interface AuthorMapper {
    AuthorDto toAuthorDto(Author author);
}
