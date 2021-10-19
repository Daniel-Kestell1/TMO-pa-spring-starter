package com.galvanize.tmo.paspringstarter;

import com.tmo.books.Book;
import com.tmo.books.LibraryBook;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@Service
public class LibraryService {



    Map<String, LibraryBook> library = new TreeMap<>();

    int currentId = 0;

    @GetMapping
    public List<LibraryBook> showLibrary(){

        if(library == null){
            library = new TreeMap<>();
        }
        List<LibraryBook> outputBooks = new ArrayList<>();
        for(Map.Entry<String,LibraryBook> entry : library.entrySet()){
            outputBooks.add(entry.getValue());
        }
        return outputBooks;
    }

    public LibraryBook addNewBook(@RequestBody  Book book) {
        if(library == null) {
            library = new TreeMap<>();
        }
        currentId = currentId + 1;
        LibraryBook createdLibraryBook = new LibraryBook(currentId, book);
        library.put(book.getTitle(), createdLibraryBook);
        return createdLibraryBook;
    }


    private void printBookList(){
        for(int i = 0; i < library.size(); i++){
            library.get(i).printBookElements();
        }
    }

    public void emptyLibrary(){


        if(library != null) {
            System.out.println("Deleting All Books");
            library.clear();
            library = null;
            currentId = 0;
        } else{
            System.out.println("Library was already empty");
        }
    }
}
