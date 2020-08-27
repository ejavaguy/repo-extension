package info.ejava.examples.springdata.repo.student.dao;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaContext;

import info.ejava.examples.springdata.repo.student.bo.Student;
import org.springframework.stereotype.Repository;

public class StudentsAccessorImpl implements StudentsAccessor {
    private final EntityManager em;
    
    @Autowired
    public StudentsAccessorImpl(JpaContext context) {
        em=context.getEntityManagerByManagedType(Student.class);
    }

    @Override
    public Student random() {
        List<Student> results = em.createQuery(
                "select s from Student s", Student.class)
                .getResultList();
        return results.isEmpty() ? 
                null : 
                results.get(new Random().nextInt(results.size()));
    }
}
