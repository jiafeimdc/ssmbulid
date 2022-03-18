package com.deng.service;

import com.deng.pojo.Books;

import java.util.List;

public interface BookService {
    //增加一本书
    void addBook(Books book);

    //删除一本书
    void deleteBook(int id);

    //修改一本书
    void updateBook(Books books);

    //查询一本书
    Books queryBook(int id);

    //查询所有书
    List<Books> queryAllBook();
}
