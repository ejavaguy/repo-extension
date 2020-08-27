package info.ejava.examples.springdata.repo.student;

import info.ejava.examples.springdata.repo.student.bo.Student;
import info.ejava.examples.springdata.repo.student.dao.StudentsRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class RepoExtensionApplicationTests {
	@Autowired
	private StudentsRepo repo;

	@Test
	void random() {
		Student randomStudent = repo.random();
		log.info("random={}", randomStudent);
		assertNotNull(randomStudent);
	}

}
