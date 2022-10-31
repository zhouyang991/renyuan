package com.test.renyuan.entity;
import  lombok.*;


import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private Integer userid;
    private String name;
    private char sex;
    private Integer age;
    private String password;

 private  Dormitory dormitory;



}
