package com.xm.service;

import com.xm.pojo.Book;
import com.xm.pojo.Page;

import java.util.List;

/**
 * @author mintFM
 * @create 2021-09-24 9:54
 */
public interface BookService {

    public void addBook(Book book);

    public void deleteBookById(Integer id);

    public void updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<java.awt.print.Book> queryBooks();

    Page<java.awt.print.Book> page(int pageNo, int pageSize);

    Page<java.awt.print.Book> pageByPrice(int pageNo, int pageSize, int min, int max);
}
