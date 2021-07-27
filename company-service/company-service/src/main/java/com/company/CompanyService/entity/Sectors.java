package com.company.CompanyService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sectors {

    @Id
    private int id;
    private String sectorName;
    private String brief;


    @OneToMany
    private List<CompanyEntity> companyEntity;

}
