package avenir_library.test.mapper.impl;

import avenir_library.test.dto.book.BookDto;
import avenir_library.test.entity.Book;
import avenir_library.test.mapper.AuthorMapper;
import avenir_library.test.mapper.BookMapper;
import org.springframework.stereotype.Service;

@Service
public class BookMapperImpl implements BookMapper {

    private final AuthorMapper authorMapper;

    public BookMapperImpl(AuthorMapper authorMapper) {
        this.authorMapper = authorMapper;
    }

    @Override
    public BookDto toDto(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setAuthor(authorMapper.toAuthorDto(book.getAuthor()));
        bookDto.setCategory(book.getCategory());
        bookDto.setName(book.getName());
        bookDto.setId(book.getId());
        bookDto.setQuantity(book.getQuantity());
        return bookDto;
    }
}