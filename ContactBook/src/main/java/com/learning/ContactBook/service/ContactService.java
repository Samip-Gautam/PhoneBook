package com.learning.ContactBook.service;

import com.learning.ContactBook.entity.PhoneEntity;
import com.learning.ContactBook.repository.PhoneRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContactService {

    private final PhoneRepository phoneRepository;

    public ContactService(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    public PhoneEntity add(PhoneEntity phoneEntity) {
        return phoneRepository.save(phoneEntity); // save entity
    }

    public List<PhoneEntity> viewAll() {
        return phoneRepository.findAll(); // return list
    }

    public PhoneEntity searchByName(String name) {
        return phoneRepository.findByName(name);
    }

    public PhoneEntity searchByNumber(Long number) {
        return phoneRepository.findByNumber(number);
    }

    public void deleteAll() {
        phoneRepository.deleteAll();
    }
}
