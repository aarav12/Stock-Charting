package com.company.CompanyService.service;

import com.company.CompanyService.repository.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectorService {

    @Autowired
    private SectorRepository sectorRepository;


    public List<String> getCompanies(String name){
        return sectorRepository.findByName(name);
    }

    public List<String> getALLSectors() {
        return sectorRepository.getAllSectors();

    }
}
