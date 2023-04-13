package com.zhtian;

import com.zhtian.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ConfigApplicationTests {
    @Autowired
    Person person;  //将person自动注入进来

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
