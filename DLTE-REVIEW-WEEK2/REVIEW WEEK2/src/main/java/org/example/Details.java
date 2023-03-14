package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
@Data
//@AllArgsConstructor
@NoArgsConstructor
//Registration Number, Name, Age, Email and permanent address having Street, City, State, Zip Code
public class Details implements Serializable {
    private Integer registration_number,age;
    private String name,email,address;
    //ArrayList<String> details=new ArrayList<String>();

    public Details(Integer registration_number, Integer age,  String name, String email, String address) {
        this.registration_number = registration_number;
        this.age = age;
        this.name = name;
        this.email = email;
        this.address = address;

    }

    @Override
    public String toString() {
        return "Details{" +
                "registration_number=" + registration_number +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
