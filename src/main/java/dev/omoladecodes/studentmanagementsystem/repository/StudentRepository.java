package dev.omoladecodes.studentmanagementsystem.repository;

import dev.omoladecodes.studentmanagementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
