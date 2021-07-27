package com.company.CompanyService.controller;


import com.company.CompanyService.entity.IPO;
import com.company.CompanyService.service.IPOService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IPOController {

    private IPOService iPOService;

    @GetMapping("/getCompanyIPODetails/{id}")
    private IPO getIPODetails(@PathVariable int id){
       return iPOService.getIPODetails(id);
    }

}
