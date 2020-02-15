package info.ejava.examples.springdata.repo.student.dao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import info.ejava.examples.springdata.repo.student.bo.Student;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class StudentInit implements CommandLineRunner {
    private final StudentsRepo studentsRepo;
    
    private static final String[] NAMES = {"Mary","Bob","Peter"};
    
    public StudentInit(StudentsRepo studentsRepo) {
        this.studentsRepo = studentsRepo;
    }
    
    @Override
    public void run(String... args) throws Exception {
        for (String name: NAMES) {
            Student student = Student.builder()
                    .name(name)
                    .build();
            studentsRepo.save(student);
        }
        
        log.info("students={}", studentsRepo.count());
        log.info("random={}", studentsRepo.random());
    }
}
