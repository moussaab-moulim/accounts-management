package com.moussaab.src.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moussaab.src.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {

}
