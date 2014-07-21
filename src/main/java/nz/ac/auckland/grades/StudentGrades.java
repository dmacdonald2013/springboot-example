package nz.ac.auckland.grades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class StudentGrades {
	public static void main(String[] args) {
		SpringApplication.run(StudentGrades.class, args);
	}
}
