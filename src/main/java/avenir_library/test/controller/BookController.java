package avenir_library.test.controller;


import avenir_library.test.dto.book.BookDto;
import avenir_library.test.dto.book.UpdateBookQuantityDto;
import avenir_library.test.service.BookService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    private List<BookDto> findAll() {
        return bookService.findAll();
    }

    @PutMapping("/{id}/updateQuantity")
    private void updateQuantity(@RequestBody @Validated UpdateBookQuantityDto dto,
                                @PathVariable Long id) {
        bookService.updateQuantity(id, dto);
    }
}