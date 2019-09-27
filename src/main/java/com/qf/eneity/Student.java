package com.qf.eneity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)//开启链式编程
public class Student {
    private Integer id;
    private String name;
    private Integer age;
}
