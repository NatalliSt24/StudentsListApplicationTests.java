package com.example.studentsList;

import com.example.studentsList.Repository.StudentRepository;
import com.example.studentsList.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public abstract class StudentsListApplication implements CommandLineRunner {

	protected StudentsListApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentsListApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args){
		Student student1 = new Student("Robby", "Williams", "robw@gmail.com");
		 studentRepository.save(student1);

		 Student student2 = new Student("Rafael", "Nadal", "rafa@gmail.com");
		 studentRepository.save(student2);

		 Student student3 = new Student("Havi", "Alonso", "havi@gmail.com");
		 studentRepository.save(student3);



	}
}
