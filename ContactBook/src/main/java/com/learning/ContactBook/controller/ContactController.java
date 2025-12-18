package com.learning.ContactBook.controller;

import com.learning.ContactBook.entity.PhoneEntity;
import com.learning.ContactBook.service.ContactService;
import com.learning.ContactBook.service.ContactServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ContactController {
    private final ContactServiceInterface contactService;

    @GetMapping("/viewall")
    public List<PhoneEntity> viewAll() {
        return contactService.viewAll();
    }

    @GetMapping("/search/{value}")
    public PhoneEntity search(@PathVariable String value) {
        if (value.matches("\\d+")) {
           return  contactService.searchByNumber(Long.parseLong(value));
        }
        else {
           return contactService.searchByName(value);
        }
    }
    @PostMapping("/save")
    public PhoneEntity save(@RequestBody PhoneEntity details) {
        return contactService.add(details);   // this returns saved entity
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        contactService.deleteAll();
    }
}