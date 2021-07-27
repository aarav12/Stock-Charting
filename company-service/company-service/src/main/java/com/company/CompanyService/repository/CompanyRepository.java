package com.company.CompanyService.repository;

import com.company.CompanyService.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity,String>{

    CompanyRepository findByname(String name);
}
