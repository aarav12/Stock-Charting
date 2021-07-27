package com.company.CompanyService.repository;

import com.company.CompanyService.entity.Sectors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectorRepository extends JpaRepository<Sectors,Integer>{


    List<String> findByName(String name);

    List<String> getAllSectors();
}
