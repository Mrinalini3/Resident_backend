package com.example.Residents_Association.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Residents_Association.Entity.Resident;

public interface ResidentRepo extends JpaRepository<Resident,Integer>{

}
