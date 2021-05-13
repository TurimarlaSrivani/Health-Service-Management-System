package com.cg.healthservicemanagementsystem.repository;



import com.cg.healthservicemanagementsystem.entity.Diet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Spring Data JPA

@Repository
public interface IDietRepository extends JpaRepository<Diet, Integer>{
}