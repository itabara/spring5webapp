/*
 * Created by iulitab on 7/28/19, 11:11 PM.
 */

package com.iulitab.spring5webapp.bootstrap;

import com.iulitab.spring5webapp.model.Author;
import com.iulitab.spring5webapp.model.Book;
import com.iulitab.spring5webapp.repositories.AuthorRepository;
import com.iulitab.spring5webapp.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    private void initDate(){
        var eric = new Author("Eric", "Evans");
        var book1 = new Book("Domain Driven Design", "1234", "Harper Collins") ;
        eric.getBooks().add(book1);
        book1.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(book1);

        var rod = new Author("Rod", "Johnson");
        var book2 = new Book("J2EE Development without ESB", "123444", "Wrox");
        rod.getBooks().add(book2);
        book2.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(book2);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initDate();

    }
}
