package com.company.CompanyService.service;

import com.company.CompanyService.entity.CompanyEntity;
import com.company.CompanyService.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity getCompanyDetails(String name){

        return (CompanyEntity) companyRepository.findByname(name);
    }

}
