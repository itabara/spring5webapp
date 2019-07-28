/*
 * Created by iulitab on 7/28/19, 11:07 PM.
 */

package com.iulitab.spring5webapp.repositories;

import com.iulitab.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
