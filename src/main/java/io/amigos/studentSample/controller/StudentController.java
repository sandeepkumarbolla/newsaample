package io.amigos.studentSample.controller;

import io.amigos.studentSample.model.Student;
import io.amigos.studentSample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController (StudentService studentService){
        this.studentService=studentService;
    }

    @RequestMapping
    public List<Student> getStudents(){
        return studentService.getStudents();

    }


    @PostMapping("/post")
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
    @DeleteMapping("/delete/{studentId}")
    public void deleteStudent(@PathVariable("studentId") long studentId){
        studentService.deleteStudent(studentId);
    }
}