package info.ejava.examples.springdata.repo.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(repositoryImplementationPostfix = "Foox")
public class RepoExtensionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepoExtensionApplication.class, args);
	}
}
