/*
 * Created by iulitab on 7/29/19, 8:39 PM.
 */

package com.iulitab.spring5webapp.controllers;

import com.iulitab.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authorList", authorRepository.findAll());
        return "authors";
    }
}
