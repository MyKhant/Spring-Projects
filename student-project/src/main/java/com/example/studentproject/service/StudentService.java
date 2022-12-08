package com.example.studentproject.service;

import com.example.studentproject.dao.ProvinceDao;
import com.example.studentproject.dao.StudentSubjectDao;
import com.example.studentproject.dao.SubjectDao;
import com.example.studentproject.entity.Province;
import com.example.studentproject.entity.Student;
import com.example.studentproject.entity.StudentSubject;
import com.example.studentproject.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    @Autowired
    private StudentSubjectDao studentSubjectDao;
    @Autowired
    private ProvinceDao provinceDao;

    @Autowired
    private SubjectDao subjectDao;

    @Transactional
    public void createDb(){
        Province p1 = new Province();
        p1.setName("Sule");

        Province p2 = new Province();
        p2.setName("NO");

        Student s1 = new Student("Thaw Thaw", 23, "Latha");
        Student s2 = new Student("John Doe", 22, "ISM");
        Student s3 = new Student("John William", 23, "PISM");
        Student s4 = new Student("Thomas Hardy", 23, "ISY");

        Subject subject1 = new Subject("Java","6 months",2000);
        Subject subject2 = new Subject("Python","3 months",1500);
        Subject subject3 = new Subject("Groovy","3 months",1000);

        p1.addStudent(s1);
        p1.addStudent(s2);
        p2.addStudent(s3);
        p2.addStudent(s4);
//        student 1 got 95 marks in subject 1
        StudentSubject studentSubject1 = new StudentSubject();
        studentSubject1.setMarks(95);
        s1.addStudentSubject(studentSubjectDao.save(studentSubject1));
        subject1.addStudentSubject(studentSubjectDao.save(studentSubject1));

//        student 1 got 70 marks in subject 2
        StudentSubject studentSubject2 = new StudentSubject();
        studentSubject2.setMarks(70);
        s1.addStudentSubject(studentSubject2);
        subject2.addStudentSubject(studentSubject2);

//        student 2 got 90 marks in subject 1
        StudentSubject studentSubject3 = new StudentSubject();
        studentSubject3.setMarks(90);
        StudentSubject studentSubjectManage2 = studentSubjectDao.save(studentSubject3);
        s2.addStudentSubject(studentSubjectManage2);
        subject1.addStudentSubject(studentSubjectManage2);

//        student 3 got 75 marks in subject 3
        StudentSubject studentSubject4 = new StudentSubject();
        studentSubject4.setMarks(75);
        s3.addStudentSubject(studentSubjectDao.save(studentSubject4));
        subject3.addStudentSubject(studentSubjectDao.save(studentSubject4));

        provinceDao.save(p1);
        provinceDao.save(p2);
        subjectDao.save(subject1);
        subjectDao.save(subject2);
        subjectDao.save(subject3);
    }
}
