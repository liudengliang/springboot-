package springboot2.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot2.demo.entity.Classes;
import springboot2.demo.mapper.ClassesMapper;

@Service
public class ClassesService {

    @Autowired
    ClassesMapper classesMapper;

    public Classes get(Integer id){
        return classesMapper.get(id);
    }

}
