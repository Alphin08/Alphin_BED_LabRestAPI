package com.greatlearning.StudentRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greatlearning.StudentRegistration.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
