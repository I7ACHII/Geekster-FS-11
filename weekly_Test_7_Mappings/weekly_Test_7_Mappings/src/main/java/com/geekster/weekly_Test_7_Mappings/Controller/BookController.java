package com.geekster.weekly_Test_7_Mappings.Controller;


import com.geekster.weekly_Test_7_Mappings.Model.Address;
import com.geekster.weekly_Test_7_Mappings.Model.Book;
import com.geekster.weekly_Test_7_Mappings.Service.AddressService;
import com.geekster.weekly_Test_7_Mappings.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {


    @Autowired
    BookService bookService;


    @PostMapping("book")
    public String addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PutMapping("book/title/{bookId}/{title}")
    public String changeTitleByBookId(@PathVariable Long bookId, @PathVariable String title) {
        return bookService.changeTitleByBookId(bookId, title);
    }

    @DeleteMapping("book/{bookId}")
    public String deleteBookByBookId(@PathVariable Long bookId) {
        return bookService.deleteBookByBookId(bookId );
    }
}
