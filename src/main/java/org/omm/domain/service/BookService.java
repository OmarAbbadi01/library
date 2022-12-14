package org.omm.domain.service;

import org.omm.domain.model.BookDto;

import java.util.List;

public interface BookService {

    BookDto findById(Long id) throws Exception;

    List<BookDto> findAll() throws Exception;

    void create(BookDto bookDto) throws Exception;

    void delete(Long id) throws Exception;

    void update(BookDto bookDto) throws Exception;

}
