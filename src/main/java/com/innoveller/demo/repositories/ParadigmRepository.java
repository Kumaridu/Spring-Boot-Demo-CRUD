package com.innoveller.demo.repositories;

import com.innoveller.demo.models.Paradigm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParadigmRepository extends JpaRepository<Paradigm, Long> {

}
