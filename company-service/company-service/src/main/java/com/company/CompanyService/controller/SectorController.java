package com.company.CompanyService.controller;

import com.company.CompanyService.entity.CompanyEntity;
import com.company.CompanyService.service.SectorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class SectorController {

    private SectorService sectorService;
    @GetMapping("/getList/{name}")
    public List<String> getCompanyInSector(@PathVariable String name){
        return sectorService.getCompanies(name);
    }

    @GetMapping("/getAllSectors")
    public List<String> getAllSectors(){
        return sectorService.getALLSectors();
    }
}
