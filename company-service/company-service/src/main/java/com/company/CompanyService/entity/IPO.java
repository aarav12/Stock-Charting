package com.company.CompanyService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class IPO {

    @Id
    private int id;
    private String companyName;
    private String stockExchange;
    private int price;
    private int totalShares;
    private Date date;
    private String remarks;

}
