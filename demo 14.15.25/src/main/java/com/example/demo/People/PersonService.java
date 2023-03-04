package com.example.demo.People;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class PersonService {


    public List<Person> GetPerson(){
        return List.of(new Person(1L,"Jon doe"));
    }

}
