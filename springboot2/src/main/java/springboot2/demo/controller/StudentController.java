package springboot2.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot2.demo.entity.Student;
import springboot2.demo.service.StudentService;
import springboot2.demo.utli.ResponseCode;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @ResponseBody
    @RequestMapping("/get")
    public ResponseCode SeleteStudent(Integer id){
        ResponseCode code = ResponseCode.SUCCESS();
        Map data = code.getData();
        Student student = studentService.getStudent(id);
        data.put("student",student);
        return code;
    }
    @ResponseBody
    @RequestMapping("/getAll")
    public List<Student> hello(){
        System.out.println("来了老弟");
        return studentService.getAll();
    }
}
