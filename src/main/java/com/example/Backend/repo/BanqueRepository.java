package com.example.Backend.repo;

import com.example.Backend.models.Banque;
 import org.springframework.data.jpa.repository.JpaRepository;

public interface BanqueRepository extends JpaRepository<Banque,Long> {
}
