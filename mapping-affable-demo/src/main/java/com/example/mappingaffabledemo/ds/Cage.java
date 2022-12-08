package com.example.mappingaffabledemo.ds;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cage extends IdClass{

    private int cageNo;
    private String location;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Animal animal;

    public Cage() {
    }

    public Cage(int cageNo, String location) {
        this.cageNo = cageNo;
        this.location = location;
    }
}
