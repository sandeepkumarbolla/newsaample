package io.amigos.studentSample.repository;

import io.amigos.studentSample.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
         Student sandeep = new Student(

                    "sandeep",
                    "sandeep@outlook.com",
                    LocalDate.of(2005,11,10)

            );
            Student sandeep_bolla = new Student(

                    "sandeep_bolla",
                    "sandeep.bolla@outlook.com",
                    LocalDate.of(1997,11,10)
            );

            repository.saveAll(
                    List.of(sandeep,sandeep_bolla)
            );
        };
    }
}
