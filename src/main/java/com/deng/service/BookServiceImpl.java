package com.deng.service;

import com.deng.dao.BookMapper;
import com.deng.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


public class BookServiceImpl implements BookService{


    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public void addBook(Books book) {
         this.bookMapper.addBook(book);
    }

    public void deleteBook(int id) {
        this.bookMapper.deleteBook(id);
    }

    public void updateBook(Books books) {
        this.bookMapper.updateBook(books);
    }

    public Books queryBook(int id) {
      return  this.bookMapper.queryBook(id);
    }

    public List<Books> queryAllBook() {
       return this.bookMapper.queryAllBook();
    }
}
