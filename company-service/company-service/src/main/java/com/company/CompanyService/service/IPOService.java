package com.company.CompanyService.service;

import com.company.CompanyService.entity.IPO;
import com.company.CompanyService.repository.IPORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IPOService {

    @Autowired
    private IPORepository iPORepository;

    public IPO getIPODetails(int id) {
        return iPORepository.findById(id);
    }



}
