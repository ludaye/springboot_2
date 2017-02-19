package com.example.repository;

import com.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/2/1.
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
