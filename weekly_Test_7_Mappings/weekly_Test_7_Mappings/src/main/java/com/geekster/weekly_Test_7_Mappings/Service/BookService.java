package com.geekster.weekly_Test_7_Mappings.Service;

import com.geekster.weekly_Test_7_Mappings.Model.Address;
import com.geekster.weekly_Test_7_Mappings.Model.Book;
import com.geekster.weekly_Test_7_Mappings.Repository.IAddressRepo;
import com.geekster.weekly_Test_7_Mappings.Repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    IBookRepo iBookRepo;

    public String addBook(Book book) {
        iBookRepo.save(book);
        return "Book has been added!!";
    }

    public List<Book> getAllBooks() {
        return iBookRepo.findAll();
    }

    public String changeTitleByBookId(Long bookId, String title) {
        Optional<Book> book = iBookRepo.findById(bookId);
        Book newBook = null;
        if(book.isPresent()){
            newBook = book.get();
        }
        else{
            return "Book not found!!";
        }
        newBook.setBookTitle(title);
        iBookRepo.save(newBook);
        return "Title has been changed!!";
    }

    public String deleteBookByBookId(Long bookId) {
        iBookRepo.deleteById(bookId);
        return "Book has been deleted!";
    }
}
