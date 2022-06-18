package com.ironhack.lab36.repository;

import com.ironhack.lab36.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts, Integer> {
}
