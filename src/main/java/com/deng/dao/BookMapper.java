package com.deng.dao;

import com.deng.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

public interface BookMapper {


    void addBook(Books book);


    void deleteBook(int id);


    void updateBook(Books d);


    Books queryBook(@Param("BookId") int id);


    List<Books> queryAllBook();

}
