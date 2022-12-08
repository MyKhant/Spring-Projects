package com.example.inheritancemapping.ds;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "vet_type")
public abstract class Vet extends IdClass{
    private String name;
    private String qualification;

    public Vet() {
    }

    public Vet(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }
}
