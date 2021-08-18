package com.example.demojoinquery.service;

import com.example.demojoinquery.entities.Province;
import com.example.demojoinquery.entities.Student;
import com.example.demojoinquery.entities.Subjects;
import com.example.demojoinquery.repo.ProvinceRepo;
import com.example.demojoinquery.repo.StudentRepo;
import com.example.demojoinquery.repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private ProvinceRepo provinceRepo;
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private SubjectRepo subjectRepo;

    @Transactional
    public void createDb(){

        Student student1=new Student();
        student1.setName("Thaw Thaw");
        student1.setSchool("Latha");

        Student student2=new Student();
        student2.setName("Thuza");
        student2.setSchool("YIS");

        Student student3=new Student();
        student3.setName("Maw Maw");
        student3.setSchool("Mandalay");


        Subjects java=new Subjects();
        java.setName("Java");
        java.setDuration(6);
        java.setFees(200000);

        Subjects python=new Subjects();
        python.setName("Python");
        python.setDuration(3);
        python.setFees(150000);

        Subjects ruby=new Subjects();
        ruby.setName("Ruby");
        ruby.setDuration(3);
        ruby.setFees(150000);

        Province province1=new Province();
        province1.setName("SU");

        Province province2=new Province();
        province2.setName("MayNiGone");

        Province province3=new Province();
        province3.setName("Latha");

        student1.getSubjects().add(java);
        student1.getSubjects().add(python);
        student1.getSubjects().add(ruby);
        java.getStudents().add(student1);
        python.getStudents().add(student1);
        ruby.getStudents().add(student1);

        student2.getSubjects().add(java);
        student2.getSubjects().add(python);
        java.getStudents().add(student2);
        python.getStudents().add(student2);

        student3.getSubjects().add(java);
        student3.getSubjects().add(ruby);
        java.getStudents().add(student3);
        ruby.getStudents().add(student3);

        student1.setProvince(province1);
        province1.setStudent(student1);

        student2.setProvince(province2);
        province2.setStudent(student2);

        student3.setProvince(province3);
        province3.setStudent(student3);


        provinceRepo.save(province1);
        provinceRepo.save(province2);
        provinceRepo.save(province3);

        studentRepo.save(student1);
        studentRepo.save(student2);
        studentRepo.save(student3);

        subjectRepo.save(java);
        subjectRepo.save(python);
        subjectRepo.save(ruby);








    }
    @Transactional
    public List<Object> findStudentNameProvinceSubjects(String subjectName){
        return studentRepo.findStudentNameProvinceSubject(subjectName);
    }
}
