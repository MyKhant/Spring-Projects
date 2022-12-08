package com.example.inheritancemapping.ds;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@DiscriminatorValue("IN_VET")
@Table(name = "in_house_vet")
public class InHouseVet extends Vet{

    private double salary;
    public InHouseVet(){

    }
    public InHouseVet(String name, String qualification, double salary){
        super(name, qualification);
        this.salary=salary;
    }
}
