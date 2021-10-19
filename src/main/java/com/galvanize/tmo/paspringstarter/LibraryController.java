package com.galvanize.tmo.paspringstarter;

import com.tmo.books.Book;
import com.tmo.books.LibraryBook;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/books")
public class LibraryController {

    private final LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService){
        this.libraryService = libraryService;
    }


    @GetMapping
    public List<LibraryBook> showLibrary(){
        return libraryService.showLibrary();
    }

    @PostMapping
    public LibraryBook addNewBook(@RequestBody  Book book){
        System.out.println("Adding New Book");
        return libraryService.addNewBook(book);

    }

    @DeleteMapping
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void emptyLibrary(){
        libraryService.emptyLibrary();
    }


}
