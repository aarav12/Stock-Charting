package com.company.CompanyService.controller;


import com.company.CompanyService.entity.CompanyEntity;
import com.company.CompanyService.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/getCompanyDetails/{companyName}")
        private CompanyEntity getCompanyDetails(@PathVariable String name){
             return companyService.getCompanyDetails(name);
        }


    }




