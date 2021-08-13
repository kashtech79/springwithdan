package com.kash.controller;

import com.kash.domain.Link;
import com.kash.repository.LinkRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LinkController {

    private LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/foo")
    public String foo(Model model){
        model.addAttribute("pageTitle", "this page is foo");
        return "foo";
    }

    // list
    @GetMapping("/")
    public List<Link> list() {
        return linkRepository.findAll();
    }

    // CRUD
    @GetMapping("/create")
    public Link create(@ModelAttribute Link link) {
        return linkRepository.save(link);
    }

    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id) {
        return linkRepository.findById(id);
    }
    @PutMapping("/{id}")
    public Link update(@PathVariable Long id, @ModelAttribute Link link) {
        return linkRepository.save(link);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        linkRepository.deleteById(id);
    }
}
