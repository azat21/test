package avenir_library.test.mapper;

import avenir_library.test.dto.book.BookDto;
import avenir_library.test.entity.Book;

public interface BookMapper {
    BookDto toDto(Book book);
}
