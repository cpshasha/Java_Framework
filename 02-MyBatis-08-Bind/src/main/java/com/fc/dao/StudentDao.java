package com.fc.dao;

import com.fc.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface StudentDao {
    Student findById(Integer id);

    Student findByIdAndName(Integer id, String name);

    Student findByIdAndAge(Integer id, Integer age);

    Student findByNameAndAge(@Param("name") String name, @Param("age") Integer age);

    Student findByIdAndGender(Map<String, Object> map);

    int insert(Student student);
}
