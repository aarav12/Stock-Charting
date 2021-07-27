package com.company.CompanyService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class StockPrice {

    @Id
    private int companyCode;
    private String stockExchange;
    private int currentPrice;
    private Date date;
    private Time time;


}
