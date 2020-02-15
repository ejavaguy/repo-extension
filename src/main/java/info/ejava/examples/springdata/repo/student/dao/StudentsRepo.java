package info.ejava.examples.springdata.repo.student.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import info.ejava.examples.springdata.repo.student.bo.Student;

public interface StudentsRepo extends JpaRepository<Student, Integer>, StudentsAccessor {
    Student findByName(String name);
    List<Student> findAllByName(String name);
}
