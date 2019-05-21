package com.moussaab.src.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moussaab.src.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
