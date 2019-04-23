package springboot2.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot2.demo.entity.Classes;
import springboot2.demo.service.ClassesService;

@RestController
public class ClassesController {

    @Autowired
    ClassesService classesService;

    @ResponseBody
    @RequestMapping("/getClass")
    public Classes get(Integer id){
        return classesService.get(id);
    }
}
