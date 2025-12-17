package com.learning.ContactBook.repository;

import com.learning.ContactBook.entity.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneEntity, Long> {
    PhoneEntity findByName(String name);

    PhoneEntity findByNumber(Long number);
}
