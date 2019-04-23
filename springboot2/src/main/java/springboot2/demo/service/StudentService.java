package springboot2.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot2.demo.entity.Student;
import springboot2.demo.mapper.StudentMapper;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public Student getStudent(Integer id){
        return studentMapper.getStudent(id);
    }

    public List<Student> getAll() {
        return studentMapper.getAll();
    }
}
