package com.company.CompanyService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class CompanyEntity {

    @Id
    private String companyName;

    private Long turnover;
    private String ceo;
    private List<String> boardOfDirectors;
    private String sector;
    private String briefWriteup;
    private int stockCode;

    @ManyToOne
     private Sectors sectors;

}
