package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    //11位数字
    private String phone;

    private String sex;

    //18位的数字
    private String idNumber;

}
