package com.learning.ContactBook.repository;

import com.learning.ContactBook.entity.PhoneEntity;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<PhoneEntity, Long> {
    PhoneEntity findByName(String name);

    PhoneEntity findByNumber(Long number);
    Boolean existsByNumber(@NonNull Long phoneEntity);
}
