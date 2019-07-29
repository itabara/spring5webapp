/*
 * Created by iulitab on 7/29/19, 8:02 PM.
 */

package com.iulitab.spring5webapp.repositories;

import com.iulitab.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
