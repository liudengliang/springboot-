package springboot2.demo.mapper;

import org.apache.ibatis.annotations.Param;
import springboot2.demo.entity.Student;

import java.util.List;

public interface StudentMapper {

    Student getStudent(Integer id);
    List<Student> getStudentByClass(@Param("id") Integer c_id);
    List<Student> getAll();
}
