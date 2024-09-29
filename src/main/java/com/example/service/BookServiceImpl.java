package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null);
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id, Book updatedBook) {
        Optional<Book> bookOpt = bookRepository.findById(id);
        if (bookOpt.isPresent()) {
            Book book = bookOpt.get();
            book.setBookname(updatedBook.getBookname());
            book.setBookprice(updatedBook.getBookprice());
            book.setBookvolume(updatedBook.getBookvolume());
            book.setBookauthor(updatedBook.getBookauthor());
            book.setBookrelesdate(updatedBook.getBookrelesdate());
            return bookRepository.save(book);
        }
        return null;
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
