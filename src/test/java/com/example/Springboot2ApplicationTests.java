package com.example;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2ApplicationTests {
    @Autowired
    StudentRepository studentRepository;

    @Test
    public void contextLoads() {
        System.out.println(studentRepository.findAll().size());
    }

    @Test
    public void test_1() {
        Student student = new Student();
        student.setName("lu");
        student.setAge(22);
        studentRepository.save(student);
        System.out.println(studentRepository.findAll().size());
    }

}
