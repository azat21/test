package avenir_library.test.service;

import avenir_library.test.dto.book.BookDto;
import avenir_library.test.dto.book.UpdateBookQuantityDto;

import java.util.List;

public interface BookService {
    void updateQuantity(Long id, UpdateBookQuantityDto dto);
    List<BookDto> findAll();
}
