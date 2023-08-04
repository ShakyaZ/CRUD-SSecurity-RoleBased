package com.example.schoolcrud.controller;
import com.example.schoolcrud.entity.Student;
import com.example.schoolcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    List<Student> getStudents() {
        return studentService.getStudents();
    }
    @GetMapping("/students/{studentId}")
    Student getStudents(@PathVariable int studentId) {
        return studentService.getStudent(studentId);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return this.studentService.updateStudent(student);

    }

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable int studentId) {
      this.studentService.deleteStudent(studentId);
        System.out.println("deleted");

    }
//    @DeleteMapping("/students")
//    public void deleteAllStudent() {
//      this.studentService.deleteAllStudent();
//        System.out.println("All deleted");
//
//    }
}
