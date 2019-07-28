/*
 * Created by iulitab on 7/28/19, 11:02 PM.
 */

package com.iulitab.spring5webapp.repositories;

import com.iulitab.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
