package springboot2.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot2.demo.entity.Student;
import springboot2.demo.mapper.StudentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    StudentMapper studentMapper;
    @Test
    public void contextLoads() {
        Student student = studentMapper.getStudent(1);
        System.out.println(student);
    }

}
