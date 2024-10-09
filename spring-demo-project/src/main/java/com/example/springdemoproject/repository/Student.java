package com.example.springdemoproject.repository;

import com.example.springdemoproject.ioc_example.Inter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

//ROW MAPPER ==> select * from student 결과의 한 행이 row
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private String desc;
    private Date createAt;
}
