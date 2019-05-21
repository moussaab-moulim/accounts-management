package com.moussaab.src.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moussaab.src.entities.Operations;

public interface OperationsRepository extends JpaRepository<Operations, Long> {

}
