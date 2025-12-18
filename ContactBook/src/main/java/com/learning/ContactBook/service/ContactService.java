package com.learning.ContactBook.service;

import com.learning.ContactBook.entity.PhoneEntity;
import com.learning.ContactBook.repository.PhoneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ContactService implements ContactServiceInterface{

    private final PhoneRepository phoneRepository;

//    public ContactService(PhoneRepository phoneRepository) {
//        this.phoneRepository = phoneRepository;
//    }
    @Override
    public PhoneEntity add(PhoneEntity phoneEntity) {
        return phoneRepository.save(phoneEntity); // save entity
    }

    @Override
    public List<PhoneEntity> viewAll() {
        return phoneRepository.findAll(); // return list
    }

    @Override
    public PhoneEntity searchByName(String name) {
        return phoneRepository.findByName(name);
    }

    @Override
    public PhoneEntity searchByNumber(Long number) {
        return phoneRepository.findByNumber(number);
    }

    @Override
    public void deleteAll() {
        phoneRepository.deleteAll();
    }
}
