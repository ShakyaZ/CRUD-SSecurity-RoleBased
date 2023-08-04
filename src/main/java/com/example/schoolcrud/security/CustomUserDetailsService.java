package com.example.schoolcrud.security;

import com.example.schoolcrud.entity.Student;
import com.example.schoolcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Student> student = studentRepository.findByUsername(username);
        student.orElseThrow(()-> new UsernameNotFoundException("not found"+username));
        return student.get();
    }

//    private List<SimpleGrantedAuthority> authorities(){
//        List<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<>();
//        grantedAuthorities.add(new SimpleGrantedAuthority("USER"));
//        return grantedAuthorities;
//    }
}
