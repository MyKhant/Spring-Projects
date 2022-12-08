package com.example.studentproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "student_subject")
public class StudentSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_subject_id")
    private Integer id;
    private int marks;

    @ManyToOne @JoinColumn(name = "sub_id")
    private Subject subject;
    @ManyToOne @JoinColumn(name = "stu_id")
    private Student student;

}
