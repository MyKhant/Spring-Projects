package com.example.inheritancemapping.ds;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@DiscriminatorValue("EX_VET")
@Table(name = "ex_house_vet")
public class ExHouseVet extends Vet{

    private String country;
    private double visitingFees;

    public ExHouseVet() {
    }

    public ExHouseVet(String name, String qualification, String country, double visitingFees) {
        super(name, qualification);
        this.country = country;
        this.visitingFees = visitingFees;
    }
}
