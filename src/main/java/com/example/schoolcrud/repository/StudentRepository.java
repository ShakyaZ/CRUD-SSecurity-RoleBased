package com.example.schoolcrud.repository;

import com.example.schoolcrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
    Optional<Student> findByUsername(String username);

}
