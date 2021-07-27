package com.company.CompanyService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StockExchange {


        private int id;
        private String stockExchange;
        private String Brief;
        private String ContactAddress;
        private String remarks;
    }


