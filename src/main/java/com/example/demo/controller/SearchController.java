package com.example.demo.controller;

import com.example.demo.model.SearchEntity;
import com.example.demo.repository.SearchRepository;
import com.example.demo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coto/v1/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    private final SearchRepository searchRepository;

    public SearchController(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    @GetMapping
    public ResponseEntity getAllSearch() {
        return ResponseEntity.ok(this.searchRepository.findAll());
    }

    @GetMapping("a/{id}")
    @ResponseBody
    public SearchEntity getSearchById(@PathVariable("id") Integer searchId) {
        return this.searchService.findById(searchId);
    }
}
