package com.example.schoolcrud.service;
import com.example.schoolcrud.entity.Student;
//import com.example.schoolcrud.repository.AddressRepository;
import com.example.schoolcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
//    @Autowired
//    private AddressRepository addressRepository;

    public StudentServiceImpl() {
    }
    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(int studentId) {
        return studentRepository.findById(studentId).get();
    }
    @Override
    public Student addStudent(Student student) {
//        student.setAddressList(addressRepository.saveAll(student.getAddressList()));
//        Student save = studentRepository.save(student);
//       return studentRepository.findById(save.getId()).get();

        studentRepository.save(student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        //student.setAddressList(student.getAddressList());
        studentRepository.save(student);
        return student;
    }

    @Override
    public void deleteStudent(int studentId) {
        //studentRepository.deleteAll();
        Student deleteStudent = studentRepository.getReferenceById(studentId);
        studentRepository.delete(deleteStudent);
    }
}
