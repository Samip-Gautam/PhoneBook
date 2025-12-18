package com.learning.ContactBook.service;

import com.learning.ContactBook.entity.PhoneEntity;

import java.util.List;

public interface ContactServiceInterface {
    public PhoneEntity add(PhoneEntity phoneEntity);
    public List<PhoneEntity> viewAll();
    public PhoneEntity searchByName(String name);
    public PhoneEntity searchByNumber(Long number);
    public void deleteAll();
    public PhoneEntity update(PhoneEntity phoneEntity);
}
