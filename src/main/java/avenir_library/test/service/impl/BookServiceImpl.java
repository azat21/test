package avenir_library.test.service.impl;

import avenir_library.test.dto.book.BookDto;
import avenir_library.test.dto.book.UpdateBookQuantityDto;
import avenir_library.test.entity.Book;
import avenir_library.test.mapper.BookMapper;
import avenir_library.test.repository.BookRepository;
import avenir_library.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookServiceImpl(BookRepository bookRepository,
                           BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    @Transactional
    public void updateQuantity(Long id, UpdateBookQuantityDto dto) {
        Book updatingBook = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("There is no Book with id " + id));
        updatingBook.setQuantity(dto.getQuantity());
        bookRepository.save(updatingBook);
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .collect(Collectors.toList());
    }
}